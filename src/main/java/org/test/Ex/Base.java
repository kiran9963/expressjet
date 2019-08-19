package org.test.Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base  {
	 static  WebDriver driver;
		
		public static WebDriver driver() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-kk\\Airlines\\chrome\\chromedriver.exe");
			new ChromeDriver();
			 return driver;
			
		}
		public static void url(String url) {
			driver.get(url);
		}
		public static void max() {
		driver.manage().window().maximize();
	}
		public static WebElement xpath(String xpath) {

			WebElement from= driver.findElement(By.xpath(xpath));
			return from;   
		}
		
		public static void send(String xpath, String value) {

			 driver.findElement(By.xpath(xpath)).sendKeys(value);
		}

		public static void actin(WebElement e) {
			Actions acc = new Actions(driver);
			acc.doubleClick(e);
		}
	}

