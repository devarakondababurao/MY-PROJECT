package  Webtable_1;
//import MercuryDemoTours;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonUtil.OR;


public class Login

{
	
	
	//public  static 	String UserName, Password ;
	 WebDriver driver;
	

	public Login( )throws Exception
	{  
		this.driver=driver;
		
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
	
	
	
	
	
	
		 
		 public   void openOrangeHRM()throws Exception
		 {

			 driver.get("https://opensource-demo.orangehrmlive.com/");
			 
		 }
		 
		 
		 
		 public   void OrangeHRMlogin(String UserName,String Password)throws Exception
		 {
			 
	
			 findElement(By.xpath(OR.username_sendkey)).sendKeys(UserName);
			

			findElement(By.xpath(OR.password_sendkey)).sendKeys(Password);
			
				
		 }
		 
		 
		 
		 public  void OrangeHRMSigninClick()throws Exception
		 {
			 
			 
			 	
			 	findElement(By.xpath(OR.login_click)).click();
		 }
		 
	


		 
}
	


	
	