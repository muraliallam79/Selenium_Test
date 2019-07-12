package utility;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.*;


public class ExtentReport_Class {
	
	
	
	public ExtentTest et;
	
	
	static String reportPath = System.getProperty("user.dir")+"\\Reports\\testReport.html";
	public static ExtentHtmlReporter ehr = new ExtentHtmlReporter(reportPath);
	public static ExtentReports er = new ExtentReports();
	
	public static  ExtentReports createReport()	
	{				
		 
		 er.attachReporter(ehr);	
		 return er;
	
	}
	
	public ExtentTest createTest_Method(String tcName)
	{
		et = er.createTest(tcName);
		
		return et;
	}
	
	
	
	
	
	
	
	
	

}
