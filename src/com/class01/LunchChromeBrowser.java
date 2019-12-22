package com.class01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//system is a class setProperty(); is a static method
		//					key							value
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//THESE ARE BROWSER NAVIGATION COMMANDS!
		
		//http--> hepertext transfer protocol
		driver.get("https://wwww.google.com");
		//stoping for couple seconds
		Thread.sleep(200);
		
		//IT WILL NAVIGATE TO GIVING URL!
		//to navigate to another url
		driver.navigate().to("http://www.syntaxtechs.com");
		//navigates back to the url
		driver.navigate().back();
		//navigate back forward
		driver.navigate().forward();
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		//closing the page
		//driver.close();

	}

}
