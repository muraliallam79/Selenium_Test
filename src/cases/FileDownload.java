package cases;

import java.util.HashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FileDownload {
	
	
	static WebDriver driver;
	
	public static void main(String [] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\New_Eclipse_Workspace\\Selenium\\Drivers\\chromedriver.exe");
		String download_FilePath = System.getProperty("user.dir")+"\\Reports";
		
		HashMap <String,Object> chromepref = new HashMap<String,Object>();
		chromepref.put("profile.default_content_settings", 0);
		chromepref.put("download.default_directory", download_FilePath);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromepref);
		
		
		
	
		
		driver = new ChromeDriver(options);
		driver.get("https://www.seleniumhq.org/download/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Download'])[2]")).click();
		
		Actions ac = new Actions(driver);
		
		
		
				
		
		
		
		
		
		
		
	}

}
