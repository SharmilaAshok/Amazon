package com.selenium.programees;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrtcLogIn {
	public static void main(String[] args) {
		System.setProperty("Webdriver.msedgedriver.driver", "C:\\WebDrivers.msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
        driver.findElement(By.xpath("//span[.='Basic Details']")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Dharshan",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='usrPwd']")).sendKeys("Dhar@12345",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='cnfUsrPwd']")).sendKeys("Dhar@12345",Keys.ENTER);
		WebElement select = driver.findElement(By.xpath("//span[.='Preferred Language']"));
		Select d = new Select(select);
		d.selectByVisibleText("English");
		
		
	}

}
