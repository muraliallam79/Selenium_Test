package selenium_Package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robot_Class {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		String command = "notepad.exe"; 
        Runtime run = Runtime.getRuntime(); 
        run.exec(command); 
        try { 
            Thread.sleep(2000); 
        } 
        catch (InterruptedException e) 
        { 
            // TODO Auto-generated catch block 
            e.printStackTrace(); 
        } 
  
        // Create an instance of Robot class 
        Robot robot = new Robot(); 
  
        // Press keys using robot. A gap of 
        // of 500 mili seconds is added after 
        // every key press 
        robot.keyPress(KeyEvent.VK_H); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_E); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_L); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_L); 
        Thread.sleep(500); 
        robot.keyPress(KeyEvent.VK_O); 
        Thread.sleep(500); 

	}

}
