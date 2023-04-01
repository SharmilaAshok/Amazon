package com.selenium.programees;

 
	import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

	public class UsingLog4j1 {
		static Logger log = Logger.getLogger(UsingLog4j1.class);
		public static void main(String[] args) throws InterruptedException {
			PropertyConfigurator.configure("LogProperty");
			System.setProperty("Webdriver.msedgedriver.driver", "C:\\WebDrivers\\EdgeDriver.msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in/");
			String title = driver.getTitle();
			String webURL = driver.getCurrentUrl();
			String pageSource = driver.getPageSource();
			log.info("Web Page Title is" + title);
			log.info("Web page WebURL is" + webURL);
			log.debug("Web page PageSource is"+ pageSource.length());
			
			
		}

	}


