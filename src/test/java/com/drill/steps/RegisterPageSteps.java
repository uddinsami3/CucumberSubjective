package com.drill.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.drill.base.SeleniumDriver;
import com.drill.base.TestUtil;
import com.drill.pages.actions.RegisterPageActions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterPageSteps {
	@Given("^User navigates to \"([^\"]*)\"$")
    public void user_navigates_to_something(String strArg1) throws Throwable {
        //SeleniumDriver.openPage(strArg1);
        SeleniumDriver.getDriver().get(strArg1);
    }
	//getData(rowNum , firtName)
	//select firstName from sheet1 where rowNum=3
	@When("^user entered the registeration details$")
    public void user_entered_the_registeration_details() throws Throwable {
		RegisterPageActions registerPageActions = new RegisterPageActions();
		RegisterPageActions.inputValuesInElement(registerPageActions.registerPageLocators.firstName, "syed");
		RegisterPageActions.inputValuesInElement(registerPageActions.registerPageLocators.lastName, "naser");
		RegisterPageActions.inputValuesInElement(registerPageActions.registerPageLocators.city, "bidar");
		RegisterPageActions.inputValuesInElement(registerPageActions.registerPageLocators.phone, "123456789");
		RegisterPageActions.inputValuesInElement(registerPageActions.registerPageLocators.email, "naqeeb123");
		RegisterPageActions.inputValuesInElement(registerPageActions.registerPageLocators.address, "bidar");
		RegisterPageActions.inputValuesInElement(registerPageActions.registerPageLocators.state, "karnataka");
		RegisterPageActions.inputValuesInElement(registerPageActions.registerPageLocators.postalCode, "585401");
		Select select = new Select(registerPageActions.registerPageLocators.country);
		select.selectByVisibleText("INDIA");
		RegisterPageActions.inputValuesInElement(registerPageActions.registerPageLocators.userName, "naqeeb123");
		RegisterPageActions.inputValuesInElement(registerPageActions.registerPageLocators.pass, "naqeeb123");
		RegisterPageActions.inputValuesInElement(registerPageActions.registerPageLocators.confirmPassword, "naqeeb123");
		//RegisterPageActions.inputValuesInElement(registerPageActions.registerPageLocators.firstName, "naqeeb");
		//registerPageActions.register("syed", "naser", "1234567891", "someone@gmail.com", "bidar", "bidar", "karnataka", "2546477", "INDIA", "naser123", "naser1234");
    }

    @Then("^take screenshot of the entered details$")
    public void take_screenshot_of_the_entered_details() throws Throwable {
        TestUtil util = new TestUtil();
        util.captureScreenshot();
    }

    @And("^submit the user registerarion details$")
    public void submit_the_user_registerarion_details() throws Throwable {
    	SeleniumDriver.getDriver().findElement(By.xpath("//input[@name='submit']")).click();
    }

    @And("^verify if the \"([^\"]*)\" is registered succesfully$")
    public void verify_if_the_something_is_registered_succesfully(String user) throws Throwable {
        System.out.println();
        Assert.assertEquals("Note: Your user name is "+user+".",SeleniumDriver.getDriver().findElement(By.xpath("//b[text()=' Note: Your user name is "+user+".']")).getText());
    }
}
