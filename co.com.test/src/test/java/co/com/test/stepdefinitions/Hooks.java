package co.com.test.stepdefinitions;

import co.com.test.tasks.Abrir;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class Hooks {

    @Before()
    public void inicializeActor() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario").wasAbleTo(Abrir.laPagina());
    }
}
