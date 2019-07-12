package cases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;

import pages.MMT_LoginPage;
import utility.Actions_Utility;
import utility.Browser_Utility;
import utility.ExtentReport_Class;


public class Second_TestCase extends Browser_Utility{
	

	MMT_LoginPage mmt_LoginPage;
	Actions_Utility actions_Utility = new Actions_Utility();
	static String tcName = "Second_TestCase";	
	
	WebDriver driver;
	ExtentReports er ;
	ExtentTest et;

	
	@BeforeSuite
	public void init_ExtentReport()
	{
		
		er = ExtentReport_Class.createReport();
	}
	
    @BeforeTest
    public void b4Test() throws InterruptedException
    {
		  driver = browser_Init();
		 mmt_LoginPage = PageFactory.initElements(driver, MMT_LoginPage.class);	
    	
    }
	
	
	@Test(retryAnalyzer = analyser.RetryAnalyser.class)
	public void secondTest() throws InterruptedException, IOException
	{
		

		et = er.createTest(tcName);
		
		try {
			
			//Assert.assertEquals(true, false);
		
		boolean bus = mmt_LoginPage.buses_Text.isDisplayed();	
		if(bus)
		{
			et.log(Status.PASS, "bus link is visible");
			//Assert.assertEquals(true, false);
		}
		else
		{
			et.log(Status.FAIL, "bus link is not available");
		    
			
		} 
		
		boolean cabs = mmt_LoginPage.cabs_Text.isDisplayed();
		if(cabs)
		{
			et.log(Status.PASS, "cabs link is visible");
			
		}
		else
		{
			et.log(Status.FAIL, "cabs link is not available");
			
		}
		
		
		er.flush();
		}
		catch(Exception e)
		{
			et.log(Status.FAIL, "bus link is not available");		
			String file_Dest = actions_Utility.screenShot_Fail( driver,tcName);
			//et.log(Status.FAIL, "ScreenShot "+et.addScreenCaptureFromPath(file_Dest));
			et.fail(tcName+et.addScreenCaptureFromPath(file_Dest));
			
			er.flush();
		}
		
	}
	
	@AfterMethod
	public void finaltest(ITestResult itest)
	{
		
		
		//et.log(Status.FAIL, itest.getStatus());
	}


}
