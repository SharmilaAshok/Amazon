package com.selenium.programees;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeOptions f = new ChromeOptions();
		f.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(f);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9834567890");// input number
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();// request OTP
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();// Popup close
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobile",Keys.ENTER);// Search mobile
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='_396cs4']")).click();// select it
		Thread.sleep(4000);
		WebElement buy = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']"));
		
		Actions a = new Actions(driver);
		
			a.doubleClick(buy).perform();
			
			buy.click();
			
			a.moveToElement(buy);
			
	}
 
}
