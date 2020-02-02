package com.Selenium_project_Infotek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BookFlight {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ghimi\\eclipse-workspace\\Selenium\\bin\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("a");
		driver.findElement(By.name("password")).sendKeys("a");
		driver.findElement(By.name("login")).click();

		Thread.sleep(3000);

		Select select = new Select(driver.findElement(By.name("passCount")));
		Thread.sleep(2000);
		select.selectByIndex(1);

		Select sel = new Select(driver.findElement(By.name("fromPort")));
		sel.selectByValue("New York");
		Thread.sleep(2000);

		Select month = new Select(driver.findElement(By.name("fromMonth")));
		month.selectByIndex(1);
		Thread.sleep(2000);

		Select date = new Select(driver.findElement(By.name("fromDay")));
		date.selectByIndex(2);
		Thread.sleep(2000);

		Select arivemonth = new Select(driver.findElement(By.name("toPort")));
		arivemonth.selectByValue("Sydney");
		Thread.sleep(2000);

		Select returnd = new Select(driver.findElement(By.name("toMonth")));
		returnd.selectByIndex(7);
		Thread.sleep(2000);

		Select da = new Select(driver.findElement(By.name("toDay")));
		da.selectByValue("22");

		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]"))
				.click();
		Thread.sleep(2000);

		Select lastse = new Select(driver.findElement(By.name("airline")));
		lastse.selectByIndex(1);
		driver.findElement(By.name("findFlights")).click();

	}

}
