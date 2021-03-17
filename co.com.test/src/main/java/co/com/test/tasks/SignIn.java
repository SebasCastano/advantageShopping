package co.com.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.test.userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SignIn implements Task {

    private final String username;
    private final String password;

    public SignIn(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static SignIn withCorrectCredencials(String username, String password) {
        return instrumented(SignIn.class, username, password);
    }


    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(Enter.theValue(username).into(INPUT_USERNAME),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(BTN_SIGN_IN));
    }

}
