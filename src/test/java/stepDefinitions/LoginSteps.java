package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	

	@Given("user is on login Page")
	public void user_is_on_login_page() {
		
		
		System.out.println("inside steps -user is on login Page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("inside steps -user enters username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("inside steps -clicks on login button");
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		System.out.println("inside steps -user is navigated to the homepage");
	}

}
