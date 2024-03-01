package webtool.abstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webtool.actions.BaseRemittance;
import webtool.actions.BaseSeller;
import webtool.locators.BasePageLocators;

public class BasePage {

	WebDriver driver;
	public BasePageLocators ele;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.ele = new BasePageLocators(driver);
	}
	
	public void waitForWebElementToAppear(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public void waitForWebElementToDisappear(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOf(ele));	
	}
	
	public void waitForWebElementToBeClickable(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public void scrollIntoElement(WebElement ele) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        int yOffset = ele.getLocation().getY();
        jsExecutor.executeScript("window.scrollTo(0, arguments[0]);", yOffset);
	}
	
	public void waitForPageToLoad() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // Wait for the document.readyState to be 'complete'
        wait.until(webDriver -> ((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState").equals("complete"));
	}
	
	public void closeSaveAccountModal() {
		waitForPageToLoad();
		waitForWebElementToBeClickable(ele.btnNoThanks);
		ele.btnNoThanks.click();
	}
	
	public void logout() {
		ele.userMenuBtn.click();
		ele.logoutBtn.click();
	}
	
	public void goToHome() {
		ele.homeBtn.click();
	}
	
	public void goToAnnouncement() {
		ele.announcementBtn.click();
	}
	
	public void goToMalls() {
		ele.mallsBtn.click();
	}
	
	public void goToStore() {
		ele.storesBtn.click();
	}
	
	public BaseSeller goToSeller() {
		waitForPageToLoad();
		waitForWebElementToBeClickable(ele.sellersBtn);
		ele.sellersBtn.click();
		return new BaseSeller(driver);
	}
	
	public void goToBrands() {
		ele.brandsBtn.click();
	}
	
	public void goToUsers() {
		ele.usersBtn.click();
	}
	
	public void goToUserTypes() {
		ele.usertypesBtn.click();
	}
	
	public void goToCustomers() {
		ele.customersBtn.click();
	}
	
	public void goToProducts() {
		ele.productsBtn.click();
	}
	
	public void goToPayoutOrders() {
		ele.payoutsBtn.click();
		ele.payoutOrdersBtn.click();
	}
	
	public void goToPayoutActiveBatch() {
		ele.payoutsBtn.click();
		ele.payoutActiveBatchBtn.click();
	}
	
	public void goToPayoutBatchHistory() {
		ele.payoutsBtn.click();
		ele.payoutBatchHistoryBtn.click();
	}
	
	public void goToSettlement() {
		ele.settlementBtn.click();
	}
	
	public void goToReports() {
		ele.reportsBtn.click();
	}
	
	public void goToCategories() {
		ele.categoriesBtn.click();
	}
	
	public void goToCollections() {
		ele.collectionsBtn.click();
	}
	
	public void goToFulfillment() {
		ele.fulfillmentBtn.click();
	}
	
	public void goToOrders() {
		ele.ordersBtn.click();
	}
	
	public void goToDispatch() {
		ele.dispatchBtn.click();
	}
	
	public void goToDropOff() {
		ele.dropOffBtn.click();
	}
	
	public void goToSales() {
		ele.salesBtn.click();
	}
	
	public void goToPromoVoucher() {
		ele.promosBtn.click();
		ele.promoVoucherBtn.click();
	}
	
	public void goToPromoCoupon() {
		ele.promosBtn.click();
		ele.promoCouponsBtn.click();
	}
	
	public void goToBanner() {
		ele.bannersBtn.click();
	}
	
	public void goToClusters() {
		ele.clustersBtn.click();
	}
	
	public void goToPaymentEvents() {
		ele.paymentEventsBtn.click();
	}
	
	public BaseRemittance openRemittanceModule() {
		ele.remittanceBtn.click();
		return new BaseRemittance(driver);
	}
	
	public BaseRemittance goToRemittance() {
		ele.remittanceRemittanceBtn.click();
		return new BaseRemittance(driver);
	}
	
	public BaseRemittance goToRemittanceRunner() {
		ele.remittanceRemittanceRunnerBtn.click();
		return new BaseRemittance(driver);
	}
	
	public void goToSellerOrders() {
		ele.sellerOrdersBtn.click();
	}
	
	public void goToConfigurationsGlobal() {
		ele.configurationBtn.click();
		ele.configGlobal.click();
	}
	
	public void goToConfigurationsOperations() {
		ele.configurationBtn.click();
		ele.configOperations.click();
	}	
	
	
	
}
