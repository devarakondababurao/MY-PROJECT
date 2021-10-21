package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Switch_By_FrameName {
	
	//By Index  //driver.switchTo().frame(0); 	driver.switchTo().frame(1);
	//By Name or Id //	driver.switchTo().frame("iframe1");
	//By Web Element //driver.switchTo().frame("id of the element");
	
	static WebDriver driver;
	

	@Test
	public void Login_Test() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;
	driver.get("http://www.bhavasri.com/Frames/AllContacts.html");
	
	driver.switchTo().frame("Google_ContactForm");
	findElement(By.name("firstname")).sendKeys("software");
	findElement(By.name("lastname")).sendKeys("baburao");
	findElement(By.name("subject1")).sendKeys("tester");
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame("Amazon_ContactForm");
	findElement(By.name("firstname")).sendKeys("babu");
	findElement(By.name("lastname")).sendKeys("TCS");
	findElement(By.name("subject")).sendKeys("babu TCS");
	driver.switchTo().defaultContent();
	
	
	driver.switchTo().frame("Google_ContactForm");
	findElement(By.name("firstname")).clear();
	findElement(By.name("firstname")).sendKeys("babi");
	
	findElement(By.name("lastname")).clear();
	findElement(By.name("lastname")).sendKeys("electrical");
	
	findElement(By.name("subject1")).clear();
	findElement(By.name("subject1")).sendKeys("babi electrical");
	
	//driver.quit();
	
}
	
	
	
	 public  WebElement findElement(By by) throws Exception 
		{
					
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}

	
	
	
	
	

}
