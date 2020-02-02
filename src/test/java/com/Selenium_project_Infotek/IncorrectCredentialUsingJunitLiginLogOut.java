package com.Selenium_project_Infotek;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IncorrectCredentialUsingJunitLiginLogOut {
	public static WebDriver driver;

	@Before
	public void SetUp() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ghimi\\eclipse-workspace\\Selenium\\bin\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.get("https://gmail.com");

	}

	@Test
	public void LoginIncorrect() throws InterruptedException {
		driver.findElement(By.name("identifier")).sendKeys("esmita123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("lalita12451@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span")).click();

	}


	@After
	public void tearDown() {
		driver.close();


}
}
