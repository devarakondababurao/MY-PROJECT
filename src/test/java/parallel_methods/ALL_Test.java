package parallel_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import CommonUtil.OR;
import CommonUtil.TestBrowser;

public class ALL_Test {
	
	@Test
	public void OrangeHRM() throws Exception {
		
		WebDriver driver;
		
		//OpenChromeVrowser
		driver = TestBrowser.OpenChromeBrowser();
		
		//OpenUrl
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.quit();
	}
	
	
	@Test
	public void Mercury() throws Exception {
		
		WebDriver driver;
		
		//OpenChromeVrowser
		driver = TestBrowser.OpenChromeBrowser();
		
		//OpenUrl
		driver.get("http://newtours.demoaut.com/");

		//SendKeys
		driver.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
		driver.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
		
		//Close Browser		
		driver.quit();
	}
	
	
	
	
	
}                                                  












