package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features"},
glue={"StepDefinition"},
monochrome=true,
dryRun=false,
plugin={"html:Report/abc.html",
		"pretty:Report/xyz.pdf",
		"pretty:Report/xyz.txt"}
)
public class TestRunner {

}
