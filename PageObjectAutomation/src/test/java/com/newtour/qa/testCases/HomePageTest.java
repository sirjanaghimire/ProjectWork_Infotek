package com.newtour.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.newtours.qa.pages.HomePage;
import com.newtours.qa.pages.LoginPage;
import com.newtoursExample.qa.Base.TestBase;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	public HomePageTest() {
		super();
	}

	@BeforeTest

	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		 homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority=1)
	public void HomePageTitleTest() throws InterruptedException {
		Thread.sleep(3000);

		 Assert.assertTrue(homePage.ValidateHomePageTextTest());
	}
	@Test(priority=2)
	public void LinksExample() {
		homePage.ClickOnLinks();
		
	}
	@AfterTest
	public void TearDown() {
		driver.close();
	}
}
