package com.selenium.programees;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingFrame {
	public static void main(String[] args) {
		System.setProperty("Webdriver.msedgedriver.driver", "C:\\WebDrivers\\EdgeDriver.msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/Students/Switchto");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sharmila");
	}

}
