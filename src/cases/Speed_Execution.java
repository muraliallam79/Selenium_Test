package cases;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Speed_Execution {

	public static void main(String[] args) {
		

		 System.setProperty("webdriver.chrome.driver","E:\\New_Eclipse_Workspace\\Selenium\\Drivers\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		 //disable_Images(options);
		 
		 WebDriver driver = new ChromeDriver(options);
		 driver.get("https://www.google.com/");
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 //List<WebElement> we = (List<WebElement>) js.executeScript("return document.getElementsByName('q')");
		 
		 WebElement we = (WebElement)js.executeScript("return document.getElementsByName('q')[0]");
		 we.sendKeys("selenium");
		 
		 //we.get(0).sendKeys("selenium");
		
		

	}
	
	
	
	public static void disable_Images(ChromeOptions options)
	{
		
		HashMap<String,Object> images56 = new HashMap<String,Object>();
		images56.put("images", 2);
		//images56.put("links", 2);
		
		HashMap <String,Object> preferencess = new HashMap<String,Object>();
		preferencess.put("profile.default_content_setting_values", images56);
		
		options.setExperimentalOption("prefs", preferencess);
		
		
	}

}
