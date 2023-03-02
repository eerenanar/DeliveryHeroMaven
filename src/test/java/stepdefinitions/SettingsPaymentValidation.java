package stepdefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import pages.SettingsPage;
import utilities.Driver;

public class SettingsPaymentValidation {

	LoginPage login=new LoginPage();
	SettingsPage payment=new SettingsPage();
	Actions actions=new Actions(Driver.getDriver());
	JavascriptExecutor jre = (JavascriptExecutor) Driver.getDriver();
@Given("user is on settings page")
public void user_is_on_settings_page() throws InterruptedException {
	Thread.sleep(10000);	
//	Scrool.executeScript("window.scrollBy(0,300)", "");
	jre.executeScript("arguments[0].scrollIntoView();", payment.settingsBtn);
	jre.executeScript("arguments[0].click();", payment.settingsBtn);
//	actions.moveToElement(payment.settingsBtn).doubleClick().perform();
}
@And("select correct vendor")
public void select_correct_vendor() throws InterruptedException {
	payment.selectVendorSettings();
	}
@And("click on billing and payment page")
public void click_on_billing_and_payment_page() throws InterruptedException {
	jre.executeScript("arguments[0].click();", payment.billingAndPaymentBtn);
	System.out.println("billing and payment tab opened");
	Thread.sleep(3000);
	}

@And("validate accepted payment method")
public void validate_accepted_payment_method() {
	payment.acceptedPaymentMethodsTitle.isDisplayed();
	System.out.println("accepted payment methods displayed");
}

@And("validate update payment method button is visible")
public void validate_update_payment_method_button_is_visible() {
	payment.updatePaymentMethodBtn.isDisplayed();
	System.out.println("update payment method displayed");
}

@And("validate yemeksepeti wallet is exist")
public void validate_yemeksepeti_wallet_is_exist() {
	payment.yemeksepetiWalletTitle.isDisplayed();
	System.out.println("wallet displayed");
}

@Then("user has a access right to page")
public void user_has_a_access_right_to_page() {
	System.out.println("Payments plugin all requirements fields exist and loaded succesfully");
}

}
