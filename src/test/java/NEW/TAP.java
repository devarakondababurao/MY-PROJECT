package NEW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TAP {
	
WebDriver driver;

public void test_case()throws Exception {
	   
	System.setProperty("webdriver.chrome.driver","C:/chromedriver_32//chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	
}
	
}




