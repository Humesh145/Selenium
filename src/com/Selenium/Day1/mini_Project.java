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
import org.openqa.selenium.support.ui.Wait;

public class mini_Project {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver1.exe");

WebDriver driver = new ChromeDriver();

driver.get("http://automationpractice.com/index.php");

WebElement Login = driver.findElement(By.xpath("//a[@class='login']"));
Login.click();

WebElement create = driver.findElement(By.xpath("(//input[@type= 'text'] )[2]"));
create.sendKeys("mpini@iurrueewr.com");

WebElement a = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
a.click();

Thread.sleep(5000);

WebElement b = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
b.click();

WebElement c = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
c.sendKeys("mini");

WebElement d = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
d.sendKeys("project");

WebElement e = driver.findElement(By.xpath("//input[@id='passwd']"));
e.sendKeys("Poda@123");

Thread.sleep(2000);

WebElement f = driver.findElement(By.xpath("//select[@id='days']"));
Select day = new Select(f);
day.selectByValue("23");

WebElement g = driver.findElement(By.xpath("//select[@id='months']"));
Select month = new Select(g);
month.selectByIndex(05);


WebElement h = driver.findElement(By.xpath("//select[@id='years']"));
Select year = new Select(h);
year.selectByValue("1998");


WebElement i = driver.findElement(By.xpath("//input[@id='newsletter']"));
i.click();

WebElement j = driver.findElement(By.xpath("//input[@id='optin']"));
j.click();


WebElement k = driver.findElement(By.xpath("//input[@id='company']"));
k.sendKeys("Selenium");

WebElement l = driver.findElement(By.xpath("//input[@id='address1']"));
l.sendKeys("Selenium Framework,");

WebElement m = driver.findElement(By.xpath("//input[@id='address2']"));
m.sendKeys("Research Triangle Park");

WebElement n = driver.findElement(By.xpath("//input[@id='city']"));
n.sendKeys("Research Triangle Park");

WebElement o = driver.findElement(By.xpath("//select[@id='id_state']"));
Select state = new Select(o);
state.selectByIndex(05);

WebElement p = driver.findElement(By.xpath("//input[@id='postcode']"));
p.sendKeys("27007");

WebElement q = driver.findElement(By.xpath("//select[@id='id_country']"));
Select con = new Select(q);
con.selectByIndex(1);

WebElement r = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
r.sendKeys("8754369875");

WebElement s = driver.findElement(By.xpath("//input[@id='alias']"));
s.clear();
s.sendKeys("mini1@r.com");

WebElement t = driver.findElement(By.xpath("//button[@id='submitAccount']"));
t.click();

Thread.sleep(2000);

WebElement u = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
u.click();

WebElement v = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
v.click();

//span[text()= 'Add to cart']

WebElement x = driver.findElement(By.xpath("(//span[text()= 'Add to cart'])[1]"));
x.click();

//a[@title= 'Proceed to checkout']

Thread.sleep(5000);


WebElement y = driver.findElement(By.xpath("//a[@title= 'Proceed to checkout']"));
y.click();



//a[@title= 'Proceed to checkout'])[2]


WebElement z = driver.findElement(By.xpath("(//a[@title= 'Proceed to checkout'])[2]"));
z.click();

//button[@type='submit'])[2]
		
		WebElement aa = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		aa.click();	
		
		//input[@type='checkbox']
		
		WebElement ab = driver.findElement(By.xpath("//input[@type='checkbox']"));
		ab.click();	
		
		
				
				WebElement ac = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
				ac.click();	
		
				//a[ @title= 'Pay by bank wire']
				Thread.sleep(2000);
		
				WebElement ad = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
				ad.click();	
				
				//button[ @type= 'submit'])[2]
				
				Thread.sleep(2000);
						
						WebElement ae = driver.findElement(By.xpath("//button[contains(@class,'button btn')]"));
						ae.click();	
						
						TakesScreenshot af = (TakesScreenshot) driver;
						File ag = af.getScreenshotAs(OutputType.FILE);
						File ah = new File("C:\\Users\\Humesh\\eclipse-workspace\\Selenium\\Screenshot\\Snap.png");
						FileUtils.copyFile(ag, ah);
							


	}

}
