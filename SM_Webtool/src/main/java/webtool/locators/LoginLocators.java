package webtool.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocators {
	
	@FindBy (css="input[name=\"email\"]")
	public WebElement emailField;
	
	@FindBy (id="standard-adornment-password")
	public WebElement password;
	
	@FindBy (css="button[type=\"submit\"]")
	public WebElement loginBtn;

	public LoginLocators (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
