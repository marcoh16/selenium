package com.class2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSSselectorDemo {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.findElement(By.cssSelector("//input[@input='text']")).sendKeys("mmm");
		// css=input[name='textUsername']
		
		//input#txtUsername -->only if you have id attribute
		//input.button--> only if you have class attribute, only use for class
		//input[name^='txt']--->^ means starts with CSS selector
		//input[name$='name']--.$ means ends with
		//input[id*='nL']---> * keyword represents contains
		
		
		
	}

}
