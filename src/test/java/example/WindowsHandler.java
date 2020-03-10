package example;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandler {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "D:\\Selenium web driver java\\Setups files\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  
  driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html"); 
  
  String parentWindow= driver.getWindowHandle();
  System.out.println(parentWindow);
  WebElement btn = driver.findElement(By.xpath("//a[@class='btn btn-primary followeasy']"));
  btn.click();
  driver.manage().timeouts().implicitlyWait(60,  TimeUnit.SECONDS);
  Set windows = driver.getWindowHandles();
  System.out.println(windows);
  for(String childwindow : driver.getWindowHandles())
  {
   driver.switchTo().window(childwindow);
  }
  driver.manage().window().maximize();
  driver.findElement(By.name("session[username_or_email]")).sendKeys("fg@gmail.com");
  driver.close();
  driver.switchTo().window(parentWindow).close();
 }

}