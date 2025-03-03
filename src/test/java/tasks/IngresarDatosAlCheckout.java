package tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static userinterface.PaginaCheckout.*;

public class IngresarDatosAlCheckout implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(AgregarProductos.class);

    private String nombre;
    private String apellido;
    private String codigoPostal;

    public IngresarDatosAlCheckout(String nombre, String apellido, String codigoPostal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoPostal = codigoPostal;
    }

    @Step("El usuario llena el formulario de checkout con los datos: {0},{1},{2}")
    @Override
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info("El usuario ingresa los datos {} , {} , {} , en el Checkout",nombre,apellido,codigoPostal);
        actor.attemptsTo(
                Clear.field(FIRST_NAME),
                Enter.keyValues(nombre).into(FIRST_NAME),
                Clear.field(LAST_NAME),
                Enter.keyValues(apellido).into(LAST_NAME),
                Clear.field(ZIP),
                Enter.keyValues(codigoPostal).into(ZIP),
                Click.on(CONTINUE_BUTTON)
        );
        LOGGER.info("Datos ingresados correctamente.");
    }

    public static IngresarDatosAlCheckout ingresarDatosAlCheckout(String nombre,String apellido, String codigoPostal){
        return Tasks.instrumented(IngresarDatosAlCheckout.class,nombre,apellido,codigoPostal);
    }



}
