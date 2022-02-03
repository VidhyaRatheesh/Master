package handlingdropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdowns 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		// maximize page
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
	//	driver.findElement(By.xpath("(//span[@role='presentation'])[1]")).click();
	//    driver.findElement(By.cssSelector("input[type='search']")).sendKeys("Florida");
		driver.findElement(By.className("select2-selection__arrow")).click();
	  driver.findElement(By.cssSelector("input[aria-label='Search']")).sendKeys("Florida");
  //  driver.findElement(By.cssSelector("li[role='option']")).click();
     driver.findElement(By.cssSelector("input[aria-label='Search']")).sendKeys(Keys.ENTER);
     Thread.sleep(2000);
    // auto suggesting dropdown pick from list
     driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple'][1]")).sendKeys("New");
   List<WebElement>options = driver.findElements(By.xpath("//li[@role='option']"));
    for(WebElement option:options)
    {
    if(option.getText().equalsIgnoreCase("New Jersey"))	
    {
    	option.click();
    }  
    }
    List<WebElement>options1 = driver.findElements(By.xpath("//li[@role='option']"));
    for(WebElement option:options1)
    {
    if(option.getText().equalsIgnoreCase("New York"))	
    {
    	option.click();
    }  
    }
   
   // driver.findElement(By.cssSelector("input[aria-label='Search']")).sendKeys(Keys.TAB);
     //driver.findElement(By.className("select2-selection select2-selection-multiple")).click();
Thread.sleep(2000);
driver.close();
	}
}
