package tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static userinterface.PaginaProductos.ORDENAR_PRODUCTOS;

public class OrdenarProductos implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(AgregarProductos.class);

    private  String criterio;

    public OrdenarProductos(String criterio) {
        this.criterio = criterio;
    }

    @Step("El usuario Ordenara los productos")
    @Override
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info("Iniciando ordenamiento de productos con el criterio: {}",criterio);
        actor.attemptsTo(
                SelectFromOptions.byValue(criterio).from(ORDENAR_PRODUCTOS)
        );
        LOGGER.info("Ordenamiento completado.");
    }

    public static OrdenarProductos ordenarProductos (String criterio){
        return Tasks.instrumented(OrdenarProductos.class, criterio);
    }
}
