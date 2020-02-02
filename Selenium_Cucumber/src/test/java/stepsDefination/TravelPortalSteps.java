package stepsDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TravelPortalSteps {
	FirefoxDriver driver;
	@Given("^I am on the login page$")
	public void I_am_on_the_login_page() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ghimi\\eclipse-workspace\\Selenium\\bin\\geckodriver.exe");

		 driver = new FirefoxDriver();
		 driver.get("http://www.newtours.demoaut.com/");
			
	}
	
	@When("^title of login page is welcome mercury tours$")
	public void title_of_login_page_welcome_mercury_tours() {
		 String expectedTitle = "Welcome: Mercury Tours";
         String actualTitle = driver.getTitle();
         Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@And ("^user enters username and password$")
	public void user_enter_username_and_password() {
		driver.findElement(By.name("userName")).sendKeys("a");
		driver.findElement(By.name("password")).sendKeys("a");
		
	}
	
	@And("^user hit on the login button$")
	public void user_hit_on_the_login_button() {
		driver.findElement(By.name("login")).click();

	}
	
	@Then("^user should get find a Flight page$")
	public void user_should_get_find_a_flight_page() throws InterruptedException {
		Thread.sleep(3000);
		String expectedTitle="Find a Flight: Mercury Tours:";
		String actualTitle=driver.getTitle().trim();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		
  		driver.close();
  		
	}
}
