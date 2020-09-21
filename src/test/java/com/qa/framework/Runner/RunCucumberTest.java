package com.qa.framework.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(	
					plugin = {"pretty"},
					features = "src/test/resources/FeatureFiles",
					glue= {"com.qa.framework.StepDefinition"}
		)
public class RunCucumberTest {

}