package co.com.test.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.test.userinterface.LoginPage.*;

public class LoginMessageError implements Question<String> {

    public static Question is() {
        return new LoginMessageError();
    }

    @Override
    public String answeredBy(Actor actor) {
        String palabra = Text.of(ERROR_MESSAGE).viewedBy(actor).asString().trim();
        return palabra;
    }
}
