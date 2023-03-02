package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.OpeningTimes;


public class OpeningTimesValidation {

	OpeningTimes ot=new OpeningTimes();
	@Given("user is on opening times page")
	public void user_is_on_opening_times_page() throws InterruptedException {
		ot.clickOpeningTimesPlugin();
		System.out.println("opening times opened");
	}
	@And("select correct vendor for opening times")
	public void select_correct_vendor_for_opening_times() throws InterruptedException {
		ot.selectVendorOpeningTimes();
	}

	@And("eid al adha schedule edit")
	public void eid_al_adha_schedule_edit() {
		ot.eidAlAdhaScheduleEdit();
	}
	@And("validate regular schedule")
	public void validate_regular_schedule() {
		ot.regularScheduleIsDisplayed();
	}
	@And("validate regular schedule edit button")
	public void validate_regular_schedule_edit_button() throws InterruptedException {
		ot.regularScheduleClickEditBtn();
	}
	@And("validate schedule drawer")
	public void validate_schedule_drawer() throws InterruptedException {
		ot.validateScheduleDrawer();
	}
	@And("edit drawer")
	public void edit_drawer() throws InterruptedException {
		ot.editShiftOnScheduleDrawer("00:15","00:45");
		System.out.println("Opening Times test succesfully");
		// teardown
		ot.regularScheduleClickEditBtn();
		ot.editShiftOnScheduleDrawer("00:30","01:00");
		System.out.println("Opening Times teardown succesfully");
	}
	@Then("opening time loaded successfully")
	public void opening_time_loaded_successfully() {

		System.out.println("Opening Times loaded succesfully");
	}

}
