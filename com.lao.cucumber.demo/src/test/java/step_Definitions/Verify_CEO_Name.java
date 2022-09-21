package step_Definitions;

import io.cucumber.java.en.*;

public class Verify_CEO_Name {
	
	@Given("The user is logged in successfully and is on HomePage")
	public void the_user_is_logged_in_successfully_and_is_on_home_page() {}

	@When("User clicks on the directory option from the menu bar")
	public void user_clicks_on_the_directory_option_from_the_menu_bar() {}

	@When("user clicks the job titles as {string} from the dropdown")
	public void user_clicks_the_job_titles_as_from_the_dropdown(String string) {}

	@When("Clicks on search button")
	public void clicks_on_search_button() {}

	@Then("User should see the CEO name {string}")
	public void user_should_see_the_ceo_name(String string) {}

	
	

}
