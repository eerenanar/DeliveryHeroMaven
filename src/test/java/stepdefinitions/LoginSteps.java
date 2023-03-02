package stepdefinitions;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static pages.BasePage.envURL;


public class LoginSteps{

	LoginPage login=new LoginPage();
	//Actions actions=new Actions(Driver.getDriver());
	String emailOpening = ConfigReader.getProperty("emailOpening");
	String password = ConfigReader.getProperty("password");
	String emailSettings = ConfigReader.getProperty("emailSettings");


	@Given("user is succesfully logged with Opening")
	public void user_is_succesfully_logged_with_Opening() throws InterruptedException {
		login.successLogin(emailOpening,password);

	}
	@Given("user is succesfully logged with Settings")
	public void user_is_succesfully_logged_with_Settings() throws InterruptedException {
		login.successLogin(emailSettings,password);
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		login.setEmail(username);
		login.setPassword(password);
	}

	@And("click on login button")
	public void click_on_login_button() throws InterruptedException {
		login.clickLoginBtn();
	}

	@And("skip add phone number button")
	public void skip_add_phone_number_button() throws InterruptedException {
		login.clickPhoneNumberBtn();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Login Succesfully");
	}
	
}
