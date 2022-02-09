package handlingdropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectElement {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.findElement(By.cssSelector(".select2-selection.select2-selection--multiple")).sendKeys(Keys.ENTER);
		Select country = new Select(driver.findElement(By.xpath("(//select[@name='states[]'])[1]")));
		country.selectByVisibleText("Arizona");
		country.selectByVisibleText("California");
		country.selectByVisibleText("Oregon");
		// country.deselectByValue("AZ");
		// country.deselectByValue("CA");
		country.deselectAll();

		driver.close();

	}
}
