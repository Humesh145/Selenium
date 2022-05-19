package com.Selenium.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
	}

}
