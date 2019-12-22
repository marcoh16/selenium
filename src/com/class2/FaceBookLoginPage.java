package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("mh@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("mh123");
		
		driver.findElement(By.id("u_0_b")).click();
		
		driver.close();
		
		
		
		
	}

}
