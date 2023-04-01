package com.selenium.programees;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UiHomeJunit {
	WebDriver driver;
	@Before
	public void openBrowser() {
		System.setProperty("Webdriver.msedgedriver.driver", "C:\\WebDrivers.msedgedriver.exe");
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/Students/Index");
	}
	@Ignore
	@Test
	public void testcase() {
		driver.findElement(By.xpath("//a[.='Create New']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Sharmila");
			driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Ashok Balaji");
			driver.findElement(By.xpath("//input[@name='EnrollmentDate']")).sendKeys("03/24/2023");
		driver.findElement(By.xpath("//input[@value='Create']")).click();
	driver.findElement(By.xpath("//input[@name='Search_Data']")).sendKeys("Sharmila");
	}
	
	@Test
	public void testcase2() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='Search_Data']")).sendKeys("Sharmila");
	driver.findElement(By.xpath("//input[@value='Find']")).click();
	driver.findElement(By.xpath("//button[.='EDIT']")).click();
	
	driver.findElement(By.xpath("//input[@id='FirstName']")).clear();
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Dharshan",Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@Ignore
	@Test
 public void testcaseDetails () {
		driver.findElement(By.xpath("//input[@name='Search_Data']")).sendKeys("SharmilaDharshan");
		driver.findElement(By.xpath("//input[@value='Find']")).click();
		driver.findElement(By.xpath("//button[.='DETAILS']")).click();
		driver.findElement(By.xpath("//a[.='Back to List']")).click();
		}
	@Ignore
	@Test
	 public void testcaseDelete () throws InterruptedException {
			driver.findElement(By.xpath("//input[@name='Search_Data']")).sendKeys("Sharmila");
			driver.findElement(By.xpath("//input[@value='Find']")).click();
			driver.findElement(By.xpath("//button[.='DELETE']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
