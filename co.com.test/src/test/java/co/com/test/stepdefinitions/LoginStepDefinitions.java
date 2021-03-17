package co.com.test.stepdefinitions;

import co.com.test.questions.LoginMessageError;
import co.com.test.questions.UsernameInformation;
import co.com.test.tasks.GetInto;
import co.com.test.tasks.SignIn;
import co.com.test.tasks.SignInWebSide;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static co.com.test.util.Constantes.OR_MESSAGE;
import static org.hamcrest.Matchers.equalTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.not;

public class LoginStepDefinitions {

        @Given("^the user enters the (.*) module$")
    public void enterTheModule(String module) {
            theActorInTheSpotlight().wasAbleTo(GetInto.inThe(module));
    }

    @When("^sign in with correct credencials (.*) and (.*)$")
    public void signInWithCorrectCredencials(String username, String password) {
        theActorInTheSpotlight().attemptsTo(SignIn.withCorrectCredencials(username, password));
    }

    @When("^sign in with wrong credencials (.*) and (.*)$")
    public void signInWithWrongCredencials(String username, String password) {
        theActorInTheSpotlight().attemptsTo(SignInWebSide.withWrongCredencials(username, password));
    }

    @Then("^view information of him (.*)$")
    public void viewTheInformationHim(String username) {
        theActorInTheSpotlight().should(seeThat(UsernameInformation.is(), equalTo(username)));
    }

    @Then("^view the login message error$")
    public void loginErrorMessage() {
        theActorInTheSpotlight().should(seeThat(LoginMessageError.is(), not(equalTo(OR_MESSAGE))));
    }
}
