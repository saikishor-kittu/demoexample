package demopackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestNG {
	String Driverpath = System.setProperty("webdriver.chrome.driver","C:\\Users\\atmakuri.saikishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
	public WebDriver driver = new ChromeDriver(); 
  @Test
  public void flipkart() { 
	System.out.print("Test");
  }
  @BeforeTest
  public void Login() { 
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	  driver.findElement(By.xpath("//div//input[@class='_2IX_2- VJZDxU']")).sendKeys("123456789");

}
@AfterTest
public void logout() {
	driver.close();
}
}
