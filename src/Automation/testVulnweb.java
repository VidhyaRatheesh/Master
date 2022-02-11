  package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class testVulnweb {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// maximize page
		driver.manage().window().maximize();		
		driver.get("http://testphp.vulnweb.com/login.php");// get browser
		String username = testVulnweb.getLoginUsername(driver);
		String password = testVulnweb.getLoginPassword(driver);
		driver.findElement(By.xpath("//input[@name='uname']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='login']")).click();
		driver.findElement(By.xpath("//input[@name='urname']")).clear();
		driver.findElement(By.xpath("//input[@name='ucc']")).clear();
		driver.findElement(By.xpath("//input[@name='uemail']")).clear();
		driver.findElement(By.xpath("//input[@name='uphone']")).clear();
		driver.findElement(By.xpath("//textarea[@name='uaddress']")).clear();
		driver.findElement(By.name("urname")).sendKeys("Vidhya");
		driver.findElement(By.name("ucc")).sendKeys("1234-5673");
		driver.findElement(By.xpath("(//input[@name='uemail'])[1]")).sendKeys("vidhya@gmail.com");
		driver.findElement(By.xpath("//input[@name='uphone']")).sendKeys("9989765432");
		driver.findElement(By.xpath("//textarea[@name='uaddress']")).sendKeys("Sivaji Nagar,Trivandrum");
		driver.findElement(By.cssSelector("input[value='update']")).click();
		driver.findElement(By.partialLinkText("Logout te")).click();// logout button
		Assert.assertEquals(driver.getTitle(), "logout");
		Assert.assertEquals(driver.getCurrentUrl(), "http://testphp.vulnweb.com/logout.php");
		driver.close();
	}

	public static String getLoginUsername(WebDriver driver) {

		driver.get("http://testphp.vulnweb.com/login.php");
		String username = driver.findElement(By.xpath("//font[1]")).getText();
		return username;

	}

	public static String getLoginPassword(WebDriver driver) {
		driver.get("http://testphp.vulnweb.com/login.php");
		String password = driver.findElement(By.xpath("//font[2]")).getText();
		return password;

	}

}
