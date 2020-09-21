package com.qa.framework.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(css = "#userName")
	WebElement eleUserName;
	
	@FindBy(css = "#password")
	WebElement elePassword;
	
	@FindBy(id = "login")
	WebElement btnSubmit;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void i_input_credentials() {
		eleUserName.sendKeys("toolsqa");
		elePassword.sendKeys("Toolsqa@2020");
		btnSubmit.click();
	}
}
