package handlingdropdowns;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.className("form-check-label")).click();
		driver.findElement(By.id("button-one")).click();
		driver.findElement(By.id("inlineRadio21")).click();
		driver.findElement(By.id("inlineRadio24")).click();
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		System.out.println(driver.findElements(By.cssSelector("input[type='radio']")).size());
		driver.close();

	}
}
