package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementCommandsDemo1 {
	public static final String URL = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		userName.sendKeys("Admin");
		
		//it will clear the text box or text area
		userName.clear();
		userName.sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement errorMessage = driver.findElement(By.xpath("//span[@id='spanMessage']"));
		System.out.println(errorMessage.isDisplayed());
		
		String errorMsg = errorMessage.getText();
		if(errorMessage.isDisplayed()) {// checking if error message is displayed
			String message = errorMessage.getText();//get the visible text from error message
			if(message.equals("Invalid credentials")) {//compare the text with expected 
				System.out.println("corrent error message is dispayed");
			}else {
				System.out.println("Incorrect error messave is displayd");
			}
		}
		
		
		
	}
	

}
