package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Login {

	public static void main(String[] args) {
		//1.define the browser	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\atmakuri.saikishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
		//2. Open browser & Navigate to the URL 
	driver.get("https://www.flipkart.com/");
	 Actions action = new Actions(driver);
	 WebElement element = driver.findElement(By.id("id"));
	 action.click(element);
	 action.clickAndHold().perform();
	 Select dropdown = new Select(driver.findElement(By.id("")));
	 dropdown.selectByValue("");
	 
		//3.Enter credentials
	 
	driver.findElement(By.xpath("//div//input[@class='_2IX_2- VJZDxU']")).sendKeys("abcd@gmail.com");
	
	driver.findElement(By.xpath("//div//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("2345567888");
	 
		//4.Click on login
		
	driver.findElement(By.xpath("//div//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		//5.Confirmation
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	String message =	driver.findElement(By.xpath("//img[@title=\"Flipkart\"]")).getText();
	System.out.println(message);
	String pagetitle = driver.getTitle();
	System.out.println(pagetitle);
		
		//6.Close the browser
	driver.close();
	}

}
