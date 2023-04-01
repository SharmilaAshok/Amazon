package com.selenium.programees;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class ScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("wevdriver.chromedriver.driver", "C:\\WebDrivers.chromerdriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(s);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		File screenShoot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);// ScreenShot
		
		Files.copy(screenShoot, new File("C:\\SeleniumScreenShot\\google1.jpg"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']")).click();
		//driver.findElement(By.partialLinkText("/gp/bestsellers/?ref_=nav_cs_bestsellers")).click();
		File screenShoot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenShoot1, new File ("C:\\SeleniumScreenShot\\MyTrip.jpg"));
		
		driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']")).click();
		File screenShot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenShot2, new File ("C:\\SeleniumScreenShot\\Mobile.jpg"));
		
		
	}

}
