package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;
import utilities.Helpers;

public class SettingsPage extends BasePage {
	
	public SettingsPage() {
		PageFactory.initElements(Driver.getDriver(),this);
	}
	
	@FindBy(css ="button[data-testid='nav-item-settings']")
	public WebElement settingsBtnTitle;
	
	@FindBy(css ="button[data-testid='header-button-Outlets']")
	public WebElement outletsDropdown;
		
	@FindBy(xpath ="//a[@href='/settings?int_ref=side-nav']")
	public WebElement settingsBtn;
	
	@FindBy(css ="input[value='YS_TR;v7rj']")
	public WebElement vendorRadioBtn;
	
	@FindBy(css ="button[data-testid='submit-btn']")
	public WebElement applyBtn;
	
	//Billing and Payment Elements
	
	@FindBy(css ="button[data-testid='nav-billing']")
	public WebElement billingAndPaymentBtn;
		
	@FindBy(xpath ="//*[@id=\"sideBarV2\"]/div[2]/div[2]/section/div/div[1]/div/h1")
	public WebElement acceptedPaymentMethodsTitle;
	
	@FindBy(css ="button[data-testid='update-button']")
	public WebElement updatePaymentMethodBtn;
	
	@FindBy(xpath ="//*[@id=\'sideBarV2\']/div[2]/div[2]/section/div[1]/div/h1")
	public WebElement bankAccountTitle;
	
	@FindBy(xpath ="//*[@id=\"sideBarV2\"]/div[2]/div[2]/section/section/div/div/div/h1")
	public WebElement yemeksepetiWalletTitle;
	
	@FindBy(xpath ="//input[@type=checkbox")
	public WebElement yemeksepetiWalletCheckbox;
	
	@FindBy(xpath ="//*[@id=\"sideBarV2\"]/div[2]/div[2]/section/div[3]/div[1]/div/h1")
	public WebElement billingAdresstitle;
	
	@FindBy(xpath ="//*[@id=\"sideBarV2\"]/div[2]/div[2]/section/div[4]/div[1]/div/h1")
	public WebElement requestTitle;
	
	@FindBy(css ="button[class='MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-disableElevation MuiButtonBase-root  css-1ss1yo0']")
	public WebElement addPhoneCancelBtn;
	
	@FindBy(xpath ="//span[text()='No payment']")
	public WebElement noPaymentTag;
	
	@FindBy(xpath ="//span[text()='Online Credit/Debit Card']")
	public WebElement onlineCreditTag;
	
	@FindBy(xpath ="//span[text()='Cash']")
	public WebElement cashTag;
	
	@FindBy(xpath ="//span[text()='Yemekpay Offline Credit Card']")
	public WebElement yemekPayTag;
	
	@FindBy(xpath ="//span[text()='Yemekpay Offline Credit Card']")
	public List<WebElement> yemekPayTagExist;
	
	@FindBy(xpath ="//span[text()='Yemekpay Offline Credit Card']/../../div[1]/span/input")
	public WebElement yemekPayCheckbox;
	
	@FindBy(css ="button[data-testid='reset-button']")
	public WebElement resetBtn;
	
	@FindBy(css ="button[data-testid='apply-selection']")
	public WebElement applySelectionBtn;
	
	//Contact Details Elements
	
	@FindBy(css ="button[data-testid='nav-contact-details']")
	public WebElement contactDetailsBtn;
	
	//Delivery Areas Elements
	
	@FindBy(css ="button[data-testid='nav-delivery-areas']")
	public WebElement deliveryAreasBtn;
	
	//Restaurant Details Elements
	
	@FindBy(css ="button[data-testid='nav-details']")
	public WebElement restaurantDetailsBtn;

	public void selectVendorSettings(){
		waitForVisibility(outletsDropdown, 10).click();
		vendorId().click();
		waitForVisibility(applyBtn, 10).click();
	}
	

}
