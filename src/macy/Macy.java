package macy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Macy {

	private static final String WebDriver = null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		WebElement currency = driver.findElement(By.xpath("//div[text() ='Currency']"));
		
		Actions act = new Actions(driver);
        act.moveToElement(currency).click();
        WebElement USD = driver.findElement(By.xpath("//div[text() ='USD']"));
        USD.click();
        WebDriverWait wait= new WebdriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator);
        
        act.dragAndDrop(currency, USD).build().perform();
        
	}

}
