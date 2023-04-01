package com.selenium.programees;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class UsingMoveToElement {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.ChromeDriver.drive", "C:\\WebDrivers.ChromeDriver.exe");
	ChromeOptions s = new ChromeOptions();
	s.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
	WebDriver driver = new ChromeDriver(s);
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(2000);
	WebElement ele =driver.findElement(By.xpath("//div[.='Electronics']"));
	Actions action = new Actions(driver);
	action.moveToElement(ele).perform();
	
	Thread.sleep(2000);
	
	driver.findElement(By.className("_6w0cW9 _3YpNQe")).click();
	
	}

}
