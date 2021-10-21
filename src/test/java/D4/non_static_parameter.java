package D4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class non_static_parameter {
	
  

static WebDriver driver;
  
  String Username="Admin",Password="Admin123";
  String Nationality="spain";
  
  
 public void logintest()throws Exception{
 
 
           non_static_parameter.OpenChromeBrowser();
            non_static_parameter.OpenOrangeHRM();
            non_static_parameter.Login(UserName,Password);
             non_static_parameter.AddNationalities(Nationality);
	driver.quit();
}

//local variables
public static void Login(String UserName1,String Password1) throws Exception
{
	findElement(By.name("txtUsername")).sendKeys(UserName1);
	findElement(By.name("txtPassword")).sendKeys(Password1);
	findElement(By.id("btnLogin")).click();
}

public static   void AddNationalities(String Nationality1) throws Exception
{
	

	findElement(By.id("menu_admin_viewAdminModule")).click();
	findElement(By.id("menu_admin_nationality")).click();
	findElement(By.id("btnAdd")).click();
	findElement(By.id("nationality_name")).sendKeys(Nationality1);
	findElement(By.id("btnSave")).click();
	
	
}


public static  WebElement findElement(By by) throws Exception 
{
			
	 WebElement elem = driver.findElement(by);    	    
	
	 
	if (driver instanceof JavascriptExecutor) 
	{
	 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);

	}
	
	return elem;
}






public static void OpenOrangeHRM() throws Exception
{
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
}


public static void OpenChromeBrowser() throws Exception
{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	

}













}

 

