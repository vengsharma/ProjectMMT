package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
	
	public WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\JARS\\chromedriver_win32_77\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		return driver;
		
	}

}
