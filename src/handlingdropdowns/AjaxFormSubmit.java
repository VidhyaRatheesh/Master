package handlingdropdowns;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjaxFormSubmit {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://selenium.obsqurazone.com/ajax-form-submit.php");
		driver.findElement(By.id("subject")).sendKeys("To know about Automation Testing");
		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("study about automation testing");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		driver.close();
	}
}
