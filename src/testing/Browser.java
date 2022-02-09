package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Browser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");// get browser
		driver.getTitle();// get browser title
		System.out.println(driver.getTitle());// get title
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());// get url
		// driver.quit(); // quit the application
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.className("inventory_item_name")).click();
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory-item.html?id=4");

		driver.close(); // close the current tab
	}
}
