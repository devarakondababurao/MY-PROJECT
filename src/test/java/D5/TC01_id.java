package  D5;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

public class TC01_id
{
	static WebDriver driver2;

	@Test
	public void Test2() throws Exception {
	
	
		
		driver2 = TestBrowser.OpenChromeBrowser();
		//driver=driver1;
		
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver2.get(TestURL);
		
		
		findElement(By.id("txtUsername)")).sendKeys("Admin");
		findElement(By.id("txtPassword")).sendKeys("admin123");
		findElement(By.id("btnLogin")).click();
		
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_nationality")).click();
		
		
	}
	
	
	

public  WebElement findElement(By by) throws Exception 
{

	WebElement elem = driver2.findElement(by);  
	
	if (driver2 instanceof JavascriptExecutor) 
	{
	 ((JavascriptExecutor)driver2).executeScript("arguments[0].style.border='3px solid red'", elem);
 
	}
	return elem;
}

	
	
}











