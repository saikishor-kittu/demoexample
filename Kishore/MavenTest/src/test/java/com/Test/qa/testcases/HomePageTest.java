package com.Test.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Test.qa.base.TestBase;
import com.Test.qa.pages.HomePage;





public class HomePageTest extends TestBase{
	HomePage homePage;
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		 homePage = new HomePage();	
	}
	@Test(priority =0)
	public void homePageTitleTest() {
		String title = homePage.validateHomePage();
		Assert.assertEquals(title, "Bizagi BPM");
	}
	@Test(priority =1)
	public void homePageLabelTest() {
		boolean flag= homePage.validateBizagiLabel();
		Assert.assertTrue(flag);
	}
	@Test(priority =2)
	public void searchTest() {
		homePage.enterSearchText("SSA132");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
}
