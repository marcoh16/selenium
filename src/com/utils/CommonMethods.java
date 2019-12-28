package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {
	
	public static WebDriver driver;
	
	/**
	 * Use this method in need of opening browser and targe url
	 * @param browser The desired browser
	 * @param url The desired URL
	 */
	public static void setUp(String browser, String url){
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			driver = new ChromeDriver();
			driver.get(url);
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver");
			driver = new FirefoxDriver();
			driver.get(url);
		}
		//return driver;
		
	}
	

}
