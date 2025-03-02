package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static userinterface.PaginaProductos.ORDENAR_PRODUCTOS;

public class OrdenarProductos implements Task {

    private  String criterio;

    public OrdenarProductos(String criterio) {
        this.criterio = criterio;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byValue(criterio).from(ORDENAR_PRODUCTOS)
        );
    }

    public static OrdenarProductos ordenarProductos (String criterio){
        return Tasks.instrumented(OrdenarProductos.class, criterio);
    }
}
