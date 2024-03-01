package webtool.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import webtool.abstractComponents.BasePage;
import webtool.locators.SellerLocators;

public class BaseSeller extends BasePage {

	WebDriver driver;
	SellerLocators ele;
	
	public BaseSeller(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.ele = new SellerLocators(driver);
	}
	
	public void clickCreateSeller() {
		waitForPageToLoad();
		waitForWebElementToBeClickable(ele.createSellerBtn);
		ele.createSellerBtn.click();
	}
	
	public void selectClassification(String vertical) throws InterruptedException {
		waitForPageToLoad();
		if (vertical.isEmpty() == false) {
		waitForWebElementToBeClickable(ele.classificationDropdown);
			ele.classificationDropdown.click();
			if (vertical.equalsIgnoreCase("Food")) {
				waitForWebElementToBeClickable(ele.classificationFood);
				ele.classificationFood.click();
				Thread.sleep(1000);
			} else if (vertical.equalsIgnoreCase("Shops")) {
				waitForWebElementToBeClickable(ele.classificationShop);
				ele.classificationShop.click();
				Thread.sleep(1000);
			} else if (vertical.equalsIgnoreCase("Grocery")) {
				waitForWebElementToBeClickable(ele.classificationGrocery);
				ele.classificationGrocery.click();
				Thread.sleep(1000);
			}
		} else {
			;
		}
	}
	
	public void selectCluster() {	
		getClusterField().click();
		waitForWebElementToBeClickable(ele.clusterOptions.get(3));
		ele.clusterOptions.get(3).click();
	}
	
	public WebElement getClusterField() {
		return ele.clusterField.get(1);
	}
	
	public boolean isClusterEmpty() {
		return getClusterField().getAttribute("value").isEmpty();
	}
	
	public boolean isClusterEnabled() throws InterruptedException {
		scrollIntoElement(ele.tinNo);
		Thread.sleep(1000);
		return getClusterField().isEnabled();
	}
	
}
