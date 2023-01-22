package guru99tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Guru99page 
{public WebDriver driver;
	@Test(priority=1)
	public void openthefirefox()
	{
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\nileshkumar.pandey\\eclipse-workspace\\Newjavaproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/V4/");
	}
	
@Test(priority=2)
public void userid()
{
	driver.findElement(By.xpath("//*[@name=\"uid\"]")).sendKeys("UserId");
}
@Test(priority=3)
public void password()
{
	driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("Password");
}
@Test(priority=4)
public void login()
{
	driver.findElement(By.xpath("//*[@name=\"btnLogin\"]")).click();
}
}
