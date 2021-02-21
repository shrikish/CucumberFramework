package com.qa.framework.Pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		//System.out.println(src.getPath());
		File dest = new File("C:\\Users\\shrik\\eclipse-workspace\\CucumberUIFramework\\src\\test\\resources\\screenshots\\snap_" + new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss").format(new Date()) + ".jpg");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		PageFactory.initElements(driver, this);
	}
	
	public void i_input_credentials() {
		eleUserName.sendKeys("toolsqa");
		elePassword.sendKeys("Toolsqa@2020");
		btnSubmit.click();
	}
}
