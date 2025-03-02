package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.PaginaOverview.FINISH_BUTTON;

public class FinalizarCompra implements Task {

    public FinalizarCompra(){}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FINISH_BUTTON)
        );
    }

    public static FinalizarCompra finalizarCompra(){
        return Tasks.instrumented(FinalizarCompra.class);
    }

}
