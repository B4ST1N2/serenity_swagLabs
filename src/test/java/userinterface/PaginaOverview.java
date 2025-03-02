package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaOverview extends PageObject {

    public static final Target FINISH_BUTTON = Target.the("Botón finalizar compra")
            .locatedBy("//a[normalize-space()='FINISH']");

}
