package com.Selenium_project_Infotek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookLoginLogOutUsingTestNg {
	public static WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ghimi\\eclipse-workspace\\Selenium\\bin\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@Test(priority=0)
	public void login() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("ghimireesmita547@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Esmita547@!");
		Thread.sleep(3000);
		driver.findElement(By.id("//*[@id='loginbutton']")).click();

	}
	
	@Test(priority=1)
	public void logOut() {
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]')]")).click();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	

}
