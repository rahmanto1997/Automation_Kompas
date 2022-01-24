package starter.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.GoalSteps;

public class Goals {
    @Steps
    GoalSteps gs;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        gs.openHomePage();
        gs.openLoginPage();
    }

    @When("I enter my username and password")
    public void iEnterMyUsernameAndPassword() {
        gs.inputEmailPassword();
    }

    @Then("I am success login")
    public void iAmSuccessLogin() {
        gs.validateUser();
    }

    @And("I am search for news")
    public void iAmSearchForNews() {
        gs.searchNews();
    }

    @And("I am success looking for news")
    public void iAmSuccessLookingForNews() {
        gs.validateSearch();
    }
}