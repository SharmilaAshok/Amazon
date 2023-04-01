package com.selenium.programees;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestGoogle {
	WebDriver driver;
	@Before
	public void openBrowser() {
		System.setProperty("Webdriver.msdriver.driver","C:\\WebDrivers.msdriver.exe");
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
	}
	@Test
	public void testCase() {
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Dharshan",Keys.ENTER);
		
	}
	@After
	public void clsoe() {
		driver.close();
		
	}
}
