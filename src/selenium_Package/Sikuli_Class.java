package selenium_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class Sikuli_Class {

	public static void main(String[] args) throws InterruptedException, FindFailed, ClassNotFoundException {
	
		//Class.forName("org.sikuli.script.Screen");
		Screen sc = new Screen();
		Pattern pt = new Pattern("C:\\Users\\todea\\Desktop\\images\\gmaillogo.PNG");
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_Eclipse_Workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Google.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		

		
		sc.click(pt);
		
		

	}

}
