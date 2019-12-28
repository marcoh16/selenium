package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web");
		WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		userName.sendKeys("sohilaryan");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Syntax@12");
		driver.findElement(By.id("btnLogin")).click();
		WebElement Image = driver.findElement(By.cssSelector("a[src*='syntax.png']"));
	}

}
