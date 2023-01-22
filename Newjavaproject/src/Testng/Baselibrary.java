package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baselibrary 
{
	public static WebDriver driver;
	public void launch(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nileshkumar.pandey\\eclipse-workspace\\Newjavaproject\\Driver\\chromedriver.exe");
	  driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

}
