package com.Selenium.Day1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		 
		WebDriver driver = 	new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		driver.switchTo().frame(0);
		
		WebElement a = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		a.sendKeys("Hello");
		
		
		driver.switchTo().defaultContent();
		
		WebElement b = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		b.click();
		
		int size1 = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size1);
		
driver.switchTo().frame(1);
driver.switchTo().frame(0);


		WebElement a1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		a1.sendKeys("Hello");
		
		
		Thread.sleep(10000);
		
		driver.close();
		
		
		
		
		
	}

}
