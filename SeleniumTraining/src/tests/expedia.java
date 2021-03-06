package tests;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class expedia {
	WebDriver driver;
	String browserType = "chrome";
	String url = "https://www.expedia.co.in/";
	String city = "New York";
//	String checkIn = "10 Jan 2021";
//	String checkOut = "12/01/2021";
	
	@Test
	public void hotelReservation() {
	
		//1.search 
//		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@aria-label=\"Going to\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Where are you going?\"]")).sendKeys(city);
		driver.findElement(By.xpath("//li[@data-index=\"0\"]")).click();
//		WebElement date = driver.findElement(By.xpath("//button[@data-name=\"d1\"]"));
//		date.click();
//		String chckindate[] = (checkIn).split("/");
//		driver.findElement(By.xpath("//div[@class=\"uitk-new-date-picker-month\" and contains(text(),checkIn]")).click();
//		if(chckindate[2].equals("2021")) {
//			System.out.println("current year");
//		}
		driver.findElement(By.id("d1-btn")).click();
		driver.findElement(By.xpath("//button[@data-day=\"21\"]")).click();
		driver.findElement(By.xpath("//button[@data-day=\"23\"]")).click();
		driver.findElement(By.xpath("//button[@data-stid=\"apply-date-picker\"]")).click();
		driver.findElement(By.xpath("//button[@data-testid=\"travelers-field-trigger\"]")).click();
		driver.findElement(By.xpath("//button[@data-testid=\"guests-done-button\"]")).click();
		
		driver.findElement(By.xpath("//button[@data-testid=\"submit-button\"]")).click();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Code to copy the screenshot in the desired location
		Object FileUtils;
//		FileUtils.copyFile(scrFile, new File("C:\\CaptureScreenshot\\google.jpg"));
		String name1 = driver.getWindowHandle();
		Set<String> name = driver.getWindowHandles();
		driver.switchTo().window(name1);
		
		
		//2.Modify the search result page, given criteria
		
		
	}
	@BeforeMethod
	public void setUp() {
		driver = utilities.driverFactory.open(browserType);
		driver.get(url);
	}
	@AfterMethod
	public void tearDown() {
		//driver.close();
	}
}
