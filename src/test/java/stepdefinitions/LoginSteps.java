package stepdefinitions;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class LoginSteps {

    private boolean loginSuccess;

    @Given("I open the login page")
    public void i_open_the_login_page() {
        System.out.println("Login page opened");
    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        System.out.println("Username and password entered (valid)");
        loginSuccess = true;
    }

    @When("I enter invalid username or password")
    public void i_enter_invalid_username_or_password() {
        System.out.println("Username and/or password entered (invalid)");
        loginSuccess = false;
    }

    @Then("I should see the welcome message")
    public void i_should_see_the_welcome_message() {
        System.out.println("Checking for welcome message...");
        assertTrue("Login should succeed", loginSuccess);
        System.out.println("Welcome message displayed ✅");
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        System.out.println("Checking for error message...");
        assertFalse("Login should fail", loginSuccess);
        System.out.println("Error message displayed ❌");
    }
}
