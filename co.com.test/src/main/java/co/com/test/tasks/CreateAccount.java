package co.com.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.test.userinterface.CreateAccountPage.*;
import static co.com.test.userinterface.HomePage.BTN_USER;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class CreateAccount implements Task {

    private final String username;
    private final String email;
    private final String password;

    public CreateAccount(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public static CreateAccount withRequiredFields(String username, String email, String password) {
        return instrumented(CreateAccount.class, username, email, password);
    }


    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(Enter.theValue(username).into(INPUT_USERNAME),
                Enter.theValue(email).into(INPUT_EMAIL),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Enter.theValue(password).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECK_AGREE),
                WaitUntil.the(BTN_REGISTER, isVisible()),
                Click.on(BTN_REGISTER));
    }

}
