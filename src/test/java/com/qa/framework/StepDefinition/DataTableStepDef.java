package com.qa.framework.StepDefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableStepDef {
	@Given("I want to write a step")
	public void i_want_to_write_a_step(DataTable dt) {
		List<Map<String, String>> lst = dt.asMaps();
		System.out.println(lst.size());
//		lst.get(1).forEach((key, value) -> System.out.println(key + ":" + value));
		
		lst.forEach(mp -> mp.forEach((key, value) -> 
											{
												System.out.println(key + ":" + value);
												if(key.contains("st"))
													System.out.println("\t" + key + " is vowel\n");
												else
													System.out.println("\t" + key + " is not vowel\n");
												
											}));
	}




	@When("I check for value")
	public void i_check_for_value() {
	    // Write code here that turns the phrase above into concrete actions
	}




	@Then("I verify the step")
	public void i_verify_the_step() {
	    // Write code here that turns the phrase above into concrete actions
	}
}
