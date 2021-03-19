package com.Test.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Test.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\atmakuri.saikishor\\eclipse-workspace\\Kishore\\MavenTest\\src\\main\\java\\com\\Test\\qa\\config\\config.properties");
		prop.load(ip);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static void intialization() {
	String browserName =prop.getProperty("browser");
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\atmakuri.saikishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}else if(browserName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\atmakuri.saikishor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new FirefoxDriver();
	}
	String url= prop.getProperty("url");
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_tiemout, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_wait,TimeUnit.SECONDS);
	
	}
	
	
	
	
	
	
}
