package com.selenium.programees;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SwitchTo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.ChromerDriver.driver", "C:\\WebDrivers.ChromeDriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(s);
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/Students/Switchto");
		Thread.sleep(2000);
		WebElement alt = driver.findElement(By.xpath("//button[@id='alert']"));
		alt.click();
		Alert alert =driver.switchTo().alert();
    	alert.accept();
    	Thread.sleep(2000);
    	WebElement confirm = driver.findElement(By.xpath("//button[@id='confirm']"));
    	confirm .click();
    	alert.accept();
    	Thread.sleep(2000);
    	WebElement prompt = driver.findElement(By.xpath("//button[@id='prompt']"));
    	prompt.click();
    	alert.sendKeys("something");
    	alert.accept();
    	driver.get("http://www.uitestpractice.com/");
    	WebElement dragFrom =driver.findElement(By.xpath("//p[.='Drag me to my target']"));
    	WebElement dratTo = driver.findElement(By.xpath("//p[.='Drop here']"));
    	Actions action = new Actions(driver);
    	action.dragAndDrop(dragFrom, dratTo).perform();
    	
		
		
	}

}
