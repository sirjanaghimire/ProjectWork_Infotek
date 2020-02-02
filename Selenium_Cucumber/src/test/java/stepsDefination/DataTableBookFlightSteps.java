package stepsDefination;

import java.util.List;

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

public class DataTableBookFlightSteps {
	WebDriver driver;

	@Given("^user already on the login page$")
	public void user_already_on_the_login_page() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ghimi\\eclipse-workspace\\Selenium\\bin\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");

	}

	@When("^Title of the login page is welcome mercury tours$")
	public void Title_of_the_login_page_is_welcome_mercury_tours() {
		String expectedTitle1 = "Welcome: Mercury Tours";
		String actualTitle1 = driver.getTitle();
		Assert.assertEquals(expectedTitle1, actualTitle1);
	}

	@And("^user click the register link$")
	public void user_click_the_register_links() {
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"))
				.click();

	}

	@And("^user should get register page$")
	public void user_should_get_register_page() {
		WebElement e = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font"));
		System.out.println(e.getText());
		Assert.assertEquals("Contact Information", e.getText());

	}

	@And("^user enter the firstname,lastname,state and postelcode$")
	public void user_enter_the_details(DataTable details) {
		 List<List<String>> value = details.raw();
		 
		driver.findElement(By.name("firstName")).sendKeys(value.get(0).get(0));
		driver.findElement(By.name("lastName")).sendKeys(value.get(0).get(1));
		driver.findElement(By.name("state")).sendKeys(value.get(0).get(2));
		driver.findElement(By.name("postalCode")).sendKeys(value.get(0).get(3));
		
	}

	@And("^user hit the submit button$")
	public void user_hit_enter() {
		driver.findElement(By.name("register")).click();

	}

	@Then("^conformation page should display as Register mercury tour$")
	public void conformation_page_display() {
		String expectedTitle="Register: Mercury Tours";
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);

	}
	@Then("^close the browser$")
	public void close_the_browser() {
		driver.close();
	}
}
