package Testing_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorMessage 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
	    driver.get("https://demo.openmrs.org/openmrs/login.htm");//get browser
	    
	    driver.findElement(By.cssSelector("input#username")).sendKeys("Admin");
	    driver.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("Admin1232");
	    driver.findElement(By.id("Inpatient Ward")).click();
	    driver.findElement(By.cssSelector("input[class='btn confirm']")).click();
	     System.out.println(driver.findElement(By.id("error-message")).getText());	
	     System.out.println();
	     driver.findElement(By.partialLinkText("Logout")).click();
}

}
