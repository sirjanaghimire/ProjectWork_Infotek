package com.newtours.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtoursExample.qa.Base.TestBase;

//we need to define object repository.
//  we need to define page Factory - OR
// use @FindBy annotation.
public class LoginPage extends TestBase {
	
	@FindBy(name="userName")
	WebElement UserName;
	
	@FindBy(name= "password")
	WebElement passwords;
	
	@FindBy(name= "login")
	WebElement signInButton;
	

	// initializing the page objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	// Action.
	public static  String ValiDateLoginPageTitle() {
		
		return driver.getTitle();
		
		
		
	}
	
	public   HomePage  login(String un, String pwd) {
		UserName.sendKeys(un);
		passwords.sendKeys(pwd);
		System.out.println("Before clicking ..............................................");
		signInButton.click();
		System.out.println("after .... clicking ..............................................");

		return new HomePage();
		
	}
	
	
	

}

