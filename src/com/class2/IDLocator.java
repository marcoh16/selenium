package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class IDLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		
		//way to find element by name 1
		driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
		
		//way to find element by className 2
		driver.findElement(By.className("button")).click();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Welcome Admin")).click();
		driver.findElement(By.partialLinkText("Welcome")).click();
		
		Thread.sleep(2000);
		//way to find element by linkText
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
	
	}

}
