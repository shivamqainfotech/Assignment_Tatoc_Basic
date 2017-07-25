package StepDefs;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.qait.tatoc.action.Action;
import com.qait.tatoc.driver.DriverClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	static ResourceBundle rs = ResourceBundle.getBundle("Resources.credentials");
	private WebDriver driver=DriverClass.getDriver(rs.getString("browser"));
	private Action action=new Action(driver);
	final static Logger logger = Logger.getLogger(StepDefinition.class);
	
	@Given("^I am on tatoc page and select basic course$")
	public void i_am_on_tatoc_page_and_select_basic_course() throws Throwable {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		DriverClass.maximizeWindow();
		DriverClass.getUrl();
		action.click_basic_course();
		logger.info("I am on tatoc page and clicked on basic course then a new window appears.");
	}

	@Given("^Click on Green Box to proceed to next page$")
	public void click_on_Green_Box_to_proceed_to_next_page() throws Throwable {
	    action.click_on_green_box();
	    logger.info("I clicked on green box and next window will apppear.");
	}

	@When("^I Clicks on Repaint link untill color of second box becomes same then click proceed$")
	public void i_Clicks_on_Repaint_link_untill_color_of_second_box_becomes_same_then_click_proceed() throws Throwable {
	    action.multiple_clicks_on_repaint_box();
	}

	@When("^DRAG ME box is dragged to the cell labeled DROPBOX then click on Proceed link$")
	public void drag_ME_box_is_dragged_to_the_cell_labeled_DROPBOX_then_click_on_Proceed_link() throws Throwable {
	    action.perform_drag_n_drop();
	    
	}

	@When("^Clicking on launch window link will launch a popup window with a form$")
	public void clicking_on_launch_window_link_will_launch_a_popup_window_with_a_form() throws Throwable {
		action.launch_popUp_window("Shivam");
	}

	@Then("^Submit the form with your name to close it and click proceed$")
	public void submit_the_form_with_your_name_to_close_it_and_click_proceed() throws Throwable {
	    
	}

	@Then("^Clicking on Generate Token will print token in Token box$")
	public void clicking_on_Generate_Token_will_print_token_in_Token_box() throws Throwable {
	    
	}

	@Then("^Copy token value and create a Cookie on this page$")
	public void copy_token_value_and_create_a_Cookie_on_this_page() throws Throwable {
	    
	}

	@Then("^Clicking on Proceed link when Token cookie is set properly and Token is valid will take you to next page$")
	public void clicking_on_Proceed_link_when_Token_cookie_is_set_properly_and_Token_is_valid_will_take_you_to_next_page() throws Throwable {
	    
	}


	
	
}
