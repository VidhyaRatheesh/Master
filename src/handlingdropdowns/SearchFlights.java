package handlingdropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchFlights {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//p[normalize-space()='One way']")).click();
		driver.findElement(By.cssSelector("input[class='field bw-1 bs-solid w-100p p-2 box-border br-4 fs-2 c-neutral-900 h-8 bc-neutral-100 c-neutral-900 focus:bc-secondary-500 flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 null']")).sendKeys("TRV - Trivandrum, IN");
		driver.findElement(By.xpath("//input[@class='field bw-1 bs-solid w-100p p-2 box-border br-4 fs-2 c-neutral-900 h-8 bc-neutral-100 c-neutral-900 focus:bc-secondary-500 flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 pr-2 pl-3 pt-2 pb-2 ba br-4 h-8']")).sendKeys("BKK - Bangkok, TH");	
		WebElement staticdropdown = driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[1]"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByValue("5");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		WebElement staticdropdown1 = driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[2]"));
		Select dropdown1 = new Select(staticdropdown1);
		dropdown1.selectByValue("3");
		System.out.println(dropdown1.getFirstSelectedOption().getText());
		WebElement staticdropdown2 = driver.findElement(By.xpath("//div[5]//select[1]"));
		Select dropdown2 = new Select(staticdropdown2);
		dropdown2.selectByValue("2");
		System.out.println(dropdown2.getFirstSelectedOption().getText());
		driver.findElement(By.xpath("//button[normalize-space()='Search flights']")).click();		
		driver.quit();

	}

}
