package com.newtour.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.newtours.qa.pages.HomePage;
import com.newtours.qa.pages.LoginPage;
import com.newtoursExample.qa.Base.TestBase;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeTest
	public void setUo() {
		initialization();
		 loginPage = new LoginPage();
		}

	@Test (priority=1)
	public void LoginPageTitleTest() {
		String title=LoginPage.ValiDateLoginPageTitle();
		Assert.assertEquals(title, "Welcome: Mercury Tours");
		
	}
	@Test (priority=2)
	public void LoginTest() {
	 homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterTest
	public void tearDowm() {
		driver.quit();
	}
	
}
