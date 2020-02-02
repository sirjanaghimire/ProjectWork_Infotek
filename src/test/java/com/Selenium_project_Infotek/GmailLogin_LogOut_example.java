package com.Selenium_project_Infotek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin_LogOut_example {
	public static WebDriver driver ; 


	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver",
	 				"C:\\Users\\ghimi\\eclipse-workspace\\Selenium\\bin\\geckodriver.exe");

	          driver = new FirefoxDriver();
	          driver.get("https://gmail.com");
	          driver.findElement(By.name("identifier")).sendKeys("ghimireesmita547@gmail.com");
	          driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
	          Thread.sleep(3000);
	          driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Esmita547@!");
	          Thread.sleep(2000);
	          driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span")).click();
	          driver.close();
	          
	}


	
}
