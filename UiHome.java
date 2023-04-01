package com.selenium.programees;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UiHome {
	public static void main(String[] args) {
		System.setProperty("Webdriver.msedgedriver.driver", "C:\\WebDrivers.msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/Students/Index");
		driver.findElement(By.xpath("//a[.='Create New']")).click();
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Sharmila");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Ashok Balaji");
		driver.findElement(By.xpath("//input[@name='EnrollmentDate']")).sendKeys("03/24/2023");
	driver.findElement(By.xpath("//input[@value='Create']")).click();
driver.findElement(By.xpath("//input[@name='Search_Data']")).sendKeys("Sharmila");
driver.findElement(By.xpath("//input[@value='Find']")).click();
	}

}
