package com.qa.framework.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.framework.Pages.DashboardPage;
import com.qa.framework.Pages.LoginPage;
import com.qa.framework.utilities.Browserstack_Connection;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {	
	WebDriver driver;
	public Scenario scenario;

	@Before
	public void launchBrowser() {
		String exeBrowser = null;
		try {
			exeBrowser = System.getProperty("browser");
		} catch (Exception e) {
			exeBrowser = "CHROME";
		}
		
		if(exeBrowser.equals("CHROME")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\test\\resources\\Webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			//driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("\n\n==============\n\nHashcode : " + driver.hashCode() + "\n\n==============\n\n");
		}
		else if(exeBrowser.equals("BS_CHROME")) {
			driver = Browserstack_Connection.BS_Connect();
		}
	}
	
	@Before
	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
		
	}

	@Given("I launch application")
	public void i_launch_application() {
		driver.get("https://demoqa.com/login");
	}

	@When("I input credentials")
	public void i_input_credentials() {
		LoginPage lp = new LoginPage(driver);
		lp.i_input_credentials();
	}
	
	@Then("I should be logged in")
	public void i_should_be_logged_in() {
		DashboardPage dp = new DashboardPage(driver);
		dp.userLoggedIn();
	}
	
	@Then("I can delete if a book is available")
	public void i_can_delete_if_a_book_is_available() {
		DashboardPage dp = new DashboardPage(driver);
		dp.deleteFirstBook();
	}
	
	@Then("I can logout")
	public void i_can_logout() {
		DashboardPage dp = new DashboardPage(driver);
		dp.LogOut();
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
	}
}
