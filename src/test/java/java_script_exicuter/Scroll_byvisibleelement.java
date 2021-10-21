package java_script_exicuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll_byvisibleelement {
	
	WebDriver driver;
	 @Test		
	    public void Login() throws Exception 					
	    {		
	       // WebDriver driver= new FirefoxDriver();	
	        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	         driver =new ChromeDriver();
			 driver.manage().window().maximize() ;	
	        		
			//*[@id="footer"]
			 
	     // Launch the application		
				System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
				driver =new ChromeDriver();
				driver.manage().window().maximize() ;	
				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				
				findElement(By.name("txtname")).sendkeys("admin");
				findElement(By.name("txtpassward")).sendkeys("Admin123");
				findElement(By.name("submit"))click();
				
				findElement(By.linkText("PIM")).click();
				findElement(By.linkText("Employee List")).click();
				
				
				
				
		
	

}
	private void click() {
		// TODO Auto-generated method stub
		
	}
	private Object findElement(By name) {
		// TODO Auto-generated method stub
		return null;
	}
