package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIndElementDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.id("textUsername")).sendKeys("admin");
		driver.findElement(By.id("textPassword")).sendKeys("hadsfa");
		driver.findElement(By.id("btnLogin")).click();
		
		
		
		
	}

}
