package com.Selenium.Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.myntra.com/men-formal-shirts");

List<WebElement> a = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
List<Integer> c = new ArrayList<Integer>();

for (WebElement b : a) {
	System.out.println(b.getText());
	
	//int i = Integer.parseInt(rr);
	//c.add(i);
	//System.out.println(i);
}

List<WebElement> z = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
for (WebElement y : z) {
	
	String replace = y.getText().replace("Rs. ", "");
	System.out.println(replace);
	int i = Integer.parseInt(replace);
	c.add(i);
	
}
System.out.println(c);
int size = c.size();
System.out.println(size);
Integer max = Collections.max(c);
System.out.println(max);


Collections.sort(c);
System.out.println(c);





	}

}
