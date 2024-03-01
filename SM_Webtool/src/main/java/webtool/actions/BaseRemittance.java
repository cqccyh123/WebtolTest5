package webtool.actions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import webtool.abstractComponents.BasePage;
import webtool.locators.RemittanceLocators;

public class BaseRemittance extends BasePage {

	WebDriver driver;
	RemittanceLocators ele;
	
	public BaseRemittance(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.ele = new RemittanceLocators(driver);
	}
	
	public List<String> getRemittanceModuleList() {
		List<String> remittanceList = new ArrayList<>();
		for (int i=0; i<ele.remittanceList.size(); i++) {
			remittanceList.add(ele.remittanceList.get(i).getText());
		}
		return remittanceList;
	}
	
	public String getRemittanceHeader() {
		waitForWebElementToAppear(ele.remittanceHeader);
		return ele.remittanceHeader.getText();
	}
	
}
