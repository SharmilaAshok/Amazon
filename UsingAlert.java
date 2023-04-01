package com.selenium.programees;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class UsingAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.driver", "C:\\WebDrivers.chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*","ignore-cerficate-errors");
		WebDriver driver = new ChromeDriver(s);
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/Students/Actions");
		Thread.sleep(2000);
		WebElement oneClick =driver.findElement(By.xpath("//button[@name='click']"));//Single Click
		oneClick.click();
//		Thread.sleep(2000);
//		Alert alert =driver.switchTo().alert();
//		alert.accept();
		Actions action = new Actions(driver);
//		WebElement dbClick = driver.findElement(By.xpath("//button[@name='dblClick']"));//Double Click
//		action.doubleClick(dbClick).perform();
		Thread.sleep(2000);
//		alert.accept();
		
		WebElement dragFrom = driver.findElement(By.xpath("//p[.='Drag me to my target']"));
		
		WebElement dragTo = driver.findElement(By.xpath("//p[.='Drop here']"));
		
		
		WebElement dragTo1= driver.findElement(By.xpath("//div[@id='div2']"));
		
		action.dragAndDrop(dragFrom, dragTo).perform();
		Thread.sleep(2000);
		action.dragAndDrop(dragFrom, dragTo1).perform();
		
		
	}

}
