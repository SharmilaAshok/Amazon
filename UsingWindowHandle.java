package com.selenium.programees;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class UsingWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedbriver.chromedriver.driver", "C:\\WebDrivers.chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(s);
		driver.navigate().to("http://uitestpractice.com/Students/Switchto");
		String parent =driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Opens in a new window']")).click();
		
		Thread.sleep(2000);
		Set <String> children =driver.getWindowHandles();
		Iterator <String> childs =  children.iterator();
		while(childs.hasNext()) {
			String cw = childs.next();
			if (cw!=parent) {
				Thread.sleep(2000);
				driver.switchTo().window(childs.next());
				driver.manage().window().maximize();
//				Thread.sleep(2000);
//				Thread.sleep(2000);
				//WebElement dragFrom = driver.switchTo().window(cw).findElement(By.xpath("//p[.='Drag me to my target']"));
				WebElement dragFrom =driver.findElement(By.xpath("//p[.='Drag me to my target']"));
		    	WebElement dratTo = driver.findElement(By.xpath("//p[.='Drop here']"));
		    	Actions action = new Actions(driver);
		    	action.dragAndDrop(driver.findElement(By.xpath("//p[.='Drag me to my target']")), driver.findElement(By.xpath("//p[.='Drop here']"))).perform();
		    	Thread.sleep(2000);
//		    	driver.close();
				
			}
		}
		
		
	}

}
