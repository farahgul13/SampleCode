package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "D:\\Selenium web driver java\\Setups files\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  
  driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html"); 
  
  WebElement btn = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
  btn.click();
  
  String text = driver.switchTo().alert().getText();
  System.out.println(text);
  
  driver.switchTo().alert().sendKeys("Farah");
  driver.switchTo().alert().accept();
  driver.close();
  
  
 }

}