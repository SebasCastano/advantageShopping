package co.com.test.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.test.userinterface.HomePage.USERNAME_FIELD;

public class UsernameInformation implements Question<String> {

    public static Question is() {
        return new UsernameInformation();
    }

    @Override
    public String answeredBy(Actor actor) {
        String palabra = Text.of(USERNAME_FIELD).viewedBy(actor).asString().trim();
        return palabra;
    }
}
