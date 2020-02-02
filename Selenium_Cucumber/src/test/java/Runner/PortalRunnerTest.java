package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\ghimi\\eclipse-workspace\\Selenium_cucumber\\src\\test\\java\\Features\\TravelPortal.feature",
		glue= {"stepsDefination"},
		//dryRun=true (it will map between feature file and stepdefinition file you missed anything or not)
		dryRun=false,//(it execute the test)
		monochrome=true, //(it will display the output in a consol proper readable format.)
		//format= {"pretty","html:test-output"}
		plugin= {"pretty","json:json-output/cucumber.json"},//(plugin/format will used to generate the output file in different type of report.)
		strict=true //(it will check if any step is not define in step definition file.)
		)
public class PortalRunnerTest {

}
