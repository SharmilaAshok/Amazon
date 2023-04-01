package com.selenium.programees;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonLogIn {
	WebDriver driver;
	@Before
	public void openBrowser() {
		System.setProperty("Webdriver.msedgedriver.driver", "C:\\WebDrivers.msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
	}
	@Test
	public void testCases () throws InterruptedException {
		driver.findElement(By.xpath("//span[.='Hello, sign in']")).click();
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Abinav");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("9912345678");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dhar@1234");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[id@='home_children_button']")).click();// need to check
	}

}
