package page_objectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;
import Day_029_PageObjectModel.HomePage;
import Day_029_PageObjectModel.LoginPage;
import Day_029_PageObjectModel.SkillsPage;

public class POM_addskills {
	
	WebDriver driver;
	
@BeforeTest
public void  TestSetup()throws Exception {
	
	driver = TestBrowser.OpenChromeBrowser();
	String TestURL = "https://opensource-demo.orangehrmlive.com/";
	driver.get(TestURL);
}
	
@Test
public void Addskills() throws Exception {
	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	LoginPage L1 = new LoginPage(driver);
	
	L1.Login();
	
	//Nationalities N1= new Nationalities();
	//N1.Nationalities(driver);
	//N1.AddNationality();
	
	Add_skills s1= new Add_skills (driver);
	
	s1.AddSkills("hrm1", "hrm2");
	
	HomePage H1= new HomePage(driver);
	
	H1.Logout();
}

@AfterTest 
public void  TestCloser()throws Exception {	
	driver.quit();
}



}









