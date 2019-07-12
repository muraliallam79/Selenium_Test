package singleton_Package;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
		DriverInit int_Driver = DriverInit.getInstance();
		 driver = int_Driver.openBrowser();
		
		
	}
	

	 @Test
	 public void testMethod()
	 {
		 driver.get("https://www.google.com/");
		 System.out.println(driver.getTitle());
		 
		
		 
		 
	 }
}
