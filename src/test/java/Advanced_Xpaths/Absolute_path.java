package Advanced_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Absolute_path {
	
	WebDriver driver;
	
	@Test 
	public void logintest()throws Exception{
		
		
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver_32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		
		//Password
		findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		
		//Login
		findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
			
		
	}
	
	
	 public  WebElement findElement(By by) throws Exception 
		{
					
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		

	}}
	


