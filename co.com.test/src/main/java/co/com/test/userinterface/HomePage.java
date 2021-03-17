package co.com.test.userinterface;

import co.com.test.util.Constantes;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(Constantes.AMBIENTE_CALIDAD)
public class HomePage extends PageObject {
    public static final Target BTN_USER = Target.the("Button user").locatedBy("//*[@id='hrefUserIcon']");
    public static final Target SELECT_CATEGORY = Target.the("Select category").locatedBy("//*[@name='categoryListboxContactUs']");
    public static final Target SELECT_PRODUCT = Target.the("Select product").locatedBy("//*[@name='productListboxContactUs']");
    public static final Target INPUT_EMAIL = Target.the("Input email").locatedBy("//*[@name='emailContactUs']");
    public static final Target AREA_SUBJECT = Target.the("Text area subject").locatedBy("//*[@id='send_btnundefined']");
    public static final Target MESSAGE_CONTACT_SUCCESS = Target.the("Message of errors").locatedBy("//*[@class='roboto-regular successMessage ng-binding']");
    public static final Target USERNAME_FIELD = Target.the("Input username").locatedBy("//*[@class='hi-user containMiniTitle ng-binding']");


}
