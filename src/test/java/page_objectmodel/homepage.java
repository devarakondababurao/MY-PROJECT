package page_objectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	WebDriver driver;
	 public homepage(WebDriver driver)
	 {
		 this.driver=driver;
		  }
 public void logout() throws Exception {
	 findElement(By.id("wellcome")).click();
	 findElement(By.xpath("logout")).click();
 }
 public   WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}
	
	
	
	
}



