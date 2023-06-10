package TNTestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ContactUs;
import POM.NINJAHome;
import UTILITY.BaseClass;

public class ContactTestCases extends BaseClass {
	
	@BeforeMethod
	public void setUp()
	{
		driver =Browser.urlLaunch("https://www.ninjatropic.com/");
	}
	
	@Test(dataProvider = "data")
	public void paramtest(String name, String lname,String email,String phno,String comp,String tell)
	{
		NINJAHome nj = new NINJAHome(driver);
		nj.clickContactus();
		ContactUs cu = new ContactUs(driver);
		cu.frame();
		cu.namefield(name);
		cu.lastnamefield(lname);
		cu.mailfield(email);
		cu.phonefield(phno);
		cu.companyfield(comp);
		cu.tellusfield(tell);
		cu.submitfield();
		
	}
	
	
	@DataProvider
	public Object[][] data()
	{
		Object [][] ob = new Object[2][6];
		
		ob[0][0] ="Anika";
		ob[0][1]="pathak";
		ob[0][2] ="anika@gmail.com";
		ob[0][3] = "9326262033";
		ob[0][4]= "NINA";
		ob[0][5] ="class-6";
		
		ob[1][0] ="Akshat";
		ob[1][1]="pathak";
		ob[1][2] ="akshat@gmail.com";
		ob[1][3] = "8793566980";
		ob[1][4]= "Akku";
		ob[1][5] ="Nushary";
		return ob;
		
	}

}
