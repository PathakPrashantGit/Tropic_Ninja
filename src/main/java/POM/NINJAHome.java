package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UTILITY.BaseClass;

public class NINJAHome extends BaseClass {
	
	@FindBy(xpath ="(//a[text()='Contact us'])[1]") private WebElement contactus;
	@FindBy (xpath ="(//li[@id='menu-item-136'])[1]") private WebElement MicrolearningTool;
	@FindBy(xpath ="(//ul[@class=\"sub-menu\"]//li//a[text()='Tools-Narrations'])[1]") private WebElement toolNarration;
	
	public NINJAHome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickContactus()
	{
		contactus.click();
	}
	public void clickMTool()
	{
		MicrolearningTool.click();
//       Actions act = new Actions(driver);
//       act.moveToElement(MicrolearningTool);
       
	}
	public void clickToolNarration()
	{
		toolNarration.click();
	}

}
