package handlingdropdowns;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/flights/");		
		driver.findElement(By.xpath("//div[@class='login__tab gotrible']")).click();
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.id("roundTrip")).click();
		driver.findElement(By.id("gosuggest_inputSrc")).click();
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("Debrecen (DEB)");		
		driver.findElement(By.id("gosuggest_inputDest")).click();
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys("Chennai (MAA))");		
		driver.findElement(By.id("departureCalendar")).click();
		driver.findElement(By.id("departureCalendar")).sendKeys("Thu, 10 Feb");
	}
}
