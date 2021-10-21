package Date_time_picker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class date_time {
	 static WebDriver driver;

		@Test
		public void Test2() throws Exception {
		
			driver = TestBrowser.OpenChromeBrowser();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			String TestURL = "https://opensource-demo.orangehrmlive.com/";
			driver.get(TestURL);
			
			
			findElement(By.id("txtUsername")).sendKeys("Admin");
			findElement(By.id("txtPassword")).sendKeys("admin123");
			findElement(By.id("btnLogin")).click();
			
			findElement(By.linkText("Leave")).click();
			findElement(By.linkText("Leave List")).click();
			
			driver.findElement(By.xpath("//*[@id='frmFilterLeave']/fieldset/ol/li[1]/img")).click();
			
			
			
			Select listbox5 =new Select(driver.findElement(By.className("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")));
		 	 listbox5.selectByVisibleText("Mar");
		 	 
		 	Select listbox6 =new Select(driver.findElement(By.className("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")));
		 	 listbox6.selectByVisibleText("2016");
		 	 
		 	//a[text()='15']
			
			String str2="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[2]/a";
			WebElement date2=findElement(By.xpath(str2));
			
		 	Actions act1 = new Actions(driver);
		 	act1.moveToElement(date2).click().build().perform();
		 	
		 	
		 	findElement(By.xpath("//*[@id=\"calFromDate\"]")).sendKeys("2016-03-1");
		 	
		 	
		 	
		 	Select listbox7 =new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[4]/a")));
		 	 listbox7.selectByVisibleText("Mar");
		 	 
		 	Select listbox8 =new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")));
		 	 listbox8.selectByVisibleText("2017");
		 	 
		 	
		 	String str3="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[4]/a";
			WebElement date3=findElement(By.xpath(str3));
			
		 	Actions act2 = new Actions(driver);
		 	act2.moveToElement(date3).click().build().perform();
		 	
			
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

