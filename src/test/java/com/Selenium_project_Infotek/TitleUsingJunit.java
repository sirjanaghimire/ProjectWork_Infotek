package com.Selenium_project_Infotek;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleUsingJunit {
	
	public static WebDriver driver;
	
	@Before
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
	
	@After 
	public void tearDown() {
		driver.close();
	}
	

}
