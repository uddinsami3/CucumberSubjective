package com.drill.pages.actions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.drill.base.SeleniumDriver;
import com.drill.pages.locators.RegisterPageLocators;


public class RegisterPageActions {
	public RegisterPageLocators registerPageLocators = null;

	public RegisterPageActions() {
		this.registerPageLocators = new RegisterPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), registerPageLocators);
	}

	public static void register(String firstName, String lastName, String phone, String email,
			String adress, String city, String state, String postalCode, String country, String userName, String pass)
			throws IOException, InterruptedException {

		RegisterPageActions registerPageActions = new RegisterPageActions();
		registerPageActions.registerPageLocators.firstName.sendKeys(firstName);
		registerPageActions.registerPageLocators.lastName.sendKeys(lastName);
		registerPageActions.registerPageLocators.city.sendKeys(city);
		registerPageActions.registerPageLocators.phone.sendKeys(phone);
		registerPageActions.registerPageLocators.email.sendKeys(email);
		registerPageActions.registerPageLocators.address.sendKeys(adress);
		registerPageActions.registerPageLocators.state.sendKeys(state);
		registerPageActions.registerPageLocators.postalCode.sendKeys(postalCode);
		Select select = new Select(registerPageActions.registerPageLocators.country);
		select.selectByVisibleText(country);
		registerPageActions.registerPageLocators.userName.sendKeys(userName);
		registerPageActions.registerPageLocators.pass.sendKeys(pass);
		registerPageActions.registerPageLocators.confirmPassword.sendKeys(pass);
	}
	public static void inputValuesInElement(WebElement element, String value) {
		try {
			element.clear();
			element.sendKeys(value);
		} catch (NoSuchElementException e) {
			e.getCause();
			e.printStackTrace();
			System.out.println(value + " couldnt be entered");
		}

	}
	public static void clickOnTheElement(WebElement element) {

		try {

			element.click();

		} catch (Exception e) {

			System.out.println("Couldnt be clicked");
		}

	}
	public static void waitForElementVisiblity(WebElement element) throws Exception {
		try {
			WebDriverWait wb = new WebDriverWait(SeleniumDriver.getDriver(), 30);
			wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Element couldnt be found");
		}
	}
	public static String getttingTextFromElement(WebElement element) {

		String s = element.getText();

		return s;

	}
	public static void mouseOver(WebElement element) {

		try {

			Actions ac = new Actions(SeleniumDriver.getDriver());
			ac.moveToElement(element);

		} catch (Exception e) {

			System.out.println("Not moved to element");
		}
	}
	
	public static void switchToFrame(WebElement element) {
		try {

			SeleniumDriver.getDriver().switchTo().frame(element);

		} catch (Exception e) {

			System.out.println("Frame couldnt be detected");
		}
		

	}
	public static void switchToDefaultContent() {
		try {

			SeleniumDriver.getDriver().switchTo().defaultContent();

		} catch (Exception e) {

			System.out.println("Couldnt switch to default content");
		}
		

	}
	public static void rightClickOnElement(WebElement element) {
		try {
			Actions ac = new Actions(SeleniumDriver.getDriver());
			ac.contextClick(element);
		} catch (Exception e) {
			System.out.println("Element couldnt be right clicked");
		}

	}
	public static void scrollUsingCoordinates(int width, int height) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
			js.executeScript("window.scrollBy(" + width + "," + height + ")");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}
	public static File takeScreenShot(String filename) throws Throwable {
		File des=null;
		try {
			TakesScreenshot ts = (TakesScreenshot) SeleniumDriver.getDriver();
			File temp = ts.getScreenshotAs(OutputType.FILE);
		 des = new File(
					"Screenshots/" + filename + ".png");
			FileUtils.copyFile(temp, des);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return des;

	}

}
