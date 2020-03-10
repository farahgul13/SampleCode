package example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragDrop {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "D:\\Selenium web driver java\\Setups files\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  
  driver.get("https://jqueryui.com/droppable/");
  
 /* WebDriverWait wait = new WebDriverWait(driver, 5000);
   wait.until(ExpectedConditions.presenceOfElementLocated(By.id("draggable")));*/
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  Actions action = new Actions(driver);
  
  WebElement source = driver.findElement(By.id("draggable"));
  WebElement target = driver.findElement(By.id("droppable"));
  
  action.dragAndDrop(source, target).build().perform();
  
 }

}