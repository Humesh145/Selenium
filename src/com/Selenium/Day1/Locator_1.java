package com.Selenium.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_1 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			 
			WebDriver driver = 	new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys("bhooba@111.com");
			
			
			WebElement password = driver.findElement(By.name("pass"));
			password.sendKeys("12345678");
			
		WebElement login = driver.findElement(By.name("login"));
		login.click();
				


	}

}
