package Multiple_suits;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class flipkart_suits {
	
	WebDriver driver;
	@Test
	public void test_login()throws Exception{
		 driver=TestBrowser.OpenChromeBrowser();
		 driver.get("https://www.flipkart.com//");
	
		 
		 driver.quit();
	}
	

}
