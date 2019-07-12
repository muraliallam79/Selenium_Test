package cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import junit.framework.Assert;
import pages.MMT_LoginPage;
import utility.Browser_Utility;
import utility.ExtentReport_Class;

public class Third_TestCase extends Browser_Utility{
	
	

    
	
	
	//@Test(retryAnalyzer = analyser.RetryAnalyser.class)
	@Test
	public void thirdTest() throws InterruptedException
	{
		
		try {
		
			
			
			
		Assert.assertEquals(true, false);
		}
		catch(Exception e)
		{
			System.out.println("test case fails");
		}
		
		
		
		
	}

}
