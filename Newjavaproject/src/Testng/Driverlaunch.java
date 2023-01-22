package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverlaunch {
	

	public static void main(String string) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nileshkumar.pandey\\eclipse-workspace\\Newjavaproject\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();


	}

}
