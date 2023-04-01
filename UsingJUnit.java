package com.selenium.programees;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UsingJUnit {
	WebDriver driver;
	@Before
	public void openBrowser() {
		System.setProperty("Webdriver.chromedrive.driver","C:\\WebDrivers.chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver= new ChromeDriver(s);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		}
	@Test
	public void testCase() throws InterruptedException {
		Thread.sleep(2000);
		String title =driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String page = driver.getPageSource();
		System.out.println(page);
		Thread.sleep(3000);
	}
	@After
	public void closeBrowser() {
		driver.close();
	}
	}
	