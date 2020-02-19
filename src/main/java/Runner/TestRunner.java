package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 
@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/Lipika/Desktop/Selenium/Work/VerivoxTestAutomationTask/src/main/java/Features/DSL.feature",
		glue= {"stepDefinitions"},
        plugin= {"pretty","html:test-output","junit:junit_xml/junit.xml"},
        monochrome= true,
        strict = true,
        dryRun = false
)
public class TestRunner {

}
