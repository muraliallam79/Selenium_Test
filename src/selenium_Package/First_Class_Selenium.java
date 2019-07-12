package selenium_Package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class First_Class_Selenium {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_Eclipse_Workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		String url = "https://www.goibibo.com/";
		driver.navigate().to(url);
		
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String element = "//input[@name='q']";
		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Departure']"));
		
		String value_ToEnter = "Thu, 16 May";
		
		textByJS( driver,ele,value_ToEnter);
		
		
		

	}
	
	
	public static void textByJS(WebDriver driver,WebElement ele,String value_ToEnter)
	{
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','Wed, 22 May');", ele);
		
	}
	
	
	public static void element_Highlight(WebDriver driver)
	{
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		//js.executeScript("arguments[0].style.backgroundColor='rgb(0,200,0)'", driver.findElement(By.xpath("//input[@name='q']")));
		//js.executeScript("arguments[1].style.backgroundColor='rgb(255,69,0)'", driver.findElement(By.xpath("//input[@name='q']")),driver.findElement(By.xpath("(//input[@aria-label='Google Search'])[1]")));
		  js.executeScript("arguments[1].style.backgroundColor='rgb(255,69,0)'",driver.findElement(By.xpath("(//input[@aria-label='Google Search'])[1]")),driver.findElement(By.xpath("//input[@name='q']")));
		
		
		
		
		
	}
	
	
	public void windowHandles(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		
		String parent_Window = driver.getWindowHandle();
		Set <String> col_Windows = driver.getWindowHandles();
		
		for(String wind:col_Windows)
		{
			
			if(!parent_Window.equals(wind))
			{
				driver.switchTo().window(wind);
				driver.close();
				
			}
			
			
		}
		
		
		Iterator<String> itr = col_Windows.iterator();
		while(itr.hasNext())
		{
			String child_Window = itr.next();
			if(!parent_Window.equals(child_Window))
			{
				driver.switchTo().window(child_Window);
			}
			
		}
		
	}

}
