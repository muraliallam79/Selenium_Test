package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class MMT_LoginPage {
	
	
	
	@FindBy(xpath="//span[text()='Hotels']")
	public 
	WebElement hotels_Text;
	
	@FindBy(xpath="//span[text()='Holidays']") 
	public WebElement holidays_Text;
	
	@FindBy(xpath="//span[text()='Trains']") 
	public WebElement trains_Text;
	
	@FindBy(xpath="//span[text()='Buse']") 
	public WebElement buses_Text;
	
	@FindBy(xpath="//span[text()='Cabs']") 
	public WebElement cabs_Text;
	
	@FindBy(xpath="//span[text()='Visa']") 
	public WebElement visa_Text;
	
	
	@FindBy(xpath="//span[text()='Giftcards']") 
	public WebElement giftcards_Text;
	
	
//	public AA_LoginPage(WebDriver driver)
//	{
//		PageFactory.initElements(driver, this);		
//		
//	}
	
	
//	public void login_Application(ExtentTest et1,ExtentReports etrs) throws InterruptedException
//	{
//
//		//boolean bft_Hotels = hotels_Text.isDisplayed();	
//		
//
//		Assert.assertTrue(hotels_Text.isDisplayed());
//		et1.log(Status.PASS, "hotels link is visible");
//		
//		
//		boolean bfholidays = holidays_Text.isDisplayed();
//		if(bfholidays)
//		{
//			et1.log(Status.PASS, "holidays link is visible");
//		}
//		boolean bf_Trains = trains_Text.isDisplayed();
//		if(bf_Trains)
//		{
//			et1.log(Status.PASS, "trains link is visible");
//		}
//		
//		
//		etrs.flush();
//		
//		
//		
//		
//		
//		
//	}
//	
	
//	public void second_Test(ExtentTest et2,ExtentReports etrs) throws InterruptedException
//	{
//
//		boolean bus = buses_Text.isDisplayed();	
//		if(bus)
//		{
//			et2.log(Status.PASS, "bus link is visible");
//		}
//		
//		boolean cabs = cabs_Text.isDisplayed();
//		if(cabs)
//		{
//			et2.log(Status.PASS, "cabs link is visible");
//		}
//		
//		etrs.flush();
//		
//	}
	
	
	public void third_Test(ExtentTest et3,ExtentReports etrs) throws InterruptedException
	{

		boolean visa = visa_Text.isDisplayed();		
		if(visa)
		{
			et3.log(Status.PASS, "visa link is visible");
		}
		boolean giftcards  = giftcards_Text.isDisplayed();
		if(giftcards)
		{
			et3.log(Status.PASS, "giftcards link is visible");
		}
		
		etrs.flush();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
