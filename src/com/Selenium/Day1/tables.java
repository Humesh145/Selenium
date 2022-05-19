package com.Selenium.Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tables {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//Driver//chromedriver3.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/table");
		WebElement table = driver.findElement(By.id("simpletable"));		
	    List<WebElement> header = table.findElements(By.tagName("th"));
		for (WebElement we : header) {
			
			String text = we.getText();
			
			System.out.println(text);
			
		}
		
		List<WebElement> allrows = table.findElements(By.cssSelector("tbody tr"));
		
		System.out.println(allrows.size());
		
		
		for (WebElement tbody : allrows) {
			
			String text = tbody.getText();
			System.out.println(text);
			
		}
		
		for (int i = 0; i < allrows.size(); i++) {
			List<WebElement> rows = allrows.get(i).findElements(By.tagName("td"));
			for (int j = 1; j < allrows.size(); j++) {
            WebElement lastname = rows.get(j);
			String text = lastname.getText();
			System.out.println(text);
			if(text.equals("Chatterjee")) {
				
				WebDriverWait wait = new WebDriverWait(driver, 30);
				   wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input")));
				
				WebElement input = rows.get(3).findElement(By.tagName("input"));
				
				
				   
				input.click();
				System.out.println("ok");
				break;
			}
			}
			
		}
		
		
		

	}

}
