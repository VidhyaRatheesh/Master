package handlingdropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.findElement(By.cssSelector(".makeFlex.hrtlCenter.font10.makeRelative.lhUser.userLoggedOut")).click();
		driver.findElement(By.xpath("//div/ul/li[@data-cy='roundTrip']")).click();
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Delhi");
		Thread.sleep(3000);
		driver.quit();
	}
}
