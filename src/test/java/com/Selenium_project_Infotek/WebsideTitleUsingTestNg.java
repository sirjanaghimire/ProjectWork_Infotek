package com.Selenium_project_Infotek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebsideTitleUsingTestNg {
public static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ghimi\\eclipse-workspace\\Selenium\\bin\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void checkTitle() {
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().equals("Facebook - Log In or Sign Up"));
		
	}
	
	@AfterTest 
	public void tearDown() {
		driver.close();
	}
	


}
