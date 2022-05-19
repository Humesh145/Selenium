package com.Selenium.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		int size = driver.findElements(By.tagName("iframe")).size();	
		System.out.println(size);
		
		driver.switchTo().frame(2);
		
		Thread.sleep(5000);
		
		//driver.switchTo().frame(4);
		
		//Thread.sleep(5000);
		
		
		
		WebElement drag = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		
		WebElement drop = driver.findElement(By.id("trash"));
		
	  
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
		Thread.sleep(5000);
		
		
		
		driver.quit();
		
		
		
		
	}

}
