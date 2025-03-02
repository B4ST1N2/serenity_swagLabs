package userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class PaginaCheckout extends PageObject {

    public static final Target FIRST_NAME = Target.the("input nombre del usaurio")
            .locatedBy("//*[@id=\"first-name\"]");

    public static final Target LAST_NAME = Target.the("Input apellido del usuario")
            .locatedBy("//*[@id=\"last-name\"]");

    public static final Target ZIP = Target.the("Input Codigo postal")
            .locatedBy("//*[@id=\"postal-code\"]");

    public static final Target CONTINUE_BUTTON = Target.the("Botón continuar")
            .locatedBy("//input[@value='CONTINUE']");

}
