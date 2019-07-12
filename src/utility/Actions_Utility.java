package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Actions_Utility {
	
	
	   public String screenShot_Fail(WebDriver driver,String tcname) throws IOException
	   {
		   
		    TakesScreenshot ts = (TakesScreenshot)driver;		    
		    File source = ts.getScreenshotAs(OutputType.FILE);
		    
		    String destination = System.getProperty("user.dir")+"\\Reports\\"+tcname+".png";
 		    File finalDestination = new File(destination);
 		    
		    FileUtils.copyFile(source, finalDestination);
		    return destination;
		   
		   
		   
	   }
	
	
	

	
	
	

}
