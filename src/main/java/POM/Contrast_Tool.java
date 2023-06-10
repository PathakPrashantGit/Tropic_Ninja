package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import UTILITY.BaseClass;

public class Contrast_Tool extends BaseClass {
	
	@FindBy(xpath ="//div[@id='color1']") private WebElement forecolor;
	@FindBy(xpath="//div[@id='color2']") private WebElement backcolor;
	@FindBy(id ="contrastRatioValue") private WebElement contrastRatio;
	@FindBy(xpath="//select[@id=\"ninja-font-family\"]") private WebElement fontfamily;
	@FindBy(xpath="//select[@id='ninja-font-weight']") private WebElement fontwaight;
	@FindBy(xpath="//select[@id='ninja-font-size']") private WebElement fontsize;
	@FindBy(xpath="//select[@id='ninja-font-size-large']") private WebElement fontsizelarge;
	@FindBy(xpath="(//div[@class=\"picker_selector\"])[2]") private WebElement picker;
	@FindBy(xpath="(//div[@class=\"picker_selector\"])[5]") private WebElement picker_2;
	
	public Contrast_Tool(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickfontfamily(String fontname)
	{
		Select sc = new Select(fontfamily);
		sc.selectByVisibleText(fontname);
	}
	
	public void clickfontwaight(String waight)
	{
		Select sc1 = new Select(fontwaight);
		sc1.selectByVisibleText(waight);
	}

	public void clickfontsize(String size)
	{
		Select sc2 = new Select(fontsize);
		sc2.selectByVisibleText(size);
	}
	public void clickfontsizelarge(String largesize)
	{
		Select sc3 = new Select(fontsizelarge);
		sc3.selectByVisibleText(largesize);
	}
}
