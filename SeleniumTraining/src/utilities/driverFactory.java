package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverFactory {

	//This method will return the webdriver objects
	
	public static WebDriver open(String browserType) {
		if(browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\atmakuri.saikishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
			return new ChromeDriver();
		}
		else {
			System.out.println("Nothing");
			return null;
			
		}
	}

}
