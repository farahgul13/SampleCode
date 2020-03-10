package example;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class GridControls {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium web driver java\\Setups files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\Selenium web driver java\\Static & Dynamic grid\\Grid.htm");
		//Static table
		WebElement webTable_1 = driver.findElement(By.xpath("//body/table[1]/tbody"));
		
		//No. of rows in table
		List<WebElement> rowTable_1 = webTable_1.findElements(By.tagName("tr"));
		int rowCount = rowTable_1.size();
		System.out.println("Rows Count "+rowCount);
		
		for(int row=0; row <rowCount; row++)
		{
			List<WebElement> columnCounts = rowTable_1.get(row).findElements(By.tagName("td"));
			int columnCount = columnCounts.size();
			System.out.println("Column Count "+columnCount);
			for(int column=0; column < columnCount ; column++)
			{
				String celltext = columnCounts.get(column).getText();
				System.out.println("Text at row  "+row+" and coulmn  "+column+" is "+celltext);
			}
		}
		String[][] VisitInfo = {
                {"Karachi","Sea View"},
                {"Hunza","Altit Fort"}};

		//Dynamic tables
		WebElement webTable_2 = driver.findElement(By.xpath("//table[2]/tbody"));
		
		//No. of rows in table
		List<WebElement> rowTable_2 = webTable_2.findElements(By.tagName("tr"));
		int rowCount_2 = rowTable_2.size();
		System.out.println("Rows Count "+rowCount_2);
		
		for(int row=1; row <rowCount_2; row++)
		{
			List<WebElement> columnCounts = rowTable_2.get(row).findElements(By.tagName("td"));
			int columnCount_2 = columnCounts.size();
			System.out.println("Column Count "+columnCount_2);
			for(int column=1; column < columnCount_2; column++)
			{
				WebElement city = webTable_2.findElement(By.xpath("//tr[" + row + "]/td[" + column + "]/input"));
				city.sendKeys(VisitInfo[row-1][column-1]);
				int colnxt = column+1;
				WebElement placeofVisit = webTable_2.findElement(By.xpath("//tr[" + row + "]/td["+ colnxt +"]/input"));
				 placeofVisit.sendKeys(VisitInfo[row-1][colnxt-1]);
			}
		}
		
		WebElement SubmitBtn = webTable_2.findElement(By.cssSelector("input[type=button]"));
		SubmitBtn.click();

	}
}




