package com.selenium.programees;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingImplicitWait {
	public static void main(String[] args) {
		System.setProperty("Webdriver.msedgedriver.driver", "C:\\WebDrivers.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://uitestpractice.com/Students/Index");
		driver.findElement(By.xpath("//input[@id='Search_Data']")).sendKeys("Dharshan",Keys.ENTER);
		
		
	}

}
