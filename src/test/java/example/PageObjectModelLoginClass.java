package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectModelLoginClass {

		WebDriver driver;

	    By userName = By.name("username");
	    By password = By.name("password");
	    By resultText =By.id("demo");
	    By login = By.id("Login");
	    
	    public PageObjectModelLoginClass(WebDriver driver){
	        this.driver = driver;
	    }
	    
	    public void setUserName(String strUserName){
	    	 driver.findElement(userName).clear();
	        driver.findElement(userName).sendKeys(strUserName);
	    }

	    public void setPassword(String strPassword){
	    	driver.findElement(password).clear();
	         driver.findElement(password).sendKeys(strPassword);
	    }

	    //Click  login button
	    public void clickLogin(){
	            driver.findElement(login).click();
	    }

	    //Get the title of Login Page
	    public String getLoginTitle(){
	     return    driver.findElement(resultText).getText();
	    }

	    public void login(String strUserName,String strPasword){
	        //Fill user name
	        this.setUserName(strUserName);

	        //Fill password
	        this.setPassword(strPasword);

	        //Click Login button
	        this.clickLogin();        
	    }
}
