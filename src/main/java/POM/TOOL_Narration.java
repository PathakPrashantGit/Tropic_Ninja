package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import UTILITY.BaseClass;

public class TOOL_Narration extends BaseClass{

	@FindBy(xpath ="//textarea[@id=\"scriptText\"]") private WebElement textScript;
	@FindBy(xpath ="//iframe[@src=\"https://heroic-narwhal-59997c.netlify.app/\"]") private WebElement frame;
	@FindBy(xpath ="(//button[text()='CALCULATE'])[1]") private WebElement cal;
	@FindBy(xpath ="//div[@id=\"scriptResults\"]//span[@id=\"scriptLength\"]") private WebElement YourScript;
	
	public TOOL_Narration(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void switchFrame()
	{
		driver.switchTo().frame(frame);
	}
	
	public void WriteScript(String text)
	{
		textScript.sendKeys(text);
	}
	public void clickCal()
	{
		cal.click();
	}
	public String varifyScript(String exp)
	{
		String act =YourScript.getText();
		Assert.assertEquals(act, exp);
		return act;
	}
}
