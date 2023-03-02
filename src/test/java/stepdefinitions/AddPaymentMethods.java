package stepdefinitions;

import java.util.NoSuchElementException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import pages.SettingsPage;
import utilities.Driver;

public class AddPaymentMethods {
	
	LoginPage login=new LoginPage();
	SettingsPage payment=new SettingsPage();
	Actions actions=new Actions(Driver.getDriver());
	JavascriptExecutor jre = (JavascriptExecutor) Driver.getDriver();
	
	@Given("user is on settings page for payment")
	public void user_is_on_settings_page_for_payment() throws InterruptedException {
	Thread.sleep(10000);	
//	Scrool.executeScript("window.scrollBy(0,300)", "");
	jre.executeScript("arguments[0].scrollIntoView();", payment.settingsBtn);
	jre.executeScript("arguments[0].click();", payment.settingsBtn);
//	actions.moveToElement(payment.settingsBtn).doubleClick().perform();
	}
//	@And("select correct vendor for payment")
//	public void select_correct_vendor_for_payment() throws InterruptedException {
//	payment.outletsDropdown.click();
//	Thread.sleep(3000);
//	jre.executeScript("arguments[0].click();", payment.vendorRadioBtn);
//	Thread.sleep(3000);
//	payment.applyBtn.click();
//	Thread.sleep(3000);
//	System.out.println("owner selected");
//	}
	@And("click on billing and payment page for payment")
	public void click_on_billing_and_payment_page_for_payment() throws InterruptedException {
	jre.executeScript("arguments[0].click();", payment.billingAndPaymentBtn);
	System.out.println("billing and payment tab opened");
	Thread.sleep(3000);
	}

	@And("validate accepted payment method for payment")
	public void validate_accepted_payment_method_for_payment() {
	payment.acceptedPaymentMethodsTitle.isDisplayed();
	System.out.println("accepted payment methods displayed");
	}

	@And("validate update payment method button is exist")
	public void validate_update_payment_method_button_is_exist() {
	boolean isDisplayed=payment.updatePaymentMethodBtn.isDisplayed();
	if(isDisplayed==true) {
		System.out.println("update payment method displayed");
	}	
	}
	@And("open update payment methods")
	public void vopen_update_payment_methods() {
	payment.updatePaymentMethodBtn.click();
	System.out.println("Update button clicked");
	}

	@And("select one payment method")
	public void select_one_payment_method() throws InterruptedException {
	Thread.sleep(3000);
	payment.yemekPayCheckbox.click();
	
	boolean isChecked = payment.yemekPayCheckbox.isSelected();
	if(isChecked == true) {
		System.out.println("Payment method selected");
	}	
	}

	@And("click apply selection button")
	public void click_apply_selection_button() throws InterruptedException {
	payment.applySelectionBtn.click();
	System.out.println("Selectons applied");
	Thread.sleep(3000);
	}

	@And("validate added new payment method on tags")
	public void validate_added_new_payment_method_on_tags() {
	boolean isShown=payment.yemekPayTag.isDisplayed();
	if(isShown==true) {
		System.out.println("new payment displayed on tag bar");
	}
	
	}
	
	@And("open update payment methods for delete")
	public void open_update_payment_methods_for_delete() {
	payment.updatePaymentMethodBtn.click();
	System.out.println("Update button clicked");
	}

	@And("uncheck selected payment method")
	public void uncheck_selected_payment_method() throws InterruptedException {
	Thread.sleep(3000);
	boolean isChecked = payment.yemekPayCheckbox.isSelected();
	if(isChecked == true) {
		payment.yemekPayCheckbox.click();
		System.out.println("Payment method unchecked");
	}	
	}

	@And("click apply selection button for delete")
	public void click_apply_selection_button_for_delete() throws InterruptedException {
	payment.applySelectionBtn.click();
	System.out.println("Selectons applied");
	Thread.sleep(5000);
	}

	@And("validate deleted payment method on tags")
	public void validate_deleted_payment_method_on_tags() {
	boolean president= payment.yemekPayTagExist.size() !=0;
	if(president==false) {
		System.out.println("Deleted payment not shown on tag bar. Delete succesfully.");
	}else {System.out.println("Payment method cannot delete on tag bar");}
	}
	
	@Then("payment method added succesfully")
	public void payment_method_added_succesfully() {
	System.out.println("Payment method added succesfully");
	}

}
