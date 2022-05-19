package com.Selenium.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver3.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.navigate().to("https://www.amazon.in/");
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		

	}
	
}
