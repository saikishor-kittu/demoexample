package com.practice.MavenTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleSeleniumTest {

	String Driverpath = System.setProperty("webdriver.chrome.driver","C:\\Users\\atmakuri.saikishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
	public WebDriver driver = new ChromeDriver(); 
	
	@BeforeClass
	public void beforeclass() {
		String url = "https://www.flipkart.com/" ;
		driver.get(url);
			Assert.assertEquals(url, "https://www.flipkart.com/", "Correct");
			System.out.print("Flipkart launched successufully"+'\n');
	}
	@Test(groups ={"regression"})
	public void Login () {
		
	driver.findElement(By.xpath("//div//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("12345678");
	driver.findElement(By.xpath("//div//input[@type='password']")).sendKeys("abcddeg");
	driver.findElement(By.xpath("//div//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	String Email_err = driver.findElement(By.xpath("//div[@class=\"IiD88i _351hSN undefined\"]//span//span")).getText();
	
	System.out.print("Error message:"+'\t' + Email_err +'\n');
	Assert.assertEquals(Email_err, "Please enter valid Email ID/Mobile number", "Invalid Email");
	
	}
	@AfterClass
	public void afterclass() {
	driver.quit();
}
}

