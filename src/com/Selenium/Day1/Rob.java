package com.Selenium.Day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rob {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Humesh\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");

WebDriver driver = 	new ChromeDriver();

driver.get("https://www.amazon.in/");

WebElement b = driver.findElement(By.xpath("//a[text()='Mobiles']"));

Actions a= new Actions(driver);
a.contextClick(b).build().perform();

Robot ro =	new Robot();
ro.keyPress(KeyEvent.VK_2);
ro.keyRelease(KeyEvent.VK_2);

//ro.keyPress(KeyEvent.VK_DOWN);
//ro.keyPress(KeyEvent.VK_DOWN);

ro.keyPress(KeyEvent.VK_ENTER);
ro.keyRelease(KeyEvent.VK_ENTER);

Thread.sleep(100000);

driver.close();
	}
	
	

}
