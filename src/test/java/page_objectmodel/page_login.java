package page_objectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class page_login {
	
	WebDriver driver;
	
	public  page_login(WebDriver driver) {
		
		 this.driver =driver;
		 
	}
	public void loginpage()throws Exception{
		findElement(By.name("txtusername")).sendKeys("Admin");
		findElement(By.name("txtpassward")).sendKeys("Admin123");
		findElement(By.id("btnlogin")).click();
		
		
	}
	
	public   WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	

	}}
