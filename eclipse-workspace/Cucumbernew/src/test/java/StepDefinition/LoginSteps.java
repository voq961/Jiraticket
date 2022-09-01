package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user is on loginpage")
	public void user_is_on_loginpage() {
	    System.out.println("Hello World");
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	   System.out.println("user enter valid username and password ");
	}

	@And("user click on loginButton")
	public void user_click_on_login_button() {
	    System.out.println("user click on loginButton");
	}

	@Then("user moves on homepage")
	public void user_moves_on_homepage() {
	    System.out.println("user moves on homepage");
	}

	@Then("close browser")
	public void close_browser() {
	    System.out.println("Close Browser");
	}


}
