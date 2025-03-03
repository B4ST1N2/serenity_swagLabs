package tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static userinterface.PaginaOverview.FINISH_BUTTON;

public class FinalizarCompra implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(AgregarProductos.class);

    public FinalizarCompra(){}

    @Step("El usuario finaliza la compra")
    @Override
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info("Iniciando proceso de finalizacion de compra...");
        actor.attemptsTo(
                Click.on(FINISH_BUTTON)
        );
        LOGGER.info("Compra finalizada correctamente.");
    }

    public static FinalizarCompra finalizarCompra(){
        return Tasks.instrumented(FinalizarCompra.class);
    }

}
