package example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicControlAccess {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "D:\\Selenium web driver java\\Setups files\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("D:\\Selenium web driver java\\Basic Control Access\\NewRegistration.htm");
  
  //Select Email 
  WebElement emailtextbox = driver.findElement(By.name("email"));
  emailtextbox.clear();
  emailtextbox.sendKeys("fg@gmail.com");
  
  //Select  Password
  WebElement passwordtextbox = driver.findElement(By.name("password"));
  passwordtextbox.clear();
  passwordtextbox.sendKeys("123456");
  
  //Select gender 
  WebElement gendeRradiobutton = driver.findElement(By.id("gender_2"));
  gendeRradiobutton.click();
  
  //Select "interest in subjects"
  WebElement checkboxSQA = driver.findElement(By.id("subject_1"));
  checkboxSQA.click();
  
  WebElement checkboxDevOps = driver.findElement(By.id("subject_3"));
  checkboxDevOps.click();
  
  //Select Location
  Select locationdropdown = new Select(driver.findElement(By.id("myLocation")));
  locationdropdown.selectByVisibleText("Lahore");
  
  //Select time slot
  Select timeslotList = new Select(driver.findElement(By.id("timeSlot")));
  timeslotList.selectByValue("11");
  
  //Click Register button
  WebElement registerButton = driver.findElement(By.id("register"));
  registerButton.click();
  
  //Select help link
 WebElement helpLink = driver.findElement(By.partialLinkText("Help"));
  helpLink.click();
  //Navigate back to registration page
  driver.navigate().back();
  //driver.close();

 }

}