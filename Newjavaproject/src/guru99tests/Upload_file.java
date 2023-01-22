package guru99tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testng.Baselibrary;

public class Upload_file extends Baselibrary
{
	public  Upload_file()
	{
	PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath ="//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement xbutton;
	@FindBy(xpath="//*[text()='Practice']")
	private WebElement practicebutton;
	@FindBy(xpath="//*[@data-target=\"#elements\"]")
	private WebElement elementbutton;
	@FindBy(xpath = "//*[text()='upload and download']")
	private WebElement uploadbutton;
	@FindBy(xpath = "//*[@id=\"File1\"]")
	private WebElement choosefile;
	
	public void clickxbutton()
	{
		xbutton.click();
	}
	public void practicebutton()
	{
		practicebutton.click();
	}
	public void element() throws InterruptedException
	{
		Thread.sleep(2000);
		elementbutton.click();
	}
	public void uploadbutton() throws InterruptedException
	{
		Thread.sleep(2000);
		uploadbutton.click();
	}
	public void chosefile()
	{
		choosefile.sendKeys("C:\\Users\\nileshkumar.pandey\\eclipse-workspace\\Newjavaproject\\src\\Files\\excelfile.xlsx");
	}
	

}
