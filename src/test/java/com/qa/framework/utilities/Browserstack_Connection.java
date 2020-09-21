package com.qa.framework.utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browserstack_Connection {

	public static WebDriver BS_Connect() {
		String strUserName = System.getProperty("userName"),
				strAutomateKey = System.getProperty("password"),
				strURL = "https://" + strUserName + ":" + strAutomateKey + "@hub-cloud.browserstack.com/wd/hub";
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		caps.setCapability(CapabilityType.PLATFORM_NAME, "Windows");
		caps.setCapability(CapabilityType.APPLICATION_NAME, "CucumberTestRun");
		
		try {
			return new RemoteWebDriver(new URL(strURL), caps);
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
