package Java_script_executer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Byelement {

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
			
			findElement(By.name("txtUsername")).sendKeys("Admin");
			findElement(By.name("txtPassword")).sendKeys("admin123");
			findElement(By.name("Submit")).click();
			
			findElement(By.linkText("Recruitment")).click();
			findElement(By.linkText("Vacancies")).click();
			
			
       
        WebElement Element = findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]"));
 
     
        //How to do scrolling	
        JavascriptExecutor js = (JavascriptExecutor)driver;		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        
        
        System.gc();

    }		
    
    
    public  WebElement findElement(By by) throws Exception 
	{
				
		 WebElement elem = driver.findElement(by);    	    
		
		 
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		
		return elem;
	}
 
    
    
    
}

