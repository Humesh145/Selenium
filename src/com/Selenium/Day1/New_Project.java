package com.Selenium.Day1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.net.EphemeralPortRangeDetector;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class New_Project {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//Driver//chromedriver3.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MINUTES);
		WebElement login = driver.findElement(By.className("login"));
		login.click();
		
		WebElement userid = driver.findElement(By.xpath("//label[@for='email']//following-sibling::input[@type=\"text\"]"));
		userid.sendKeys("mpini@iurrueewr.com");
		
		WebElement password = driver.findElement(By.xpath("//div[@class='form-group']//descendant::input[@type=\"password\"]"));
	    password.sendKeys("Poda@123");
	    
	    WebElement signin = driver.findElement(By.id("SubmitLogin"));
	    signin.click();
	    
	    WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		
	   Actions act = new Actions(driver);
	   act.moveToElement(women).build().perform();
	   act.contextClick(women).build().perform();
	   
	   Robot rbt = new Robot();
	   rbt.keyPress(KeyEvent.VK_DOWN);
	   rbt.keyPress(KeyEvent.VK_ENTER);
	    
	   WebElement logo = driver.findElement(By.xpath("//img[@alt=\"My Store\"]"));
	   act.moveToElement(logo).build().perform();
	   
	   String cssValue = logo.getCssValue("color");
	   
	   System.out.println(cssValue);
	   
	   
	   
	    //WebElement tshirt = driver.findElement(By.xpath("(//a[@title='Tops']//following::a[@title='T-shirts'])[1]"));
	    //tshirt.click();
	    
	   WebDriverWait wait = new WebDriverWait(driver, 30);
	   wait.until(ExpectedConditions.visibilityOfElementLocated((By) women));
	    
			
	    //Thread.sleep(1000);
	    
		//driver.close();
	}

}
