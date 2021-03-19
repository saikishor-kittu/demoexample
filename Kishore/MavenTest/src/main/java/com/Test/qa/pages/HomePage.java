package com.Test.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Test.qa.base.TestBase;

public class HomePage extends TestBase {

	//Pagefactory
	
	@FindBy(xpath = "//span[@class='text' and contains(text(),'Inbox')]")
	WebElement Inbox;
	
	@FindBy(xpath = "//span[@class='text' and contains(text(),'New Case')]")
	WebElement NewCase;
	
	@FindBy(xpath= "//input[@name=\"menuQuery\"]")
	WebElement SearchCase;
	
	@FindBy(xpath="//span[@class='text' and contains(text(),'Admin')]")
	WebElement Admin;
	
	@FindBy(xpath = "//span[@class=\"bz-wp-avatar-label\"]")
	WebElement Label;
	
	//Intializing the PageObject
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	//Actions
	public String validateHomePage() {
		return driver.getTitle();
	}
	
	public boolean validateBizagiLabel() {
		return Label.isDisplayed();
	}
	
	public void enterSearchText(String SearchText) {
		SearchCase.sendKeys(SearchText);
		SearchCase.sendKeys(Keys.ENTER);
	}
	
}
