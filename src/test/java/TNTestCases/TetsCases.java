package TNTestCases;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POJO.Browser;
import POJO.Browser_SwitchCases;
import POM.ContactUs;
import POM.NINJAHome;
import UTILITY.BaseClass;
import UTILITY.PARAMETERS;


public class TetsCases extends BaseClass{
	@Parameters("browser")
	@BeforeMethod
	public void SetUp(String browser)
	{
		driver = Browser_SwitchCases.UrlLaunch(browser);
		
	}
	
	@Test
	public void contectTestCases() throws InterruptedException, EncryptedDocumentException, IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		NINJAHome nj = new NINJAHome (driver);
		nj.clickContactus();
		
		ContactUs cu = new ContactUs(driver);
		cu.frame();
		
		String namee =PARAMETERS.getExcel("TNContactus", 1, 0);
		String lasttname =PARAMETERS.getExcel("TNContactus", 1, 1);
		String emailadd =PARAMETERS.getExcel("TNContactus", 1, 2);
		String number =PARAMETERS.getExcel("TNContactus", 1, 3);
		String company =PARAMETERS.getExcel("TNContactus", 1, 4);
		String tellUS =PARAMETERS.getExcel("TNContactus", 1, 5);
		
		cu.namefield(namee);
		cu.lastnamefield(lasttname);
		cu.mailfield(emailadd);
		cu.phonefield(number);
		cu.companyfield(company);
		cu.tellusfield(tellUS);
	cu.submitfield();
	
	
	String act =cu.verifytext();
	String exp ="Thank you! We will contact you soon.";
	Assert.assertEquals(act, exp);
		
		
	}

}
