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
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.booking.com/");
		driver.findElement(By.xpath("//span[normalize-space()='Flights']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Round-trip')]")).click();
		driver.findElement(By.cssSelector(".css-1k0jlfl")).click();
		List<WebElement> options = driver.findElements(By.className("css-1k0jlfl"));		
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("4")) {
				option.click();
			}
		}
		
		driver.findElement(By.cssSelector("div[class='css-vvcyi3'] div div div")).click();
		driver.findElement(By.cssSelector(".css-153jucu")).click();	
		WebElement staticdropdown1 = driver.findElement(By.className("css-153jucu"));
		Select dropdown1 = new Select(staticdropdown1);
		dropdown1.selectByIndex(3);
		System.out.println(dropdown1.getFirstSelectedOption().getText());
		
		//driver.findElement(By.cssSelector("Text-module__root--variant-strong_2___1U9wM")).click();
		//driver.findElement(By.cssSelector(".css-153jucu")).click();
		
		
		
		driver.findElement(By.cssSelector(".css-p6nr6s")).click();
		driver.findElement(By.cssSelector(".css-1eii3rq")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("Trivandrum");
		driver.findElement(By.cssSelector("input[class='css-bwf0ll']")).click();
		driver.findElement(By.cssSelector("input[class='css-bwf0ll']")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.className("css-g0pg3f-SearchboxInput")).click();
		driver.findElement(By.cssSelector("input[class='css-1tl2oa1']")).sendKeys("Delhi");
		driver.findElement(By.cssSelector("input[class='css-bwf0ll']")).click();
		driver.findElement(By.cssSelector("input[class='css-bwf0ll']")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.cssSelector("input[placeholder='Depart']")).click();
		driver.findElement(By.cssSelector("span[data-date-cell='2022-02-10']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Return']")).click();
		driver.findElement(By.cssSelector("span[data-date-cell='2022-02-16']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
        driver.close();
     }
}

