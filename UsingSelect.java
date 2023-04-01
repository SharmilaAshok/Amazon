package com.selenium.programees;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class UsingSelect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:\\WebDrivers.chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(s);
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/Students/Select");
		WebElement select = driver.findElement(By.xpath("//select[@id='countriesSingle']"));
		Select d = new Select(select);
		//d.selectByValue("usa"); //ByValue
		//d.selectByIndex(1); //ByIndex
		d.selectByVisibleText("England"); //ByVisibleText
		
	}

}
