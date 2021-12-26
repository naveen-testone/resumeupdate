package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)
//https://github.com/naveen-testone/resumeupdate.git
@CucumberOptions(
		features="src/test/java/features",glue="stepDefinitions")
public class TestRunner extends AbstractTestNGCucumberTests{

}