package com.qa.framework.Pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		//System.out.println(src.getPath());
		File dest = new File("C:\\Users\\shrik\\eclipse-workspace\\CucumberUIFramework\\src\\test\\resources\\screenshots\\_" + ""  + new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss").format(new Date())+ ".jpg");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
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
	
	public void takeScreenshot() {
		
	}
}
