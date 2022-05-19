package com.Selenium.Day1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class move_elements {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.amazon.in/");

WebElement find = driver.findElement(By.xpath("//img[@alt='(Renewed) Lenovo IdeaPad S540 11th Gen Intel Core i7 13.3\" QHD IPS Thin & Light Laptop (16GB/512GB SSD/Windows 10/MS...']"));

Actions a = new Actions(driver);

a.moveToElement(find).build().perform();
find.click();

Thread.sleep(1000);

WebElement cart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
cart.click();

WebElement ca = driver.findElement(By.xpath("//a[@id='nav-cart']"));

Actions act = new Actions(driver);
act.contextClick(ca).build().perform();

Robot ro=new Robot();
ro.keyPress(KeyEvent.VK_DOWN);
ro.keyPress(KeyEvent.VK_ENTER);



	}

}
