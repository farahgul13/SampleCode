package example;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestLoginMain {
	public WebDriver driver ; 
	PageObjectModelLoginClass objLogin;
	
  @Test(dataProvider="LoginDetails")
  public void testLoginSuccessful(String username,String password) {
	   objLogin = new PageObjectModelLoginClass(driver);
	   objLogin.login(username,password);
	   String expectedResult="Login successfully";
	   String actualResult = objLogin.getLoginTitle();
	   Assert.assertEquals(actualResult, expectedResult);
  }
  
  @BeforeTest
  public void beforeTest() {
	  String driverPath = "D:\\Selenium web driver java\\Setups files\\chromedriver_win32\\chromedriver.exe";	
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver = new ChromeDriver();
      driver.get("D:\\Selenium web driver java\\Login.htm");
  }
  @AfterTest  
  public void afterTest() {
	  driver.close();
  }
  
  @DataProvider(name="LoginDetails")
  public Object[][] getDataFromDataprovider(){
  return new Object[][] 
  	{
          { "Guru99", "India" },
          { "Krishna", "UK" },
          { "Bhupesh", "USA" }
      };

  }

}
