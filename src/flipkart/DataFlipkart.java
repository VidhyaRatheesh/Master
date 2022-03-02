package flipkart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataFlipkart {

	public static void main(String[] args) throws Exception {

		fileData data = new fileData();
		ArrayList<String> exceldata = data.getData("Login");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");// get browser
		driver.getTitle();// get browser title
		// System.out.println(driver.getTitle());// get title
		driver.getCurrentUrl();
		// System.out.println(driver.getCurrentUrl());// get url

		// driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).click();
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(exceldata.get(1));
		driver.findElement(By.xpath("//input[@type='password']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(exceldata.get(2));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"))
				.sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"))
				.sendKeys(Keys.ENTER);
		driver.navigate().to(
				"https://www.flipkart.com/poco-c31-royal-blue-64-gb/p/itm19effae969b86?pid=MOBG73E7GKQK4KZP&lid=LSTMOBG73E7GKQK4KZPR5ICMK&marketplace=FLIPKART&q=mobiles&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=6ded8714-fea1-4913-a99a-eb99519aaf63.MOBG73E7GKQK4KZP.SEARCH&ppt=sp&ppn=sp&ssid=kfzal5wetc0000001646070590210&qH=eb4af0bf07c16429");

		List<WebElement> selections = driver.findElements(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		for (WebElement selection : selections) {
			if (selection.getText().equalsIgnoreCase("₹9,499")) {
				String price = selection.getText();
				// System.out.println(price);
				String k = null;
				String[] words = price.split("₹");

				for (String w : words) {
					k = w.replaceAll(",", "");
					System.out.println(k);
				}

				String abc = new String(k);
				int IntegerValue = Integer.parseInt(abc);
				// System.out.println(IntegerValue);

				int m = IntegerValue + 1000;

				System.out.println(m);

			}

		}

		driver.close();

	}

}
