package handlingdropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.id("gridCheck")).isSelected();
		driver.findElement(By.id("gridCheck")).click();
		System.out.println(driver.findElement(By.id("gridCheck")).isSelected());
		driver.findElement(By.id("check-box-one")).isSelected();
		driver.findElement(By.id("check-box-two")).isSelected();
		driver.findElement(By.id("button-two")).click();
		driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.close();
	}
}
