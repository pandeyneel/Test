package Testng;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import guru99tests.Titlevarificationpage;

public class Titlevarificationtest extends Baselibrary
{
	Titlevarificationpage ob;
	@BeforeTest
	public void getlaunch()
	{
		launch("https://demo.guru99.com/v4/");
		ob=new Titlevarificationpage();
	}
	@Test(priority=1)
	public void email()
	{
		ob.fillemail();
	}
	@Test(priority=2)
	public void pass() throws InterruptedException
	{
		ob.fillpass();
	}
	@Test(priority=3)
	public void login()
	{
		ob.clicklogin();
	}
	@Test(priority=4)
	public void title() throws InterruptedException
	{
		ob.getvarification();
	}
	@Test(priority=5)
	public void varification()
	{
		ob.varification(null,null);
	}
	@Test(priority=6)
	public void screenshot() throws IOException
	{
		ob.takescreenshot();
	}

}
