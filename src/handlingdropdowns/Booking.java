package handlingdropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Booking {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.booking.com/");
		driver.findElement(By.xpath("//span[normalize-space()='Flights']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Round-trip')]")).click();
		driver.findElement(By.cssSelector(".css-1k0jlfl")).click();
		WebElement staticdropdown = driver.findElement(By.cssSelector(".css-1k0jlfl"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		driver.findElement(By.xpath("(//div[contains(text(),'1 adult')])[1]")).click();
		driver.findElement(By.cssSelector(".css-153jucu")).click();
		driver.findElement(By.xpath("(//button[@class='css-153jucu'])[2]")).click();
		
		Select ChildAge = new Select(driver.findElement(By.xpath("(//select[@id='__bui-6'])")));
		ChildAge.selectByValue("6");
		System.out.println(ChildAge.getFirstSelectedOption().getText());
		 

		driver.findElement(By.cssSelector(".css-ya5gr9")).click();

		driver.findElement(By.cssSelector(".css-p6nr6s")).click();
		driver.findElement(By.cssSelector(".css-1eii3rq")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("Trivandrum");
		List<WebElement> selections = driver.findElements(By.xpath("//div[@class='css-1bbz8d7 14px']"));
		for (WebElement selection : selections) {
			if (selection.getText().equalsIgnoreCase("TRV")) {
				selection.click();
			}
		}

		driver.findElement(By.cssSelector("input[class='css-bwf0ll']")).click();
		driver.findElement(By.cssSelector("input[class='css-bwf0ll']")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.className("css-g0pg3f-SearchboxInput")).click();
		driver.findElement(By.cssSelector("input[class='css-1tl2oa1']")).sendKeys("Delhi");
		List<WebElement> selections1 = driver.findElements(By.xpath("//div[@class='css-1bbz8d7 14px']"));
		for (WebElement selection : selections1) {
			if (selection.getText().equalsIgnoreCase("DEL")) {
				selection.click();
			}
		}
		driver.findElement(By.cssSelector("input[class='css-bwf0ll']")).click();
		driver.findElement(By.cssSelector("input[class='css-bwf0ll']")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.cssSelector("input[placeholder='Depart']")).click();
		driver.findElement(By.cssSelector("span[data-date-cell='2022-02-12']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Return']")).click();
		driver.findElement(By.cssSelector("span[data-date-cell='2022-02-16']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		driver.close();
	}
}
