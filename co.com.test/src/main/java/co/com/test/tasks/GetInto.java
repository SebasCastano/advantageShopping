package co.com.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.test.userinterface.HomePage.BTN_USER;
import static co.com.test.userinterface.LoginPage.BTN_CREATE_ACCOUNT;
import static co.com.test.util.Constantes.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


import static net.serenitybdd.screenplay.Tasks.instrumented;


public class GetInto implements Task {

    private final String modulo;

    public GetInto(final String modulo) {
        this.modulo = modulo;
    }

    public static GetInto inThe(final String modulo) {
        return instrumented(GetInto.class, modulo);
    }

    @Override
    public <T extends Actor> void performAs(final T actor) {
        switch (modulo) {
            case LOGIN:
                login(actor);
                break;
            case CREATE_ACCOUNT:
                createUser(actor);
                break;
        }
    }

    public void login(Actor actor){
        actor.attemptsTo(WaitUntil.the(BTN_USER, isVisible()),
                Click.on(BTN_USER));
    }

    public void createUser(Actor actor){
        actor.attemptsTo(WaitUntil.the(BTN_USER, isVisible()),
                Click.on(BTN_USER),
                WaitUntil.the(BTN_CREATE_ACCOUNT, isVisible()),
                Click.on(BTN_CREATE_ACCOUNT));
    }

}
