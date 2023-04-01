package com.selenium.programees;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class PosNegTest {
	WebDriver driver;
	@Before
	public void openBrowser() throws InterruptedException {
		System.setProperty("Webdriver.msedgedriver.driver", "C:\\WebDrivers.msedgedriver.exe");
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
	}
//	@Test
//	public void testcase() throws InterruptedException, IOException {
//		driver.findElement(By.xpath("//a[@class='gb_q']")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//span[.='Create account']")).click();
//		driver.findElement(By.xpath("//span[.='For work or my business']")).click();
//	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Dharshan");
//		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Ashok");
//	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dharsok0007");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Monday@123");
//		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("Monday@123");
//		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//span[.='Next']")).click();
//File screenShoot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		Files.copy(screenShoot ,new File("C:\\SeleniumScreenShot\\Account.jpg"));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='phoneNumberId']")).sendKeys("9960123456");
//		driver.findElement(By.xpath("//span[.='Next']")).click();
		
	//}
//	@Test
//	public void testcase1() throws InterruptedException, IOException {
//		
//	driver.findElement(By.xpath("//a[@class='gb_q']")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//span[.='Create account']")).click();
//		driver.findElement(By.xpath("//span[.='For work or my business']")).click();
//	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("@qeefm13");
//	driver.findElement(By.xpath("//span[.='Next']")).click();
//	File screenShoot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	Files.copy(screenShoot1 ,new File("C:\\SeleniumScreenShot\\Account1.jpg"));
//	}
//	@Test
//	public void testcase2() throws InterruptedException, IOException {
//		
//		driver.findElement(By.xpath("//a[@class='gb_q']")).click();
//			Thread.sleep(2000);
//			
//			driver.findElement(By.xpath("//span[.='Create account']")).click();
//			driver.findElement(By.xpath("//span[.='For work or my business']")).click();
//		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("@qeefm13");
//		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(" ");
//		driver.findElement(By.xpath("//span[.='Next']")).click();
//		File screenShoot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	Files.copy(screenShoot2 ,new File("C:\\SeleniumScreenShot\\Account2.jpg"));
//	}
	@Test
	public void testcase3() throws InterruptedException, IOException {
		
		driver.findElement(By.xpath("//a[@class='gb_q']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[.='Create account']")).click();
			driver.findElement(By.xpath("//span[.='For work or my business']")).click();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Koshasok0007");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		File screenShoot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(screenShoot3 ,new File("C:\\SeleniumScreenShot\\Account3.jpg"));
	}}
//	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Koshasok0007");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mon@day@");
//		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("Mon@day@");
//		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//span[.='Next']")).click();
//File screenShoot6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		Files.copy(screenShoot1 ,new File("C:\\SeleniumScreenShot\\Account6.jpg"));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='phoneNumberId']")).sendKeys("9900");
//		driver.findElement(By.xpath("//span[.='Next']")).click();
//		
	
	

