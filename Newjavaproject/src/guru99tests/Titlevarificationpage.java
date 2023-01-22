package guru99tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testng.Baselibrary;
import properties.Screenshot;

public class Titlevarificationpage extends Baselibrary 
{
	public Titlevarificationpage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@name=\"uid\"]")
	private WebElement email;
	@FindBy(xpath = "//*[@name=\"password\"]")
	private WebElement pass;
	@FindBy(xpath = "//*[@name=\"btnLogin\"]")
	private WebElement login;
	
	public void fillemail()
	{
		email.sendKeys("mngr467705");
	}
	public void fillpass() throws InterruptedException
	{
		Thread.sleep(2000);
		pass.sendKeys("YjAvUhy");
	}
	public void clicklogin()
	{
		login.click();
	}
	public void getvarification() throws InterruptedException
	{
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	public void varification(String actual, String expected)
	{
		 expected="Guru99 Bank Manager HomePage";
		 actual=driver.getTitle();
		 assertEquals(expected, actual);
	}
	public void takescreenshot() throws IOException
	{
		Screenshot.takescreenshot("facebook");
	}
	

}
