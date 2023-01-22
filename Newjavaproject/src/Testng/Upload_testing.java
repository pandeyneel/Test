package Testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import guru99tests.Upload_file;

public class Upload_testing extends Baselibrary
{
	Upload_file ob;
	@BeforeTest
	public void lauch()
	{
		launch("https://www.testingbaba.com/old/");
		ob=new Upload_file();
	}
	@Test(priority=1)
	public void clickxbutton()
	{
		ob.clickxbutton();
	}
	@Test(priority=2)
	public void practicebutton()
	{
		ob.practicebutton();
	}
	@Test(priority=3)
	public void element() throws InterruptedException
	{
		ob.element();
	}
	@Test(priority=4)
	public void uploadbutton() throws InterruptedException
	{
		ob.uploadbutton();
	}
	@Test(priority=5)
	public void chosefile()
	{
		ob.chosefile();
	}
	

}
