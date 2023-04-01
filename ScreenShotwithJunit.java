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

public class ScreenShotwithJunit {
	WebDriver driver;
	@Before
	public void openBrowser() {
		System.setProperty("Webdriver.msedgedriver.driver", "C:\\WebDrivers.msedgedriver.exe");
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
	}
	@Test
	public void testCase() {
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Dharshan",Keys.ENTER);
	}
	@Test
	public void testCase1() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Dharshan",Keys.ENTER);
		File screenShoot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(screenShoot ,new File("C:\\SeleniumScreenShot\\dharshan.jpg"));
		Thread.sleep(2000);

}
	@After
	public void close() {
		driver.close();
	}
	}
