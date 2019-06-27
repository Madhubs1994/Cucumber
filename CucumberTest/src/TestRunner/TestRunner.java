package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "E:\\Sample\\CucumberTest\\src\\Features",
		glue="StepDefinition"
			)
	

public class TestRunner {

	
}
