package com.selenium.programees;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UsingNotNull {
	WebDriver driver;
	@Before
	public void openBrowser() {
		System.setProperty("webdriver.msedgedriver.driver", "C:\\WebDrivers.msedgedriver.exe");
		driver= new EdgeDriver();
		driver.get("https://www.google.co.in/");
		}
	@Test
	public void testcaseB() {
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Flipcart",Keys.ENTER);
		String expectedTitle ="Flipcart - Google Search";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle,actualTitle);
		}
	@Test
	public void testcaseA() {
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Flipcart",Keys.ENTER);
		assertNotNull(driver.getTitle());
		}

}
