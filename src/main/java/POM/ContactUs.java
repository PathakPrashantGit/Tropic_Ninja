package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UTILITY.BaseClass;

public class ContactUs extends BaseClass {
	
	@FindBy(id ="firstname-763978d5-b0ad-40e2-a8b4-1310da8b2ee9") private WebElement fname ;
	@FindBy(xpath="//input[@name='lastname']") private WebElement lname;
	@FindBy(xpath ="//input[@inputmode='email']") private WebElement mail;
	@FindBy(xpath ="//input[@name='phone']") private WebElement phone;
	@FindBy(xpath ="//input[@name='company']") private WebElement compname;
	@FindBy(xpath ="//textarea") private WebElement tellus;
	@FindBy(xpath ="//input[@type='submit']") private WebElement contectTeam;
	@FindBy(id="hs-form-iframe-0") private WebElement fr;
	@FindBy(xpath ="//p[text()='Thank you! We will contact you soon.']") private WebElement text;
	
	public ContactUs(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void namefield(String name)
	{
		fname.sendKeys(name);
	}
	
	public void lastnamefield(String lastname)
	{
		lname.sendKeys(lastname);
	}
	public void mailfield(String mailid)
	{
		mail.sendKeys(mailid);
	}
	public void phonefield(String number)
	{
		phone.sendKeys(number);
	}
	public void companyfield(String compnam)
	{
		compname.sendKeys(compnam);
	}
	public void tellusfield(String tell)
	{
		tellus.sendKeys(tell);
	}
	public void submitfield()
	{
		contectTeam.click();
	}
	public void frame()
	{
	driver.switchTo().frame(fr);
	}
	public String verifytext()
	{
		String actual = text.getText();
		return actual;
	}

}
