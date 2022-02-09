package handlingdropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormSubmit {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		driver.findElement(By.id("validationCustom01")).sendKeys("Vidhya");
		driver.findElement(By.xpath("//input[@id='validationCustom02']")).sendKeys("Vijayan");
		driver.findElement(By.id("validationCustomUsername")).sendKeys("VidhyaVijayan");
		driver.findElement(By.id("validationCustom03")).sendKeys("Trivandrum");
		driver.findElement(By.id("validationCustom04")).sendKeys("Kerala");
		driver.findElement(By.id("validationCustom05")).sendKeys("695588");
		driver.findElement(By.cssSelector("label[for='invalidCheck']")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.close();
	}
}
