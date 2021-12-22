package stepdefinition;

import Action.TimeSheet;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TimeSheetStepDef{
	TimeSheet objTimeSheet = new TimeSheet();
	@Given("^I am on the Redmine login page$")
	public void i_am_on_the_Redmine_login_page() throws Throwable {
		objTimeSheet.iAmOnLoginPage();
	}

	@And("^I enter Login user name \"([^\"]*)\"$")
	public void i_enter_Login_user_name(String arg1) throws Throwable {
		TimeSheet.iEnterUserName(arg1);
	}

	@And("^I enter Password \"([^\"]*)\"$")
	public void i_enter_Password(String arg2) throws Throwable {
	   TimeSheet.iEnterPassword(arg2);
	}

	@Then("^I click Login button$")
	public void i_click_Login_button() throws Throwable {
	    TimeSheet.iClickLogin();
	}

	@And("^I verify if Home is visible$")
	public void i_verify_if_Home_is_visible() throws Throwable {
	   TimeSheet.iVerifyHomeText();
	}

	@And("^I navigate to \"([^\"]*)\" Project$")
	public void i_navigate_to_Remedy_Project(String arg3) throws Throwable {
	    TimeSheet.iNavtoProject(arg3);
	}


	@Then("^I click on \"([^\"]*)\" on Project Overview page$")
	public void i_click_on_Log_time(String arg4) throws Throwable {
	    TimeSheet.iClickAOptionOnProjectPage(arg4);
	}

	@Then("^I select \"([^\"]*)\" from the Activity Dropdown$")
	public void i_select_from_the_Activity_Dropdown(String arg5) throws Throwable {
	    TimeSheet.iSelectActivity(arg5); 
	}
	
	@And("^I fill in data from excel row number \"([^\"]*)\" to \"([^\"]*)\" and column number \"([^\"]*)\" to \"([^\"]*)\"$")
	public void enterDataFromExcel(int rowStart, int rowEnd, int columnStart, int columnEnd) throws Throwable {
		TimeSheet.enterData(rowStart, rowEnd, columnStart, columnEnd);
	}
}
