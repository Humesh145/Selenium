package com.Selenium.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Moveover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(women).build().perform();
		act.doubleClick().build().perform();

		WebElement tops = driver.findElement(By.xpath("//a[@title='Tops']"));
		tops.click();

	}

}
