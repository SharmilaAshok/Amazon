package com.selenium.programees;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PVR {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.driver", "C:\\WebDrivers\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*","Ignore-certificate-errors");
		WebDriver driver = new ChromeDriver(s);
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/chennai/movies/kannai-nambaathe/ET00354916");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='CommonContainers__ButtonComponent-sc-8f9mtj-0 CommonContainers__CtaComponent-sc-8f9mtj-1 styles__CtaButtonContainer-sc-1vmod7e-0 emIChW']")).click();
		//Alert alert =driver.switchTo().alert();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		driver.findElement(By.xpath("//li[@class='date-details _active slick-slide slick-current slick-active']")).click();
		driver.findElement(By.xpath("//a[@class='__venue-name']")).click();
		driver.findElement(By.xpath("//a[@class='showtime-pill data-enabled']")).click();
		driver.findElement(By.xpath("//div[@id='btnPopupAccept']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='pop_4']")).click();
		//driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		Thread.sleep(2000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		WebElement elm = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='bar-btn _primary _full-width _centered']")));
//		elm.click();
		
		driver.findElement(By.xpath("//div[@class='bar-btn _primary _full-width _centered']")).click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='A_12_0114']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='btmcntbook']")).click();
		
		
	}

}
