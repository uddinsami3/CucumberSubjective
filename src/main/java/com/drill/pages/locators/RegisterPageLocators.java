package com.drill.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPageLocators {
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	public WebElement firstName;
	
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	public WebElement lastName;
	
	@FindBy(how=How.XPATH,using="//input[@name='phone']")
	public WebElement phone;
	
	@FindBy(how=How.XPATH,using="//input[@id='userName']")
	public WebElement email;
	
	@FindBy(how=How.XPATH,using="//input[@name='address1']")
	public WebElement address;

	@FindBy(how=How.XPATH,using="//input[@name='city']")
	public WebElement city;
	
	@FindBy(how=How.XPATH,using="//input[@name='state']")
	public WebElement state;
	
	@FindBy(how=How.XPATH,using="//input[@name='postalCode']")
	public WebElement postalCode;
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	public WebElement userName;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	public WebElement pass;
	
	@FindBy(how=How.XPATH,using="//input[@name='confirmPassword']")
	public WebElement confirmPassword;
	
	@FindBy(how=How.XPATH,using="//select[@name='country']")
	public WebElement country;
}
