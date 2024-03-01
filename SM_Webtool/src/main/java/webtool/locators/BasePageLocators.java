package webtool.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePageLocators {
	
	@FindBy (css="div[data-test=\"userMenu\"]")
	public WebElement userMenuBtn;
	
	@FindBy (css="li[data-test=\"logOutButton\"]")
	public WebElement logoutBtn;
	
	@FindBy (css="div[aria-label=\"home\"]")
	public WebElement homeBtn;
	
	@FindBy (css="div[aria-label=\"announcementmanagement\"")
	public WebElement announcementBtn;
	
	@FindBy (css="div[aria-label=\"mallmanagement\"")
	public WebElement mallsBtn;
	
	@FindBy (css="div[aria-label=\"storemanagement\"")
	public WebElement storesBtn;
	
	@FindBy (css="div[aria-label=\"sellermanagement\"")
	public WebElement sellersBtn;
	
	@FindBy (css="div[aria-label=\"brands\"")
	public WebElement brandsBtn;
	
	@FindBy (css="div[aria-label=\"usermanagement\"")
	public WebElement usersBtn;
	
	@FindBy (css="div[aria-label=\"usertypes\"")
	public WebElement usertypesBtn;
	
	@FindBy (css="div[aria-label=\"customers\"")
	public WebElement customersBtn;
	
	@FindBy (css="div[aria-label=\"products\"")
	public WebElement productsBtn;
	
	@FindBy (css="div[aria-label=\"PayoutsTab\"")
	public WebElement payoutsBtn;
	
	@FindBy (css="div[aria-label=\"payoutOrders\"")
	public WebElement payoutOrdersBtn;
	
	@FindBy (css="div[aria-label=\"batch\"")
	public WebElement payoutActiveBatchBtn;
	
	@FindBy (css="div[aria-label=\"batchHistory\"")
	public WebElement payoutBatchHistoryBtn;
	
	@FindBy (css="div[aria-label=\"settlement\"")
	public WebElement settlementBtn;
	
	@FindBy (css="div[aria-label=\"reports\"")
	public WebElement reportsBtn;
	
	@FindBy (css="div[aria-label=\"categories\"")
	public WebElement categoriesBtn;
	
	@FindBy (css="div[aria-label=\"collections\"")
	public WebElement collectionsBtn;
	
	@FindBy (css="div[aria-label=\"orders\"")
	public WebElement fulfillmentBtn;
	
	@FindBy (css="a[data-testid=\"Orders\"")
	public WebElement ordersBtn;
	
	@FindBy (css="div[aria-label=\"dispatch\"]")
	public WebElement dispatchBtn;
	
	@FindBy (css="div[aria-label=\"dropOff\"]")
	public WebElement dropOffBtn;
	
	@FindBy (css="div[aria-label=\"sales\"]")
	public WebElement salesBtn;
	
	@FindBy (css="div[aria-label=\"PromosTab\"]")
	public WebElement promosBtn;
	
	@FindBy (css="div[aria-label=\"vouchers\"]")
	public WebElement promoVoucherBtn;
	
	@FindBy (css="div[aria-label=\"coupons\"]")
	public WebElement promoCouponsBtn;
	
	@FindBy (css="div[aria-label=\"banners\"]")
	public WebElement bannersBtn;
	
	@FindBy (css="div[aria-label=\"cluster\"]")
	public WebElement clustersBtn;
	
	@FindBy (css="div[aria-label=\"paymentEvents\"]")
	public WebElement paymentEventsBtn;
	
	@FindBy (css="div[aria-label=\"remittanceTab\"]")
	public WebElement remittanceBtn;
	
	@FindBy (css="div[aria-label=\"remittance\"]")
	public WebElement remittanceRemittanceBtn;
	
	@FindBy (css="div[aria-label=\"remittanceRunner\"]")
	public WebElement remittanceRemittanceRunnerBtn;
	
	@FindBy (css="div[aria-label=\"sellerOrders\"]")
	public WebElement sellerOrdersBtn;

	@FindBy (css="div[aria-label=\"ConfigurationTab\"]")
	public WebElement configurationBtn;
	
	@FindBy (css="*[aria-label=\"global\"]")
	public WebElement configGlobal;
	
	@FindBy (css="*[aria-label=\"operations\"]")
	public WebElement configOperations;
	
	@FindBy (id="btnNoThanks")
	public WebElement btnNoThanks;
	
	public BasePageLocators (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
	
}
