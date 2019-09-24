package runner;

import org.openqa.selenium.WebDriver;

import scripts.MakeMyTrip;
import utils.DriverUtils;

public class Runner {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws Throwable{
		
		DriverUtils du = new DriverUtils();
		
		driver = du.getDriver();
		
		Run();
		
	}

	public static void Run() throws Throwable{

		MakeMyTrip mmt = new MakeMyTrip();
		
		mmt.start(driver);

	}

}
