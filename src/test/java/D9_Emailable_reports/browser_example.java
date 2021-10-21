package D9_Emailable_reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CommonUtil.OR;
import CommonUtil.TestBrowser;

public class browser_example {
	
	
	static WebDriver driver;
	
	@Parameters({"Browser1"})

	@Beforetest
	public void test(String Browser) throws Exception{
		
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			driver = TestBrowser.OpenChromeBrowser();
	    }

		if(Browser.equalsIgnoreCase("FireFox"))
		{
			driver = TestBrowser.FirefoxBrowser();
		}
		
		
	}
	
	
	@Test
	public void Test2() throws Exception {
		
		
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
	    Reporter.log("Pass- open Orangehrm");
	    
		driver.findElement(By.xpath(OR.username_sendkey)).sendKeys("Admin");
		Reporter.log("Pass- Enter User Name");
		
		driver.findElement(By.xpath(OR.password_sendkey)).sendKeys("admin123");	
		Reporter.log("Pass- Enter Password");
		
		driver.findElement(By.xpath(OR.login_click)).click();
		Reporter.log("Pass- Click on Signin");
	
	}
	
	
	
	
	@AfterTest
	public void Test3() throws Exception {
		driver.close();
	}
	
	
	
	
	

}












