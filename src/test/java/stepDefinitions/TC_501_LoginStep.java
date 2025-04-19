package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_501_LoginStep {
    @When("The user enters an invalid username {string}")
    public void theUserEntersAnInvalidUsername(String arg0) {
    }

    @And("The user enters a valid password {string}")
    public void theUserEntersAValidPassword(String arg0) {
    }

    @And("The user clicks the Login button")
    public void theUserClicksTheLoginButton() {
    }

    @Then("An error message {string} should be displayed")
    public void anErrorMessageShouldBeDisplayed(String arg0) {
    }

    @When("The user enters a valid username {string}")
    public void theUserEntersAValidUsername(String arg0) {
    }

    @And("The user enters an invalid password {string}")
    public void theUserEntersAnInvalidPassword(String arg0) {
    }

    @When("The user leaves the username field empty")
    public void theUserLeavesTheUsernameFieldEmpty() {
    }

    @And("The user leaves the password field empty")
    public void theUserLeavesThePasswordFieldEmpty() {
    }

    @Then("The user should be redirected to the Dashboard page")
    public void theUserShouldBeRedirectedToTheDashboardPage() {
    }
}
