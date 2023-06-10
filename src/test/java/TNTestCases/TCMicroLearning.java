package TNTestCases;

import java.time.Duration;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.NINJAHome;
import POM.TOOL_Narration;
import UTILITY.BaseClass;
@Listeners(UTILITY.Listeners.class)
public class TCMicroLearning extends BaseClass{
	
	@BeforeMethod
	public void setUp()

	{
		driver =Browser.urlLaunch("https://www.ninjatropic.com/");
	}
	
	@Test
	public void testMl()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		NINJAHome nj = new NINJAHome(driver);
		nj.clickMTool();
		nj.clickToolNarration();
		
		TOOL_Narration tn = new TOOL_Narration (driver);
		tn.switchFrame();
		tn.WriteScript("I am Prashant Pathak I am in Bagalore");
		tn.clickCal();
		 String actual = tn.varifyScript("8 words");
		 System.out.println(actual);
		
	}
}
