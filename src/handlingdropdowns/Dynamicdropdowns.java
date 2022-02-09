package handlingdropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdowns {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.findElement(By.className("select2-selection__arrow")).click();
		driver.findElement(By.cssSelector("input[aria-label='Search']")).sendKeys("Florida");
		driver.findElement(By.cssSelector("input[aria-label='Search']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		// auto suggesting dropdown pick from list
		driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple'][1]")).sendKeys("New");
		List<WebElement> options = driver.findElements(By.xpath("//li[@role='option']"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("New Mexico")) {
				option.click();
			}
		driver.findElement(By.cssSelector(".select2-selection.select2-selection--multiple")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple'][1]")).sendKeys("New");
		List<WebElement> selections = driver.findElements(By.xpath("//li[@role='option']"));
		for (WebElement selection : selections) {
			if (selection.getText().equalsIgnoreCase("New York")) {
				selection.click();
			}
		}
		}
		driver.close();
	}

}
