package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaProductos extends PageObject {

    public static final Target ORDENAR_PRODUCTOS = Target.the("Desplegable de ordenacion de productos")
            .locatedBy("//select[@class='product_sort_container']");

    public static final Target BOTON_PRODUCTO = Target.the("Botón de agregar producto al carrito")
            .locatedBy("//div[contains(@class, 'inventory_item') and .//div[@class='inventory_item_name' and text()='{0}']]//button");

    public static final Target CARRITO = Target.the("Carrito")
            .locatedBy("//*[@id=\"shopping_cart_container\"]");

}
