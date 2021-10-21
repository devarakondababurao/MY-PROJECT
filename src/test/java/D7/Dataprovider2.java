package D7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class Dataprovider2 {
	WebDriver driver;
	
	@DataProvider(name ="google")
public static Object[][] test()throws Exception{
		
		return new Object[][] {
			  {"https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indian90" },
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indian91" }, 
	        	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indian92" }
	        	};
	}
		
	        	@Test(dataProvider = "google")
	        	public void test(String TestURL,String UserName,String Password,String Nationality) throws Exception {
	        		
	        		//OpenChromeBrowser
	        		driver = TestBrowser.OpenChromeBrowser();

	        		//OpenUrl
	        		driver.get(TestURL);
	        		

	        		//SendKeys
	        		 findElement(By.id("txtUsername")).sendKeys(UserName);
	        		 findElement(By.id("txtPassword")).sendKeys(Password);
	        		 findElement(By.id("btnLogin")).click();
	        		
	        			  
	        		 	
	        		 
	        		
	        		  findElement(By.linkText("Admin")).click();
	        		  findElement(By.linkText("Nationalities")).click();
	        		  findElement(By.name("btnAdd")).click();
	        		  findElement(By.id("nationality_name")).sendKeys(Nationality);
	        		  findElement(By.id("btnSave")).click();
	        		 
	        		 

	        		  WebElement Element1 = findElement(By.linkText(Nationality));
	        		  JavascriptExecutor js = (JavascriptExecutor) driver;
	        		  js.executeScript("arguments[0].scrollIntoView();", Element1);
	        			
	        		
	        			
	        		
	        		
	        		driver.quit();
	        		
	        		
	        	}
	        	
	        	
	        	
	        	
	        	
	        	// Draws a red border around the found element. Does not set it back anyhow.
	        		public  WebElement findElement(By by) throws Exception {
	        			
	        		    WebElement elem = driver.findElement(by);
	        		    	    
	        		    // draw a border around the found element
	        		    if (driver instanceof JavascriptExecutor) {
	        		        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	        		        
	        		  //  TH3.HTMLScreenShot("Screen Shot","Click Here","Pass", HtmlOutputFileName,driver);
	        		        
	        		    }
	        		    return elem;
	        		}
	        		
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	 
	        	
	        }









		
			
			
		
	


