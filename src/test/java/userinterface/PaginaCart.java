package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaCart extends PageObject {

    public static final Target BOTON_REMOVE = Target.the("Botón para eliminar un producto")
            .locatedBy("//button[contains(@class, 'cart_button') and text()='REMOVE']");

    public static final Target CHECKOUT = Target.the("Botón para continuar la compra")
            .locatedBy("//a[contains(@class, 'checkout_button') and contains(text(), 'CHECKOUT')]");


}
