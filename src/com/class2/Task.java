package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.partialLinkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("marco");
		driver.findElement(By.name("lastName")).sendKeys("hurtado");
		driver.findElement(By.name("phone")).sendKeys("333-333-333");
		driver.findElement(By.name("userName")).sendKeys("meh@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("2333 am drive");
		driver.findElement(By.name("city")).sendKeys("anandnale");
		driver.findElement(By.name("state")).sendKeys("Virginia");
		driver.findElement(By.name("postalCode")).sendKeys("22003");
		driver.findElement(By.name("email")).sendKeys("meh@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abc1");
		driver.findElement(By.name("confirmPassword")).sendKeys("abc1");
		
		driver.findElement(By.name("register")).click();
		
		
		
		
	}

}
