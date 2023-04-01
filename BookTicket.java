package com.selenium.programees;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookTicket {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chromedriver.driver","C:\\WebDrivers.chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(s);
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='sc-fcdeBU cNeUMt']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Agilan",Keys.ENTER);
		
	}

}
