package com.Selenium.Day1;

import java.io.File;

import javax.xml.xpath.XPath;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		 
		WebDriver driver = 	new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		
	WebElement a = driver.findElement(By.xpath("//input[@name='username']"));
	a.sendKeys("124578");
	
	WebElement pass = driver.findElement(By.xpath("//input[contains(@aria-label,'Pass')]"));
	pass.sendKeys("123456");
	
	WebElement login = driver.findElement(By.xpath("//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_         _4EzTm                                                                                                              ']"));
	login.click();
	
	Thread.sleep(3000);
	
	TakesScreenshot src = (TakesScreenshot) driver;
	File src1 = src.getScreenshotAs(OutputType.FILE);
	File save = new File("C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Screenshot\\snap.png");
	FileUtils.copyFile(src1, save);
	
	
	


	}

}
