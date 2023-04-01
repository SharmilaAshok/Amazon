package com.selenium.programees;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.ChromeDriver.driver", "C:\\WebDrivers.ChromeDriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(s);
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/");
//		Thread.sleep(20000);
//		driver.findElement(By.xpath("//span[@class='close']")).click();
		Thread.sleep(2000);
		WebElement contests = driver.findElement(By.xpath("//span[.='Jobs']"));
		Actions action = new Actions(driver);
		action.moveToElement(contests).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("\"https://practice.geeksforgeeks.org/explore?page=1&sortBy=submissions&utm_source=gfg&utm_medium=gfg_header&utm_campaign=gfgpractice_header\"")).click();
	}
	

}
