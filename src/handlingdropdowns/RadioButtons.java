package handlingdropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		// maximize page
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		
		
		driver.findElement(By.className("form-check-label")).click();
		driver.findElement(By.id("button-one")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("inlineRadio21")).click();	
		Thread.sleep(2000);
		
		driver.findElement(By.id("inlineRadio24")).click();
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
	    Thread.sleep(2000);
		System.out.println(driver.findElements(By.cssSelector("input[type='radio']")).size());
		
		Thread.sleep(2000);
		driver.close();

}
}
