package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaFinish extends PageObject {

    public static Target MENSAGE_AGRADECIMIENTO = Target.the("mensage de agradecimiento por compra")
            .locatedBy("//*[@id=\"checkout_complete_container\"]/h2");

}
