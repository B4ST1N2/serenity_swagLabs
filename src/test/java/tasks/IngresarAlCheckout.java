package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.PaginaCart.CHECKOUT;

public class IngresarAlCheckout implements Task{

    public IngresarAlCheckout(){}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CHECKOUT)
        );
    }

    public static IngresarAlCheckout ingresarAlCheckout(){
        return Tasks.instrumented(IngresarAlCheckout.class);
    }

}
