package co.com.test.userinterface;

import co.com.test.util.Constantes;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(Constantes.AMBIENTE_CALIDAD)
public class CreateAccountPage extends PageObject {
    public static final Target INPUT_USERNAME = Target.the("Input Username").locatedBy("//*[@name='usernameRegisterPage']");
    public static final Target INPUT_EMAIL = Target.the("Input email").locatedBy("//*[@name='emailRegisterPage']");
    public static final Target INPUT_PASSWORD = Target.the("Input password").locatedBy("//*[@name='passwordRegisterPage']");
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Input confirm password").locatedBy("//*[@name='confirm_passwordRegisterPage']");
    public static final Target CHECK_AGREE = Target.the("Check agree terms").locatedBy("//*[@name='i_agree']");
    public static final Target BTN_REGISTER = Target.the("Check agree terms").locatedBy("//*[@id='register_btnundefined']");
    public static final Target ACCOUNT_EXISTING_ERROR = Target.the("Check agree terms").locatedBy("//*[contains(@class,'center block smollMargin')]");

}
