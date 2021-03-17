package co.com.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.test.userinterface.CreateAccountPage.ACCOUNT_EXISTING_ERROR;

public class AccountExistingMessageError implements Question<String> {

    public static Question is() {
        return new AccountExistingMessageError();
    }

    @Override
    public String answeredBy(Actor actor) {
        String palabra = Text.of(ACCOUNT_EXISTING_ERROR).viewedBy(actor).asString().trim();
        System.out.println("PALABRA:" +palabra);
        return palabra;
    }
}
