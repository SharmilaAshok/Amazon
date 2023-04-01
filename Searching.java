package com.selenium.programees;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Searching {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedrive.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeOptions d = new ChromeOptions();
		d.addArguments("--remote-allow-origins=*","ignore-certificte-errors");
		WebDriver driver = new ChromeDriver(d);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Dharshan",Keys.ENTER);
		
	}

}
