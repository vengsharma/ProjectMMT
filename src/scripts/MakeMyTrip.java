package scripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class MakeMyTrip {
	
	
	public void openMMT(WebDriver driver) {
		
		driver.get("https://www.makemytrip.com/");
		
	}

	public void start(WebDriver driver) throws Throwable{
		
		openMMT(driver);
		
		findFlights(driver);
		
		//end(driver);
		
	}

	private void end(WebDriver driver) {

		driver.quit();
		
	}

	private void findFlights(WebDriver driver) throws Throwable{

		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Hyderabad");
		
		String insertedFromText = driver.findElement(By.xpath("//input[@placeholder='From']")).getAttribute("value");
		
		System.out.println(insertedFromText);
		
		//Thread.sleep(1000);
		
		if(insertedFromText.equalsIgnoreCase("Hyderabad"))
			System.out.println("insertion is good");
		
		driver.findElement(By.xpath("//div[text()='HYD']")).click();
		//Selecting To city
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='toCity']")));
		driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("Chennai");
		//driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Chennai");
		
		//String insertedToText = driver.findElement(By.xpath("//input[@placeholder='To']")).getAttribute("value");
		
		//System.out.println(insertedToText);
		driver.findElement(By.xpath("//div[text()='MAA']")).click();
		
		//verify departure date
		//String deptDate = driver.findElement(By.xpath("//input[@id='departure']")).getAttribute("value");
        //System.out.println(deptDate);
        //Date D = new Date();
	    //String sysDate = D.
		
		
		//Click Search
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		
	}
	
	

}
