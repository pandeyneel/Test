package Testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotherclass extends NewClass
{
	@BeforeTest
	public void Getlaunch()
	{
		getlaunch();
	}
	@Test
	public void add()
	{
		int a=2;
		int b=3;
		int c=a+b;
		System.out.println(c);
		
	}

}
