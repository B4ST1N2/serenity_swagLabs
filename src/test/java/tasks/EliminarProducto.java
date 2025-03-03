package tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static userinterface.PaginaCart.BOTON_REMOVE;


public class EliminarProducto implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(AgregarProductos.class);

    private String producto;

    public EliminarProducto(String producto) {
        this.producto = producto;
    }

    @Step("El usuario elimina el producto {0} del carrito")
    @Override
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info("El usuario va a elimar el producto {}", producto);
        actor.attemptsTo(
                Click.on(BOTON_REMOVE.of(producto))
        );
        LOGGER.info("Producto eliminado exitosamente");
    }

    public static EliminarProducto eliminarProducto(String producto){
        return Tasks.instrumented(EliminarProducto.class,producto);
    }
}
