package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\ghimi\\eclipse-workspace\\Selenium_cucumber\\src\\test\\java\\Features\\BookFlightTestDataTable.feature",
		glue = {"stepsDefination"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:BookFlight-output","json:json-output/BookFlightoutput.json"},
		strict=true
		
		)
public class DataTableBookFlightTestRunner {

}
