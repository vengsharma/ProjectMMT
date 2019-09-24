package scripts;

import org.openqa.selenium.WebDriver;

public class MakeMyTrip {
	
	
	public void openMMT(WebDriver driver) {
		
		driver.get("https://www.makemytrip.com/");
		
	}

	public void start(WebDriver driver) {
		
		openMMT(driver);
		
	}

}
