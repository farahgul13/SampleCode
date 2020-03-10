package example;

	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;	
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	 private WebDriver driver;
	
  @Test(priority = 0,groups = "GroupOne" )
  public void testwithGroup() {
	  //driver.get("http://demo.guru99.com/test/guru99home/");  
	  driver.navigate().to("http://demo.guru99.com/test/guru99home/");
	  Reporter.log("Demo Guru99 website open");
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 
		 Reporter.log("Verify title");
  }
  @Test(priority = 1,groups = "GroupOne" )
  public void SecondtestwithGroup() {
	  //driver.get("http://demo.guru99.com/test/guru99home/");  
	  driver.navigate().to("http://newtours.demoaut.com/");
	  Reporter.log("New tour website open");
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Welcome: Mercury Tours")); 
		 Reporter.log("Verify title");
  }
  @Test(groups = "GroupTwo")
  public void testwithoutGroup() {
	  //driver.get("http://newtours.demoaut.com/");  
	  driver.navigate().to("http://newtours.demoaut.com/");
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Welcome: Mercury Tours")); 	
  }
  @BeforeTest(groups = {"Initialize"})
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium web driver java\\Setups files\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterTest(groups = "Initialize")
  public void afterTest() {
	  driver.quit();	}
}

//If we don’t mention any priority, testng will execute the @Test methods based on alphabetical order of their method names irrespective of their place of implementation in the code.
//test case means test case will the lower priority value will be executed first.
//There may be a chance that methods may contain same priority. In those cases, testng considers the alphabetical order of the method names whose priority is same.
/*First preference: Non-prioritized methods: ‘c’ and ‘b’: Based on alphabetical order ‘b’ was executed first and then ‘c’.
Second preference: Prioritized methods: ‘a’, ‘e’ and ‘d’: ‘e’ was executed first as it was having highest priority(0).
 As the priority of ‘a’ and ‘d’ methods were same, 
testng considered the alphabetical order of their methods names. So, between them, ‘a’ was executed first and then ‘d’.*/
//we will use 'dependsOnMethods' attribute to make dependency and order of execution.