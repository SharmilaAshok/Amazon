package com.selenium.programees;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingScroll {
public static void main(String[] args) {
	System.setProperty("Wedbriver.mwdegedriver.driver", "C:\\WebDrivers.msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://uitestpractice.com/Students/Form");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,250)");
	
}
}
