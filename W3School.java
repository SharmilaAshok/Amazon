package com.selenium.programees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class W3School {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedbriver.msedgedriver.driver", "C:\\WebDrivers.msedgedriver.exe");
//		ChromeOptions s = new ChromeOptions();
//		s.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.w3schools.com/");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@href=\"/html/tryit.asp?filename=tryhtml_default_default\"]")).click();
		
		Set<String> children = driver.getWindowHandles();
//		Iterator<String> childs = children.iterator();
//		while (childs.hasNext()) {
//			String cw = childs.next();
//			if (cw != parent) {
//				driver.switchTo().window(cw);
//				Thread.sleep(2000);
////				driver.findElement(By.xpath("//a[@href=\"https://www.w3schools.com/spaces/\"]")).click();
////				driver.close();
//
//			}
//		}

		ArrayList<String> al = new ArrayList<>(children);
//		System.out.println(parent);
//		System.out.println(al.get(0));
		
		for(int i=1;i<al.size();i++) {
			if(parent!=al.get(i)) {
				driver.switchTo().window(al.get(i));
				
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		driver.close();
		
		driver.close();
		
	}
}
