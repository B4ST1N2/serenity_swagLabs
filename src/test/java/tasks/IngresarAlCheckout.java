package tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static userinterface.PaginaCart.CHECKOUT;

public class IngresarAlCheckout implements Task{

    private static final Logger LOGGER = LoggerFactory.getLogger(AgregarProductos.class);

    public IngresarAlCheckout(){}

    @Step("El Usuario ingresa al Checkout")
    @Override
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info("Ingresando a la pagina Checkout");
        actor.attemptsTo(
                Click.on(CHECKOUT)
        );
        LOGGER.info("Ingreso al checkout exitoso");
    }

    public static IngresarAlCheckout ingresarAlCheckout(){
        return Tasks.instrumented(IngresarAlCheckout.class);
    }

}
