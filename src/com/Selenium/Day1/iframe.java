package com.Selenium.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		 
		WebDriver driver = 	new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		//WebElement findElement2 = driver.findElement(By.xpath("//div[@id='portfolio_items']"));
		driver.switchTo().frame(1);
		
		WebElement findElement = driver.findElement(By.xpath("(//img[@width='460'])[1]"));
		findElement.click();

	}

}
