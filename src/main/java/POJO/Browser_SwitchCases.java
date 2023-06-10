package POJO;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import UTILITY.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_SwitchCases extends BaseClass {
	
	public static WebDriver UrlLaunch(String browser)
	{
		switch(browser.toLowerCase())
		{
		case  "chrome":
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		case "firefox":

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		case "edge":
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		
		}
		
		driver.get("https://www.ninjatropic.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		return driver;
	}

}
