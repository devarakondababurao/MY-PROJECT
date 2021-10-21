package Page_factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;


public class PF_nationalities {
	WebDriver driver;
	@BeforeTest 
	public void  TestSetup()throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
	}
	
	@Test
	public void PF_NATIONALITIES () throws Exception {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Login_page L1 = new Login_page(driver);
		
		L1.logintest();
		
		Nationalities N1= new Nationalities(driver);
		
		N1.AddNationality();
		
		Home_Page H1= new Home_Page(driver);
		
		H1.Logout();
		
	}
	
	@AfterTest 
	public void  TestCloser()throws Exception {
		
		driver.quit();
	}


	}


