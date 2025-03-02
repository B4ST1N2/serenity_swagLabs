package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.PaginaProductos.CARRITO;

public class IngresarAlCarrito implements Task {

    public IngresarAlCarrito(){}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CARRITO)
        );
    }

    public static IngresarAlCarrito ingresarAlCarrito(){
        return Tasks.instrumented(IngresarAlCarrito.class);
    }
}
