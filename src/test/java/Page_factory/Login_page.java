package Page_factory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	WebDriver driver;
	
	public Login_page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
    @FindBy(id="txtusername")
     WebElement Username1;
     @FindBy(id="txtpassward")
     WebElement Passward1;
     @FindBy(linkText="btnlogin")
     WebElement SignInButton1;
     public void logintest() throws Exception
     { 

 		Username1.sendKeys("Admin");
 		Passward1.sendKeys("admin123");
 		SignInButton1.click();
 	}
 	     

 	public   WebElement findElement(By by) throws Exception 
 	{

 		WebElement elem = driver.findElement(by);  
 		
 		if (driver instanceof JavascriptExecutor) 
 		{
 		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
 	 
 		}
 		return elem;
 	}}
   

