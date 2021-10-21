package D3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Add_skills2 { 
	
	 static WebDriver driver;


	@Test
	  public void JobsTest() throws Exception {
		  
		  Add_skills2.OpenChromeBrowser();
		  Add_skills2.OpenOrnageHRM();
		  Add_skills2.Login();
		  Add_skills2.Addjobs();
		  Add_skills2.CloseBrowser();

	  }
	  
	  
	  public static void OpenChromeBrowser() throws Exception
	  {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize() ;
	  }
	  
	  public static  void OpenOrnageHRM() throws Exception
	  {
		  driver.get("https://opensource-demo.orangehrmlive.com/");
	  }
	  
	  public static void Login() throws Exception
	  {
			findElement(By.id("txtUsername")).sendKeys("Admin");
			findElement(By.id("txtPassword")).sendKeys("admin123");
			findElement(By.id("btnLogin")).click();
			
	  }
	  
	  
	  public static void Addjobs() throws Exception
	  {
		  	findElement(By.id("menu_admin_viewAdminModule")).click();
			findElement(By.id("menu_admin_Job")).click();
			findElement(By.id("menu_admin_viewJobTitleList")).click();
			findElement(By.id("btnAdd")).click();
			findElement(By.id("jobTitle_jobTitle")).sendKeys("Sales6");
			findElement(By.id("jobTitle_jobDescription")).sendKeys("Sales6 descr");
			findElement(By.id("jobTitle_note")).sendKeys("Sales6 Note");
			findElement(By.id("btnSave")).click();
	  }
	  
	  public static void CloseBrowser() throws Exception
	  {
		  	driver.quit();
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
	  
	  
	  
	  
	}



