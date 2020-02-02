package com.Selenium_project_Infotek;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutUsingJunit {
	public static WebDriver driver;

	@Before
	public void SetUp() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ghimi\\eclipse-workspace\\Selenium\\bin\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");

	}

	@Test
	public void Login() throws InterruptedException {
		driver.findElement(By.name("userName")).sendKeys("a");
		driver.findElement(By.name("password")).sendKeys("a");
		driver.findElement(By.name("login")).click();

		Thread.sleep(3000);

	}

	@Test
	public void LogOut() {
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"))
				.click();

	}

	@After
	public void tearDown() {
		driver.close();
	}

}