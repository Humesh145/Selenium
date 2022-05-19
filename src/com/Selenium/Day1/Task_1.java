package com.Selenium.Day1;

import java.awt.print.Printable;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1 {
	


	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver ();
		
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//input[@type= 'text' ]"));
		search.sendKeys("motorola mobiles");
		WebElement find = driver.findElement(By.xpath("//input[@type= 'submit' ]"));
		find.click();
		String parent = driver.getWindowHandle();
		WebElement moto1 = driver.findElement(By.xpath("//span[text()= 'Motorola E7 Power (Tahiti Blue, 64 GB) (4 GB RAM)' ]"));
		moto1.click();
				
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
		}
		
		String a ="Motorola E7 Power (Tahiti Blue, 64 GB) (4 GB RAM) : Amazon.in: Electronics";
		for (String string : windowHandles) {
			if (driver.switchTo().window(string).getTitle().equals(a)) {
				System.out.println("Process done");
				break;
			}
		}
		
		TakesScreenshot k = (TakesScreenshot) driver;
		File l = k.getScreenshotAs(OutputType.FILE);
		File m = new File("C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Screenshot\\Snap.png");
		FileUtils.copyFile(l, m);
		
		
	
		
		driver.close();
		//driver.switchTo().window(parent);
		
		//WebElement moto1 = driver.findElement(By.xpath("//span[text()= 'Motorola E7 Power (Tahiti Blue, 64 GB) (4 GB RAM)' ]"));
		//moto1.click();
		
		
		
	
		
	}
}