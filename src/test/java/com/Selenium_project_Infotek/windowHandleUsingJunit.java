package com.Selenium_project_Infotek;

import java.util.Iterator;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowHandleUsingJunit {

	public static WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ghimi\\eclipse-workspace\\Selenium\\bin\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.get("http://automationpractice.com/index.php");
	}

	@Test
	public void windowHandle() {
		driver.findElement(By.xpath("//*[@id=\"social_block\"]/ul/li[1]")).click();
		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> itr = windowId.iterator();
		String ParentId = itr.next();
		String childId = itr.next();

		driver.switchTo().window(childId);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();

		driver.switchTo().window(ParentId);

		driver.findElement(By.xpath("//*[@id='footer']/div/section[2]/div/div/ul/li/a")).click();
	}

	@After
	public void tearDown() {
		driver.close();
	}

}
