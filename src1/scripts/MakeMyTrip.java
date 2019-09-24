package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MakeMyTrip {
	
	
	public void openMMT(WebDriver driver) {
		
		driver.get("https://www.makemytrip.com/");
		
	}

	public void start(WebDriver driver) throws Throwable{
		
		openMMT(driver);
		
		findFlights(driver);
		
		end(driver);
		
	}

	private void end(WebDriver driver) {

		driver.quit();
		
	}

	private void findFlights(WebDriver driver) throws Throwable{

		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Hyderabad");
		
		String insertedText = driver.findElement(By.xpath("//input[@placeholder='From']")).getAttribute("value");
		
		System.out.println(insertedText);
		
		//Thread.sleep(1000);
		
		if(insertedText.equalsIgnoreCase("Hyderabad"))
			System.out.println("insertion is good");
		
	}

}
