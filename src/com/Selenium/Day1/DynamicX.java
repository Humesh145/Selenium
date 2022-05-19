package com.Selenium.Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();

				driver.get("https://www.myntra.com/men-formal-shirts");

				driver.manage().window().maximize();
				
				List<WebElement> elements = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));

				List <Integer> c = new LinkedList<Integer>();
				
				for (WebElement a : elements) {
					
					String replace = a.getText().replace("Rs. ", "");
					System.out.println(replace);
					int price = Integer.parseInt(replace);
					c.add(price);
				}

				
				System.out.println(c);
				int size = c.size();
				System.out.println(size);
				
				Integer max = Collections.max(c);
				System.out.println(max);
	}

}
