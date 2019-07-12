package cases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages.MMT_LoginPage;
import utility.Browser_Utility;
import utility.ExtentReport_Class;

public class First_TestCase extends Browser_Utility{
	
	MMT_LoginPage mmt_LoginPage;
	static String tcName = "First_TestCase";	
	String screenPath = System.getProperty("user.dir")+"\\Reports";
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
		 WebDriver driver = browser_Init();
		 mmt_LoginPage = PageFactory.initElements(driver, MMT_LoginPage.class);	    	
    }
	
	
	@Test
	public void loginpage() throws InterruptedException, IOException
	{
		
		et = er.createTest(tcName);
		
		
		
		boolean bfholidays = mmt_LoginPage.holidays_Text.isDisplayed();
		if(bfholidays)
		{
			et.log(Status.PASS, "holidays link is visible");
			
			
		}
		else
		{
			et.log(Status.FAIL, "Holidays link is not available");
			et.addScreenCaptureFromPath(screenPath);
		}
		boolean bf_Trains = mmt_LoginPage.trains_Text.isDisplayed();
		if(bf_Trains)
		{
			et.log(Status.PASS, "trains link is visible");
		}
		else
		{
			et.log(Status.FAIL, "trains link is not available");
			et.addScreenCaptureFromPath(screenPath);
		}
		
		er.flush();
		
	
	}
	
	

	
	

	
	
	

}

