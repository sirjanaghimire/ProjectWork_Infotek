package com.newtours.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtoursExample.qa.Base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font")
	WebElement DetailLable;

	@FindBy(xpath = "//a[contains(text(),\"ITINERARY\")]")
	WebElement ItineraryLink;

	
// initializing the page object
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean ValidateHomePageTextTest() {
		return DetailLable.isDisplayed();

	}

	public ItineraryLinks ClickOnLinks() {
		ItineraryLink.click();
		return new ItineraryLinks();
	}

}