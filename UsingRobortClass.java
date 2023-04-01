package com.selenium.programees;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingRobortClass {
	public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("Webdriver.msedgedriver.driver", "C:\\WebDrivers.msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Robot rb= new  Robot();
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyRelease(KeyEvent.VK_DOWN);
//	Thread.sleep(2000);
//	rb.keyPress(KeyEvent.VK_DOWN);
//	//rb.keyRelease(KeyEvent.VK_DOWN);
//	Thread.sleep(2000);
//	rb.keyPress(KeyEvent.VK_DOWN);	
//	//rb.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	rb.keyPress(KeyEvent.VK_F5);
//	Thread.sleep(2000);
//	rb.keyPress(KeyEvent.VK_F3);
//	Thread.sleep(2000);
//	rb.keyPress(KeyEvent.VK_F4);
	Thread.sleep(2000);
	
	
	}

}
