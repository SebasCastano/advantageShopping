package co.com.test.stepdefinitions;

import co.com.test.questions.AccountExistingMessageError;
import co.com.test.questions.LoginMessageError;
import co.com.test.questions.UsernameInformation;
import co.com.test.tasks.CreateAccount;
import co.com.test.tasks.GetInto;
import co.com.test.tasks.SignIn;
import co.com.test.tasks.SignInWebSide;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static co.com.test.util.Constantes.OR_MESSAGE;
import static co.com.test.util.Constantes.USER_EXISTING;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;

public class CreateAccountStepDefinitions {

    @When("^create a account with required fields (.*), (.*) and (.*)$")
    public void crateAccountWithRequiredCredencials(String username, String email, String password) {
        theActorInTheSpotlight().attemptsTo(CreateAccount.withRequiredFields(username, email, password));
    }

    @When("^create a account existing with (.*), (.*) and (.*)$")
    public void crateAccountExisting(String username, String email, String password) {
        theActorInTheSpotlight().attemptsTo(CreateAccount.withRequiredFields(username, email, password));
    }

    @Then("^view the account existing message error$")
    public void viewTheInformationHim() {
        theActorInTheSpotlight().should(seeThat(AccountExistingMessageError.is(), equalTo(USER_EXISTING)));
    }

}
