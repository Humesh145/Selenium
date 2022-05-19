package com.Selenium.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		alert1.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		//a[@href='#CancelTab']
		
		WebElement alert2 = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		alert2.click();
		
		//button[@onclick='confirmbox()']
		
		WebElement alert3 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		alert3.click();
		
		driver.switchTo().alert().dismiss();
		
		//a[@href='#Textbox']
		
		WebElement alert4 = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		alert4.click();
		
		//button[@class='btn btn-info']
		
		WebElement alert5 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		alert5.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("test");
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		

	}

}
