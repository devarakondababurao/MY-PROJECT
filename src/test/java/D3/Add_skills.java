package D3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_skills {
	
 WebDriver driver;
 

   public Add_skills () throws Exception{
	   
	   Add_skills T1=new Add_skills();
	  
	    
	      T1.OpenChromeBrowser();
		  T1.OpenOrnageHRM();
		  T1.Login();
		  T1.Addjobs();
		  T1.CloseBrowser();
   }

	  
	  
	  
	  public void OpenChromeBrowser() throws Exception
	  {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize() ;
	  }
	  
	  public void OpenOrnageHRM() throws Exception
	  {
		  driver.get("https://opensource-demo.orangehrmlive.com/");
	  }
	  
	  public void Login() throws Exception
	  {
			findElement(By.id("txtUsername")).sendKeys("Admin");
			findElement(By.id("txtPassword")).sendKeys("admin123");
			findElement(By.id("btnLogin")).click();
			
	  }
	  
	  
	  public void Addjobs() throws Exception
	  {
		  	findElement(By.id("menu_admin_viewAdminModule")).click();
			findElement(By.id("menu_admin_Job")).click();
			findElement(By.id("menu_admin_viewJobTitleList")).click();
			findElement(By.id("btnAdd")).click();
			findElement(By.id("jobTitle_jobTitle")).sendKeys("jobs 5");
			findElement(By.id("jobTitle_jobDescription")).sendKeys("jobs 56 descr");
			findElement(By.id("jobTitle_note")).sendKeys("jobs 56Note");
			findElement(By.id("btnSave")).click();
	  }
	  
	  public void CloseBrowser() throws Exception
	  {
		  	driver.quit();
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
