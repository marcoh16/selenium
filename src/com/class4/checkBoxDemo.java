package com.class4;



import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;


public class checkBoxDemo extends CommonMethods {
	public static final String URL1="http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome",URL1);
		driver.manage().window().fullscreen();
		//how to check if button is enable or visible.
		//1st way to verify
		//driver.findElement(By.cssSelector("input#btnLogin")).isEnabled();
		//2nd way to verify with WebElement
		//WebElement loginBtn = driver.findElement(By.cssSelector("input#btnLogin"));
		//System.out.println(loginBtn.isEnabled());
		
		//driver.get("https://www.google.com");
		//WebDriver driver=CommonMethods.setUp("chrome");
		
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Checkbox Demo")).click();
		
		WebElement ageCheckBox = driver.findElement(By.id("isAgeSelected"));
		if (!ageCheckBox.isSelected()) {
			ageCheckBox.click();
		}
		Thread.sleep(1000);
		ageCheckBox.click();
		
		System.err.println("------Group of Check of boxes-------");
		
		List <WebElement> groupCheckBox = driver.findElements(By.xpath("//input[@class='cb1-element']"));
		
		if (!groupCheckBox.isEmpty()) {
			Iterator<WebElement> it = groupCheckBox.iterator();
			while(it.hasNext()) {
				it.next().click();
				Thread.sleep(1000);
			}
		}else {
			System.err.println("list is empty check your xpath");
		}
		
		
	}

}
