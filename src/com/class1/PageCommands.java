package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chrome");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://wwww.google.com");
		
		final String expectedTitle = "Google";	
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("on the right page");
		}else {
			System.out.println("not on the right page");
		}
		
		System.out.println("-------------");
		//this method returns in string format
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		String expectedUrl = "http://google.com/?gws_rd=ssl";
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("Both URL are match");
		}else {
			System.err.println("Actual and Expected do not march");
		}
		
		
		
		//closing the page
		driver.close();

	}

}
