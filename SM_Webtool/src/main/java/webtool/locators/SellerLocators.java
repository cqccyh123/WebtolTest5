package webtool.locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellerLocators {

	@FindBy (id="createSellerBtn")
	public WebElement createSellerBtn;
	
	@FindBy (id="classification (gm/f&b/groceries)Dropdown")
	public WebElement classificationDropdown;
	
	@FindBy (id="optionRow0")
	public WebElement classificationShop;

	@FindBy (id="optionRow1")
	public WebElement classificationFood;
	
	@FindBy (id="optionRow2")
	public WebElement classificationGrocery;
	
	@FindBy (id="tinNoTxt")
	public WebElement tinNo;
	
	@FindBy (id="financeMobileNoTxt")
	public WebElement financeMobileNo;
	
	@FindBy (id="completeAddressTxt")
	public WebElement completeAddressField;
	
	@FindBy (css="div[role='combobox'] input")
	public List<WebElement> clusterField;
	
	@FindBy (css="*[id*='dropdownChoiceRow']")
	public List<WebElement> clusterOptions;
	
	public SellerLocators (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
