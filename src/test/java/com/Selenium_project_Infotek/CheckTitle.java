package com.Selenium_project_Infotek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckTitle {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ghimi\\eclipse-workspace\\Selenium\\bin\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
		System.out.println("the title is...");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
