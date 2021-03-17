package co.com.test.userinterface;

import co.com.test.util.Constantes;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(Constantes.AMBIENTE_CALIDAD)
public class LoginPage extends PageObject {
    public static final Target INPUT_USERNAME = Target.the("Input").locatedBy("//*[@name='username']");
    public static final Target INPUT_PASSWORD = Target.the("Input").locatedBy("//*[@name='password']");
    public static final Target CHECK_REMEMBER_ME = Target.the("Check").locatedBy("//*[@name='remember_me']");
    public static final Target BTN_SIGN_IN = Target.the("Button").locatedBy("//*[@ID='sign_in_btnundefined']");
    public static final Target BTN_CREATE_ACCOUNT = Target.the("Button").locatedBy("//*[@class='create-new-account ng-scope']");
    public static final Target ERROR_MESSAGE = Target.the("Error Message").locatedBy("//*[@ID='signInResultMessage']");


}
