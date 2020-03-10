package example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.thread.TestNGThread;

public class DateTimePicker {

	public static void main(String[] args) throws InterruptedException {
		
	String driverPath = "D:\\Selenium web driver java\\Setups files\\chromedriver_win32\\chromedriver.exe";
	 System.setProperty("webdriver.chrome.driver", driverPath);
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/");
	
	WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
	dateBox.sendKeys("09252013");
	dateBox.sendKeys(Keys.TAB);
	dateBox.sendKeys("0245PM");
	TestNGThread.sleep(2000);

	}

}
