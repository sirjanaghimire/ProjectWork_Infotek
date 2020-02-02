package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\ghimi\\eclipse-workspace\\Selenium_cucumber\\src\\test\\java\\Features\\Login.feature",
		glue= {"stepsDefination"}
//		format= {"pretty","html:test-outout"}
		
		)

public class RunnerTest {

}
