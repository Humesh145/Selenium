package com.Selenium.Day1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class New_1 {
	

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000); 
		
		WebElement a = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		a.click();
		
		Thread.sleep(3000); 
		
		WebElement b = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		b.sendKeys("Krishna");
		WebElement c = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		c.sendKeys("Bhooba");
		WebElement d = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		d.sendKeys("7894561237");
		WebElement e = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		e.sendKeys("789456123");
		
		WebElement f = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select day = new Select(f);
		day.selectByValue("22");
		WebElement g = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month = new Select(g);
		month.selectByIndex(8);
		WebElement h = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year = new Select(h);
		year.selectByVisibleText("1992");
		
		WebElement i = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		i.click();
		
		WebElement j = driver.findElement(By.xpath("(//button[contains(text(),'Up')])[1]"));
		j.click();
		
		
		Thread.sleep(15000); 
		
		TakesScreenshot k = (TakesScreenshot) driver;
		File l = k.getScreenshotAs(OutputType.FILE);
		File m = new File("C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Screenshot\\Snap.jpg");
		FileUtils.copyFile(l, m);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
}
}
	
