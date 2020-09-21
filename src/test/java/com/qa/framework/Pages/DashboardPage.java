package com.qa.framework.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	@FindBy(id = "userName-value")
	WebElement eleUserName;
	
	@FindBy(xpath = "//*[@class='rt-table']//div[@class='rt-tbody']/div/div/div[5]/div/span")
	WebElement eleDeleteFirstBook;
	
	@FindBy(css = "#submit")
	WebElement eleLogOut;
	
	public DashboardPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void userLoggedIn() {
		String strUserName = eleUserName.getText();
		Assert.assertTrue("UserName does not match", strUserName.equalsIgnoreCase("toolsqa"));
	}
	
	public void deleteFirstBook() {
		eleDeleteFirstBook.click();
	}
	
	public void LogOut() {
		eleLogOut.click();
	}
}
