package com.Selenium.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver3.exe");
		 
		WebDriver driver = 	new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement WM = driver.findElement(By.xpath("//a[@title='Women']"));
		
		Actions a= new Actions(driver);
		a.moveToElement(WM).build().perform();
		
		
		//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		//driver.quit();
	}

}
