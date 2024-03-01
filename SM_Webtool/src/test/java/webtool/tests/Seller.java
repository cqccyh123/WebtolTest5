package webtool.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import webtool.testComponents.Retry;
import webtool.abstractComponents.BasePage;
import webtool.actions.BaseSeller;
import webtool.testComponents.BaseTest;

public class Seller extends BaseTest {

	// WEBTOOL-1176 -> Seller | Cluster Assignment for Vertical
	@Test (dataProvider="getClusterAssignmentFoodData", retryAnalyzer = Retry.class)
	public void validateClusterAssignmentForFood(HashMap<String, String> input, ITestContext context) throws InterruptedException {
		BasePage basePage = loginPage.login(input.get("email"), input.get("password"));
		basePage.closeSaveAccountModal();
		BaseSeller sellerPage = basePage.goToSeller();
		sellerPage.clickCreateSeller();
		sellerPage.selectClassification(input.get("vertical"));
		Boolean isClusterEnabled = sellerPage.isClusterEnabled();
		
		if (isClusterEnabled == true) {
			sellerPage.selectCluster();
		} else {
			Assert.assertTrue(false);
		}
		
		Boolean isClusterEmpty = sellerPage.isClusterEmpty();
		
		if (isClusterEmpty == false) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	// WEBTOOL-1176 -> Seller | Cluster Assignment for Vertical
	@Test (dataProvider="getClusterAssignmentNonFoodData", retryAnalyzer = Retry.class)
	public void validateCLusterAssignmentForNonFood(HashMap<String, String> input, ITestContext context) throws InterruptedException {
		BasePage basePage = loginPage.login(input.get("email"), input.get("password"));
		basePage.closeSaveAccountModal();
		BaseSeller sellerPage = basePage.goToSeller();
		sellerPage.clickCreateSeller();
		sellerPage.selectClassification(input.get("vertical"));
		Boolean isClusterEnabled = sellerPage.isClusterEnabled();
		
		if (isClusterEnabled == false) {
			Assert.assertTrue(true);
		} else {
			sellerPage.selectCluster();
			Assert.assertTrue(false);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	@DataProvider
	public Object[][] getClusterAssignmentFoodData() throws IOException {
		List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir")+
				"\\src\\test\\java\\webtool\\testdata\\Seller.ClusterAssignmentFood.json");
		
		return new Object[][] {
			{data.get(0)},
			{data.get(1)}
		};
	}
	
	@DataProvider
	public Object[][] getClusterAssignmentNonFoodData() throws IOException {
		List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir")+
				"\\src\\test\\java\\webtool\\testdata\\Seller.ClusterAssignmentNonFood.json");
		
		return new Object[][] {
			{data.get(0)},
			{data.get(1)},
			{data.get(2)},
			{data.get(3)},
			{data.get(4)},
			{data.get(5)}
		};
	}
	
}
