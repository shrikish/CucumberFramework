package com.qa.framework.StepDefinition;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucmberAllStepDefinition {
	
	@Given("I want to write a step with {}")
	public void getName(String name) {
		System.out.println("Given " + name);
	}
	
	@When("I check for the {} in step")
	public void getWhen(String value) {
		System.out.println("When " + value);
	}
	
    @Then("I verify the {} in step")
    public void getThen(String stat) {
    	System.out.println("Then "+stat);
    }
    
    @Given("I want to write a step with:")
    public void getListData(List<List<String>> dataTb) {
    	dataTb.forEach(System.out::println);
    }

}
