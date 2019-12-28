package com.class4;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class RadioButtonDemo extends CommonMethods{

	public static final String SYNTAX_PRACTICE_URL="http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {
		//opening browser with URL
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL );
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@name='optradio'and @value='Male']"));
		maleRadioButton.click();
		System.out.println(maleRadioButton.isSelected());
		
		System.out.println("==============");
		
		List <WebElement>radioButtons = driver.findElements(By.name("optraido"));
		
		
		
		for(int i=0; i<radioButtons.size(); i++) {
			
			boolean isSelected = radioButtons.get(i).isSelected();
			System.out.println(isSelected);
			
			//if(!isSelected) {
				radioButtons.get(i).click();
				//System.out.println(isSelected);
				Thread.sleep(1000);
			}
		}
		
	
		
		
	}


