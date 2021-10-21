package D9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;
import ExcelUtil.ExcelApiTest4;

public class Data_provider_nonstatic_parameter {
	
static WebDriver driver;
	
	@DataProvider(name = "TC01_Add_Nationality")
	public static Object[][] Authentication1() throws Exception {
		
		ExcelApiTest4 eat = new ExcelApiTest4();
		Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC01_Nationality3.xlsx", "Sheet1");
		System.out.println(testObjArray.length);
		return (testObjArray);
	}
 

	@Test(dataProvider="TC01_Add_Nationality")
	public void Login_Test(String Browser,String TestURL,String UserName,String Password,String Nationality) throws Exception
	{
		
					if(Browser.equalsIgnoreCase("Chrome"))
					{
						driver = TestBrowser.OpenChromeBrowser();
					 	
				    }

					if(Browser.equalsIgnoreCase("FireFox"))
					{
							driver = TestBrowser.FirefoxBrowser();
							Thread.sleep(10000);
					}
					
					
					if(Browser.equalsIgnoreCase("RemoteWebDriver1"))
					{
							driver = TestBrowser.RemoteWebDriver();
							Thread.sleep(10000);
					}
					
					
					
					Data_provider_nonstatic_parameter TN =new Data_provider_nonstatic_parameter();
					
					TN.OpenOrangeHRM(TestURL);
					TN.Login(UserName,Password);
					TN.AddNationalities(Nationality);
					driver.quit();
	}
	
	
	
	public  void Login(String UserName,String Password) throws Exception
	{
		findElement(By.name("txtUsername")).sendKeys(UserName);
		findElement(By.name("txtPassword")).sendKeys(Password);
		findElement(By.id("btnLogin")).click();

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
 
	
	
	
	
	
	public  void OpenOrangeHRM(String Testurl) throws Exception
	{
		
		driver.get(Testurl);
	}
	
	
	
	
	public    void AddNationalities(String Nationality) throws Exception
	{
		
	
		
		Thread.sleep(5000);
		
		//driver.findElement(By.linkText("Admin")).click();
		
		  JavascriptExecutor js = (JavascriptExecutor)driver;		
		 WebElement button =findElement(By.linkText("Admin"));	
	      js.executeScript("arguments[0].click();", button);
		
			Thread.sleep(5000);
	
		findElement(By.linkText("Nationalities")).click();
		Thread.sleep(7000);
		findElement(By.name("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys(Nationality);
		findElement(By.id("btnSave")).click();
		
	}
	
	
	
	
	
	

}

