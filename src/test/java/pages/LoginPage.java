package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;
import utilities.Helpers;

public class LoginPage extends BasePage {

	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(),this);
	}
	@FindBy(id ="login-email-field")
	public WebElement loginEmailField;
	
	@FindBy(id ="login-password-field")
	public WebElement loginPasswordField;
	
	@FindBy(id ="button_login")
	public WebElement btnLogin;
	
	@FindBy(css ="button[class='MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-disableElevation MuiButtonBase-root  css-1mkh001']")
	public WebElement addPhoneCancelBtn;
	
	public void setEmail(String key) {
		loginEmailField.sendKeys(key);
	}
	public void setPassword(String key) {
		loginPasswordField.sendKeys(key);
	}


	public void clickLoginBtn(){
		waitForClickablility(btnLogin,10);
		btnLogin.click();
	}

	public void clickPhoneNumberBtn(){
		waitForClickablility(addPhoneCancelBtn,10);
		addPhoneCancelBtn.click();
	}

	public void successLogin(String email,String password){
		setEmail(email);
		setPassword(password);
		btnLogin.click();
		addPhoneCancelBtn.click();
	}
}
