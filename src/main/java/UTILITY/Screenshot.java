package UTILITY;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static String getscreenshot(WebDriver driver, String name) throws IOException
	{
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String path = System.getProperty("user.dir")+"\\Screenshots\\"+name+".png";
		
		File dest = new File(path);
		
		FileHandler.copy(source, dest);
		
		return path;
		
	}

}
