package webtool.locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemittanceLocators {

	@FindBy (css="a[data-test='remittanceTab']")
	public List<WebElement> remittanceList;
	
	@FindBy (id="titleHeader")
	public WebElement remittanceHeader;
	
	public RemittanceLocators (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
