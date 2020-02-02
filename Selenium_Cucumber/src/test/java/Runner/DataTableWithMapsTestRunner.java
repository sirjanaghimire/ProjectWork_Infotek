package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\ghimi\\eclipse-workspace\\Selenium_cucumber\\src\\test\\java\\Features\\DataTableWithMap.feature",
		glue = {"stepsDefination"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:DataTableMap/Maps-Output.xml","json:json-output/DataTableMaps-output.json"},
		strict=true,
		tags="@SmokeTest"
		)
public class DataTableWithMapsTestRunner {

}
