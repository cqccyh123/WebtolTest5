package webtool.tests;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import junit.framework.Assert;
import webtool.abstractComponents.BasePage;
import webtool.actions.BaseRemittance;
import webtool.testComponents.BaseTest;
import webtool.testComponents.Retry;

public class Remittance extends BaseTest {

	List<String> remittanceModuleList = Arrays.asList("Remittance Runner", "Remittance");
	String remittanceHeader = "Remittance";
	String remittanceRunnerHeadder = "Remittance Runner";

	// WEBTOOL-1500 -> Home Menu | Remittance Menu Navigation
	@Test(retryAnalyzer = Retry.class)
	public void validateListOfModulesInRemittance() throws InterruptedException {
		BasePage basePage = loginPage.login("productdevelopmentteam@smop.asia-uat", "SM0P4ppDevUAT!");
		basePage.closeSaveAccountModal();
		BaseRemittance remittancePage = basePage.openRemittanceModule();
		Thread.sleep(2000);
		Assert.assertTrue(remittanceModuleList.containsAll(remittancePage.getRemittanceModuleList()));
	}

	// WEBTOOL-1500 -> Home Menu | Remittance Menu Navigation
	@Test(retryAnalyzer = Retry.class)
	public void validateRemittancePageRedirection() throws InterruptedException {
		BasePage basePage = loginPage.login("productdevelopmentteam@smop.asia-uat", "SM0P4ppDevUAT!");
		basePage.closeSaveAccountModal();
		BaseRemittance remittancePage = basePage.openRemittanceModule();
		Thread.sleep(2000);
		remittancePage.goToRemittance();
		System.out.println(remittancePage.getRemittanceHeader());
		Assert.assertEquals(remittanceHeader, remittancePage.getRemittanceHeader());
	}

	// WEBTOOL-1500 -> Home Menu | Remittance Menu Navigation
	@Test(retryAnalyzer = Retry.class)
	public void validateRemittanceRunnerPageRedirection() throws InterruptedException {
		BasePage basePage = loginPage.login("productdevelopmentteam@smop.asia-uat", "SM0P4ppDevUAT!");
		basePage.closeSaveAccountModal();
		BaseRemittance remittancePage = basePage.openRemittanceModule();
		Thread.sleep(2000);
		remittancePage.goToRemittanceRunner();
		System.out.println(remittancePage.getRemittanceHeader());
		Assert.assertEquals(remittanceRunnerHeadder, remittancePage.getRemittanceHeader());
	}

}
