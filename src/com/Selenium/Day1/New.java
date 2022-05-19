package com.Selenium.Day1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		WebElement acc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		acc.click();
		
		Thread.sleep(3000);
		
		WebElement a = driver.findElement(By.xpath("//input[@name = 'firstname']"));
		a.sendKeys("First");
		WebElement b = driver.findElement(By.xpath("//input[@name='lastname']"));
		b.sendKeys("last");
		WebElement c = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		c.sendKeys("8796546813");
		WebElement d = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		d.sendKeys("last8796546813");	
		WebElement e = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		e.sendKeys("05");	
		WebElement f = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		f.sendKeys("Sep");
		WebElement g = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		g.sendKeys("1991");
		WebElement h = driver.findElement(By.xpath("//input[@value='2']"));
		h.click();
		WebElement i = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		i.click();
		
		Thread.sleep(8000);
		
		
		TakesScreenshot src = (TakesScreenshot) driver;
		File src1 = src.getScreenshotAs(OutputType.FILE);
		File save = new File("C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Screenshot\\snap.png");
		FileUtils.copyFile(src1, save);
		
		driver.close();
		
		
		
		
		
		
		

	}

}
