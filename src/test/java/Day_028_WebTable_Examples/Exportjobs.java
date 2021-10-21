
package Day_028_WebTable_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import CommonUtil.OR;
import CommonUtil.TestBrowser;
import ExcelUtil.ExcelApiTest3;

public class Exportjobs {

	
	
	public class ExportEmployees
	{
		public String UserName,Password;

		
		
		public  int iRow;
		
		WebDriver driver;


		public void ExportEmployees(WebDriver driver )throws Exception
		{  
			this.driver=driver;
			
		}
		
		// Draws a red border around the found element. Does not set it back anyhow.
			public WebElement findElement(By by)throws Exception {
			    WebElement elem = driver.findElement(by);
			 
			    // draw a border around the found element
			    if (driver instanceof JavascriptExecutor) {
			        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
			    } 
			    Thread.sleep(10);
			    
			    return elem;
			}
			
			
		
		
		
		
		@Test
		public  void ExportAllEmployees( )throws Exception
		{  
			

		    driver=TestBrowser.OpenChromeBrowser();
				
			
				
					// driver.quit();
					 call_allmethods(1);
					 
		}
		
					 
					 
					 public void call_allmethods(int iRow )throws Exception
						{  
							
						 
						String str=String.valueOf(iRow);
						
							Login l1=new Login();
							l1.Login(driver);
							l1.openOrangeHRM();
							l1.OrangeHRMlogin("Admin","admin123");
							l1.OrangeHRMSigninClick();
							
							
							 findElement(By.xpath("//b[normalize-space()='Admin']")).click();
							 findElement(By.xpath("//a[@id='menu_admin_Job']")).click();
							 findElement(By.xpath("//a[@id='menu_admin_viewJobTitleList']")).click();
						
							 ExportEmployees Ae=new  ExportEmployees();		
							 Ae.ExportEmployees(driver);
							
							
							
							
							Ae.ExportEmployees();
					
							System.gc();
							
							
						}
						
					 

						public  void ExportEmployees()throws Exception
						{ 
							 
					        //No. of columns
							 String Empcoloums=" //*[@id='resultTable']/thead/tr/th";
							 List<WebElement>  columns = driver.findElements(By.xpath(Empcoloums)); 
						     // System.out.println("No of columns in WebTable : " + columns.size());

							//*[@id="resultTable"]/tbody/tr[1]/td[2]/a
							 
							 
					        //No.of rows 
							 String EmpRows="//*[@id='resultTable']/tbody/tr/td[2]";
					        List<WebElement>   rows = driver.findElements(By.xpath(EmpRows)); 
					       // System.out.println("No of rows in WebTable : " + rows.size());
					        
					        
		
					        			ExcelApiTest3 eat = new ExcelApiTest3();
					        			
					         		    for ( int i=1 ; i<=rows.size() ;i++)  // i=1;  i<=45 ; i=i+1
									    {
									    	  for ( int j=2 ,k=0; j<=columns.size() ;j++,k++) //j=2 ; J<=8 ; j++
									    	   {
									      		   String str1="//*[@id='resultTable']/tbody/tr["  + i +  "]"  + "/td" + "[" + j +"]";
									      		   
									      		//*[@id="resultTable"]/tbody/tr[1]/td[2] 
									      		   
									      		   //*[@id="resultTable"]/tbody/tr[1]/td[2]
									      		   
									      		    //*[@id="resultTable"]/tbody/tr[1]/td[2]
									    		    WebElement Ele=findElement(By.xpath(str1));
									    		   
									    	        String WebElementText = Ele.getText();
									    	       //System.out.println("Get Text Value is from the WebElement: " + valueIneed1);
									    	        
									    	        if (WebElementText !=null)
									    	        eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_jobslist.xls","Sheet1",i,k,WebElementText);
									    	        else
									    	        eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_jobslist.xls","Sheet1",i,k,"Blank Data");
									    	        	
									    	   }
									    }
					         		    
					   
						
						}
						
						
						

	}
					        
						
						
					
						
						
						
						
							
			







}
