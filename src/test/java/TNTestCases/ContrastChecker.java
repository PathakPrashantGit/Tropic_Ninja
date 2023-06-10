package TNTestCases;

import java.time.Duration;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Contrast_Tool;
import UTILITY.BaseClass;

@Listeners(UTILITY.Listeners.class)
public class ContrastChecker extends BaseClass{

	@BeforeMethod
	public void SetUp()
	{
		driver = Browser.urlLaunch("https://www.ninjatropic.com/tools-ada-color/");
	}
	
	@Test
	public void ckeckcolor()
	{
		Contrast_Tool ct = new  Contrast_Tool(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		ct.clickfontfamily("Alegreya Sans SC");
		ct.clickfontwaight("Bold");
		ct.clickfontsize("13 pt");
		ct.clickfontsizelarge("16 pt");
	}
	
}
