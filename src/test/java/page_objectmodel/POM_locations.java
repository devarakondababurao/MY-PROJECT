package page_objectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;
import Day_029_PageObjectModel.HomePage;
import Day_029_PageObjectModel.Locations;
import Day_029_PageObjectModel.LoginPage;
import Day_029_PageObjectModel.Nationalities;

public class POM_locations {
	
	WebDriver driver;
	@BeforeTest
	public void Testsetup() throws Exception{
		driver=TestBrowser.OpenChromeBrowser();
		String TestURL="https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
	}
		@Test
		public void LOCATIONS() throws Exception {
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			LoginPage L1 = new LoginPage(driver);
			
			L1.Login();
			
			//Nationalities N1= new Nationalities(driver);
			
			//N1.AddNationality();
			
			Locations Lo1= new Locations(driver);
			Thread.sleep(10000);
			Lo1.AddLocations();
			
			HomePage H1= new HomePage(driver);
		
			H1.Logout();
		}
		
		@AfterTest 
		public void  TestCloser()throws Exception {	
			driver.quit();
		}
		
		
		
	






	}


