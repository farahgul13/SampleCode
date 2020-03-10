package example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;			
import org.testng.Assert;		
import org.testng.annotations.Listeners;		

@Listeners(example.ListenerTest.class)	

public class TestCases {
	  private  WebDriver driver;

	// Test to pass as to verify listeners .		
	@Test		
	public void Login()				
	{	
		  System.setProperty("webdriver.chrome.driver", "D:\\Selenium web driver java\\Setups files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
	    //driver.get("http://demo.guru99.com/V4/");		
			driver.navigate().to("http://demo.guru99.com/V4/");
	    driver.findElement(By.name("uid")).sendKeys("mngr34926");							
	    driver.findElement(By.name("password")).sendKeys("amUpenu");							
	    driver.findElement(By.name("btnLogin")).click();					
	}		

	// Forcefully failed this test as to verify listener.		
	@Test		
	public void TestToFail()				
	{		
	    System.out.println("This method to test fail");					
	    Assert.assertTrue(false);			
	}
}
