package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleWebPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		WebElement element = driver.findElement(By.name("firstName"));
		boolean status = element.isEnabled();
		if(status) {
			element.sendKeys("hello mark");
		}
		
		driver.findElement(By.id("idOfButton")).click();
	
		driver.findElement(By.xpath("//*[@id='male']")).click();
		driver.findElement(By.className("Automation")).click();
		driver.findElement(By.id("manual")).click();
		driver.navigate().to("https://www.va-glazing.com");
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(1800);
		
		
	}

	
	
}
