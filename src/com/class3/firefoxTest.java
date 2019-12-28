package com.class3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxTest {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "geckodriver");

	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.va-glazing.com");
	}

}
