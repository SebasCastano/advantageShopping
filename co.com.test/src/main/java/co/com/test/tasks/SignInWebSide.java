package co.com.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.test.userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SignInWebSide implements Task {

    private final String username;
    private final String password;

    public SignInWebSide(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static SignInWebSide withWrongCredencials(String username, String password) {
        return instrumented(SignInWebSide.class, username, password);
    }
//    public static SigIn withWrongCredencials(String username, String password) {
//        return instrumented(SigIn.class,  modulo);
//    }

    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(Enter.theValue(username).into(INPUT_USERNAME),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(BTN_SIGN_IN));
    }

}
