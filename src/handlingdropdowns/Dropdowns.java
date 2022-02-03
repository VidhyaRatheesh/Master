package handlingdropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		// maximize page
		driver.manage().window().maximize();
		
	        driver.get("https://selenium.obsqurazone.com/select-input.php");//get browser
	 try
	 {
/*	WebElement staticdropdown =driver.findElement(By.id("single-input-field"));
	Select dropdown=new Select(staticdropdown);
	dropdown.selectByIndex(1);
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByValue("Yellow");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByVisibleText("Green");
	System.out.println(dropdown.getFirstSelectedOption().getText());*/
	
	
	WebElement staticdropdown1 =driver.findElement(By.id("multi-select-field"));
	Select dropdown1=new Select(staticdropdown1);
	dropdown1.selectByIndex(0);
	System.out.println(dropdown1.getFirstSelectedOption().getText());
	dropdown1.selectByValue("Yellow");
	System.out.println(dropdown1.getFirstSelectedOption().getText());
	dropdown1.selectByVisibleText("Green");
	System.out.println(dropdown1.getFirstSelectedOption().getText());
	
	 driver.findElement(By.id("button-first")).click();
	 driver.findElement(By.cssSelector("#button-all")).click();
	 
	
	
	
	
	
	}
	catch(Exception Ex)
	{
		System.out.println("Failed");
	
	}
	 
	   Thread.sleep(2000);
	   driver.close();
}
}
