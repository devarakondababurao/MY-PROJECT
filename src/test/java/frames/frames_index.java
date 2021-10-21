package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frames_index {
	
	static WebDriver driver;
	@Test
	public void Login_Test() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;
	driver.get("http://www.bhavasri.com/Frames/AllContacts.html");
	
	List<WebElement> frames= driver.findElements(By.name("ifreme"));
	System.out.println("Numnber of frames: " + frames.size());
	
	
	driver.switchTo().frame(frames.get(0));
	findElement(By.name("fastname")).sendKeys("nenu");
	findElement(By.name("lastname")).sendKeys("life");
	findElement(By.id("subject1")).sendKeys("hello");
	driver.switchTo().defaultContent();
	
	
	driver.switchTo().frame(frames.get(1));
	findElement(By.name("firstname")).sendKeys("dream");
	findElement(By.name("lastname")).sendKeys("success");
	driver.switchTo().defaultContent();
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

