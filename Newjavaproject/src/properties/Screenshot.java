package properties;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Testng.Baselibrary;

public class Screenshot extends Baselibrary
{
	public static void takescreenshot(String filename) throws IOException
	{
		//I'm going to take screenshot first using takesscreenshot interface's takescrenshotas method.
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Now you have to copy that screenshot into folder.
		FileUtils.copyFile(file, new File("C:\\Users\\nileshkumar.pandey\\eclipse-workspace\\"
				+ "Newjavaproject\\"
				+ "Screenshot\\Screen"+filename+".png"));
		
	}

}
