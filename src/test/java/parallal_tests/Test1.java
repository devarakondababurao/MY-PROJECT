package parallal_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class Test1 {
   WebDriver driver;
	
	@Test
	public void Open_OrangeHRM() throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.quit();
	}

}
