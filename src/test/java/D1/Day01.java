package D1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day01 {
	@Test
	 
	    public void shouldAnswerWithTrue()
	    {
	       System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.gmail.com");
	    }

}
