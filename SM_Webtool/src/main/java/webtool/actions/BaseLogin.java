package webtool.actions;

import org.openqa.selenium.WebDriver;

import webtool.abstractComponents.BasePage;
import webtool.locators.LoginLocators;

public class BaseLogin extends BasePage {

	WebDriver driver;
	LoginLocators ele;
	
	public BaseLogin(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.ele = new LoginLocators(driver);
	}

	public void goTo() {
		driver.get("https://omi-uat.smop.asia/login");
	}	
	
	public BasePage login (String email, String password) {
		waitForPageToLoad();
		ele.emailField.sendKeys(email);
		ele.password.sendKeys(password);
		ele.loginBtn.click();
		return new BasePage(driver);
	}
	
}
