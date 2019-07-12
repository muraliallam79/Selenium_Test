package cases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class mukesh_Class {
	
	
	@Test
	public void loginTest()
	{
		ExtentHtmlReporter ehr = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\Reports\\testReport.html");
		ExtentReports er = new ExtentReports();
		er.attachReporter(ehr);
		
		ExtentTest et = er.createTest("FirstTest");
		et.log(Status.PASS, "First test case pass");
		er.flush();

		ExtentTest et2 = er.createTest("SecondTest");
		et2.log(Status.FAIL, "Second test case fail");
		er.flush();
		
	}

}
