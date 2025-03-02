package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.PaginaProductos.BOTON_PRODUCTO;

public class AgregarProductos implements Task {

    private String primerProducto;
    private String segundoProducto;


    public AgregarProductos(String primerProducto, String segundoProducto) {
        this.primerProducto = primerProducto;
        this.segundoProducto = segundoProducto;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_PRODUCTO.of(primerProducto)),
                Click.on(BOTON_PRODUCTO.of(segundoProducto))
        );
    }

    public static AgregarProductos agregarProductos (String primerProducto, String segundoProducto){
        return Tasks.instrumented(AgregarProductos.class,primerProducto,segundoProducto);
    }
}
