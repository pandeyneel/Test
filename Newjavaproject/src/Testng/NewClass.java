package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewClass 
{
	@Test
	public void getlaunch()
	{
		System.setProperty("webdriver.Chromedriver.driver", "C:\\Users\\nileshkumar.pandey\\eclipse-workspace\\Newjavaproject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/6.7");
		driver.manage().window().maximize();
		driver.quit();
		
	}
	@Test
	public void openurl()
	{
		int x=16;
		int y=17;
		int z=x+y;
		System.out.println(z);
	}

}
