package Java_script_executer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class By_pixel {

	
	  WebDriver driver;

	    @Test
	    public void ByPixel() throws Exception {
	      
          System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
          driver = new ChromeDriver();

          JavascriptExecutor js = (JavascriptExecutor) driver;
         
          driver.get("https://www.amazon.in/");
          driver.manage().window().maximize();
          js.executeScript("window.scrollBy(0,2000)");
	    }

          
          
	    
}

