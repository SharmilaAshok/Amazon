package com.selenium.programees;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenFlipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chromedriver.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(s);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		String title =driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String page = driver.getPageSource();
		System.out.println(page);
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
