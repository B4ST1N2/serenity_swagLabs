package tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static userinterface.PaginaProductos.CARRITO;

public class IngresarAlCarrito implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(AgregarProductos.class);

    public IngresarAlCarrito(){}

    @Step("El usuario ingresa al carrito")
    @Override
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info("Ingresando al carrito.");
        actor.attemptsTo(
                Click.on(CARRITO)
        );
        LOGGER.info("Se ingreso al carrito");
    }

    public static IngresarAlCarrito ingresarAlCarrito(){
        return Tasks.instrumented(IngresarAlCarrito.class);
    }
}
