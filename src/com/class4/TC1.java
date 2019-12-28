package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class TC1 extends CommonMethods {

	public static final String URL1 = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) {
	CommonMethods.setUp("chrome", URL1);
	driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
	driver.findElement(By.linkText("Radio Buttons Demo")).click();
	
	WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@name='optradio'and @value='Female']"));
	femaleRadioButton.click();
	boolean select = femaleRadioButton.isSelected();
	System.out.println(select);

}
}