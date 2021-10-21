package Event_FIRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import CommonUtil.EventHandler;

public class WEB_ELEMENT_BORDER {
static WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	

	    EventFiringWebDriver driver1 = new EventFiringWebDriver(driver);
	    EventHandler handler = new EventHandler();
	     driver1.register(handler);
	    
	   driver.get("https://opensource-demo.orangehrmlive.com/");	
	   driver1.findElement(By.name("txtUsername")).sendKeys("Admin");
	   driver1.findElement(By.name("txtPassword")).sendKeys("admin123");
	   driver1.findElement(By.name("Submit")).click();
		
	}

}



