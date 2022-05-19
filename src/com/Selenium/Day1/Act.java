package com.Selenium.Day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Act {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		 
		WebDriver driver = 	new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		String parent = driver.getWindowHandle();

		
		WebElement b = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		WebElement c = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		

		Actions a= new Actions(driver);
		
		a.moveToElement(b).build().perform();
		a.contextClick(b).build().perform();
		
	Robot ro =	new Robot();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);


		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		a.contextClick(c).build().perform();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);

		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		
	for (String string : windowHandles) {
		String title = driver.switchTo().window(string).getTitle();	
		System.out.println(title);
		
	}
	
	String ac = "Amazon.in Help: Help";
	
	for (String string : windowHandles) {
		if (driver.switchTo().window(string).getTitle().equals(ac)) {
			break;
			
		}
	}
	
	String customer_care = driver.getWindowHandle();
	
	driver.switchTo().window(parent);
	driver.switchTo().window(customer_care);
	
	
   

		

	}

}
