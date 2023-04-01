package com.selenium.programees;

import java.io.File;
import java.io.IOException;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class UsingForm {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.msedgedriver.driver", "C:\\WebDrivers.msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/Students/Form");
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Sharmila");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Ravi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='radio-inline']")).click();
		driver.findElement(By.xpath("//label[@class='checkbox-inline']/input[@value='read']")).click();
		WebElement select =driver.findElement(By.xpath("//select[@class='form-control dropdown-header']"));
		Select d = new Select(select);
		d.selectByVisibleText("Canada");
		driver.findElement(By.xpath("//input[@placeholder='Enter Date of birth']")).click();
		Thread.sleep(2000);
		
		WebElement select1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select d1= new Select(select1);
		d1.selectByValue("1990");
		WebElement select2 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select d2 = new Select(select2);
		d2.selectByValue("10");
		driver.findElement(By.xpath("//a[.='5']")).click();
		driver.findElement(By.xpath("//input[@id='phonenumber']")).sendKeys("9912345678");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Sharmi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("writemesharmi@gmail.com");
		Thread.sleep(1000);
		Actions action =new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("Good");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("Sharmi@05");
		Thread.sleep(1000);
		File screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenShot, new File ("C:\\SeleniumScreenShot\\form.jpg"));
		driver.findElement(By.xpath("//button[.='Submit']")).click();
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
