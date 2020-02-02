package com.Selenium_project_Infotek;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandleExample {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ghimi\\eclipse-workspace\\Selenium\\bin\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.get("http://automationpractice.com/index.php");
		// click the youtube link
		driver.findElement(By.xpath("//*[@id='social_block']/ul/li[3]")).click();

		// here we will get all window id's
		Set<String> windowId = driver.getWindowHandles();

		// in set method we dont have get method thats why we use Iterator.
		Iterator<String> itr = windowId.iterator();
		String ParentId = itr.next();
		String childId = itr.next();

		// switch to youtube window
		// without switching to child window, we can not work on child window object.
		driver.switchTo().window(childId);

		// just sleep for 3 second to see how new window is opening.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// close the youtube window.
		driver.close();

		// switch to Parent application window.
		// without switching to child window, we can not work on child window object.
		driver.switchTo().window(ParentId);

		driver.findElement(By.xpath("//*[@id='footer']/div/section[2]/div/div/ul/li/a")).click();

	}

}
