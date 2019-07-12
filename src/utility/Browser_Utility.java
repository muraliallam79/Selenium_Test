package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Utility {
	
	WebDriver driver;
	
		public WebDriver browser_Init() throws InterruptedException
		{
	
		 System.setProperty("webdriver.chrome.driver","E:\\New_Eclipse_Workspace\\Selenium\\Drivers\\chromedriver.exe");
		 
		 driver = new ChromeDriver();
		
		
		String url = "https://www.makemytrip.com/flights/";
		driver.navigate().to(url);
		
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		return driver;
		}

}
