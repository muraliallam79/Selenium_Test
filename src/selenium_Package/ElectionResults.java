package selenium_Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElectionResults {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_Eclipse_Workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://results.eci.gov.in/ac/en/constituencywise/ConstituencywiseS011.htm");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		


		
		

		
		
		
		File file = new File("C:\\Users\\todea\\Desktop\\Results.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);		 
		
		Sheet sheet = workbook.getSheet("ResultSheet");
		
		System.out.println("");
		
try {
		//for(int i = 1;i<=const_Values.size();i++)
		for(int i = 1;i<=175;i++)
		{
			
			
			WebElement const_DropDown = driver.findElement(By.xpath("//select[@id='ddlAC']"));			
			Select constituency_DropDown = new Select(const_DropDown);			
			List <WebElement> const_Values = constituency_DropDown.getOptions();
			//Thread.sleep(500);
			
			System.out.println(const_Values.get(i).getText());
			String const_Value = const_Values.get(i).getText();
			constituency_DropDown.selectByVisibleText(const_Value);
			Thread.sleep(1000);
			

			
			Row row = sheet.createRow(i);
			
			
			// TDP votes
			String val_TDP_TotalVotes = driver.findElement(By.xpath("//td[contains(text(),'Telugu Desam')]//following-sibling::td[3]")).getText();			
			Cell cell1 = row.createCell(0);
			cell1.setCellValue(val_TDP_TotalVotes);
			
			
			// JS votes
			String val_JS_TotalVotes = "";
			try {
			 val_JS_TotalVotes = driver.findElement(By.xpath("//td[contains(text(),'Janasena Party')]//following-sibling::td[3]")).getText();
			
			Cell cell2 = row.createCell(1);
			cell2.setCellValue(val_JS_TotalVotes);
			}
			catch(Exception e)
			{   
				try{
					val_JS_TotalVotes = driver.findElement(By.xpath("//td[contains(text(),'Communist Party of India')]//following-sibling::td[3]")).getText();				
					Cell cell2 = row.createCell(1);
					cell2.setCellValue(val_JS_TotalVotes);
				   }
				catch(Exception y)
				{
					Cell cell2 = row.createCell(1);
					val_JS_TotalVotes = "0";
					cell2.setCellValue("0");					
				}
				
			}
			
			
			
			
			// YCP votes
			String val_YSR_TotalVotes = driver.findElement(By.xpath("//td[contains(text(),'Yuvajana Sramika Rythu Congress Party')]//following-sibling::td[3]")).getText();			
			Cell cell3 = row.createCell(2);
			cell3.setCellValue(val_YSR_TotalVotes);
			
			
			int tdpVotes = Integer.parseInt(val_TDP_TotalVotes);
			int jsVotes = Integer.parseInt(val_JS_TotalVotes);
			int ycpVotes  = Integer.parseInt(val_YSR_TotalVotes);
			
			int allianceVotes = tdpVotes + jsVotes;
			
			int tdp_JS = tdpVotes + jsVotes;		
			Cell cell4 = row.createCell(3);
			cell4.setCellValue(Integer.toString(tdp_JS));
			
			
			Cell cell8 = row.createCell(7);
			
			
			if(tdpVotes > jsVotes && tdpVotes > ycpVotes )
			{
				Cell cell5 = row.createCell(4);
				cell5.setCellValue("TDP");				
				String tdpmla_Name = driver.findElement(By.xpath("//td[contains(text(),'Telugu Desam')]//preceding-sibling::td[1]")).getText();
				cell8.setCellValue(tdpmla_Name);
				
			}
			else if(jsVotes > tdpVotes && jsVotes > ycpVotes )
			{
				Cell cell5 = row.createCell(4);
				cell5.setCellValue("JS");
				String ycpmla_Name = driver.findElement(By.xpath("//td[contains(text(),'Janasena Party')]//preceding-sibling::td[1]")).getText();
				cell8.setCellValue(ycpmla_Name);
			}
			else
			{
				Cell cell5 = row.createCell(4);
				cell5.setCellValue("YSRCP");
				String ycpmla_Name = driver.findElement(By.xpath("//td[contains(text(),'Yuvajana Sramika Rythu Congress Party')]//preceding-sibling::td[1]")).getText();
				cell8.setCellValue(ycpmla_Name);
			}
			
			
			
			if(allianceVotes > ycpVotes)
			{
				Cell cell6 = row.createCell(5);
				cell6.setCellValue("TDPJS");
			}
			else
			{
				Cell cell6 = row.createCell(5);
				cell6.setCellValue("YSRCP");
			}
			
			
			Cell cell7 = row.createCell(6);
			cell7.setCellValue(const_Value);
			
					
			
			
		}
    }
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	finally
	{
		FileOutputStream fout=new FileOutputStream(file);
		workbook.write(fout);
		
		fout.flush();
		fout.close();
		workbook.close();	
		System.out.println("Successfully written to excel");
		
	}
  
		
		
		

	}
	

	
	
	
	
	
	
	
	
	
	
	

}
