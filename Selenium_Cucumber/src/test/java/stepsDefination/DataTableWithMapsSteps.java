package stepsDefination;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithMapsSteps {
	WebDriver driver;
	
	@Given("^user on the login page$")
	public void user_on_the_login_page(){
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ghimi\\eclipse-workspace\\Selenium\\bin\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
	   
	}

	@When("^Title of the login page is welcome mercury tour$")
	public void title_of_the_login_page_is_welcome_mercury_tour(){
		String expectedTitle1 = "Welcome: Mercury Tours";
		String actualTitle1 = driver.getTitle();
		Assert.assertEquals(expectedTitle1, actualTitle1);
	   
	}

	@And("^user hit the register link$")
	public void user_hit_the_register_link(){
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	    
	}

	@Then("^user get the register page$")
	public void user_allow_to_open_register_page(){
		WebElement e = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font"));
		System.out.println(e.getText());
		Assert.assertEquals("Contact Information", e.getText());
	}

	@And("^user enter the information firstname,lastname,state and postelcode$")
	public void user_enter_the_information_firstname_lastname_state_and_postelcode(DataTable credentials) throws InterruptedException{
		
	for(Map<String,String> Details:	credentials.asMaps(String.class, String.class)) {
		
		driver.findElement(By.name("firstName")).sendKeys(Details.get("firstname"));
		Thread.sleep(3000);
		driver.findElement(By.name("lastName")).sendKeys(Details.get("lastname"));
		Thread.sleep(2000);

		driver.findElement(By.name("state")).sendKeys(Details.get("state"));
		Thread.sleep(2000);

		driver.findElement(By.name("postalCode")).sendKeys(Details.get("postelcode"));
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.name("lastName")).clear();
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("postalCode")).clear();
	}
	    
	}

	@Then("^user click the submit button$")
	public void user_click_the_submit_button(){
		driver.findElement(By.name("register")).click();
	    
	}

	@Then("^conformation page should display as Register mercury tours$")
	public void conformation_page_should_display_as_Register_mercury_tours(){
		String expectedTitle="Register: Mercury Tours";
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("^close browser$")
	public void close_browser(){
	   driver.close();
	}



}
