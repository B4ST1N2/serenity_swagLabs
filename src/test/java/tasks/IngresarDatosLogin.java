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

import static userinterface.PaginaLogin.*;

public class IngresarDatosLogin implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(AgregarProductos.class);

    private String usuario;
    private String clave;

    public IngresarDatosLogin(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    @Step("El usuario intenta ingresar al sistema con los datos: {0} y {1}")
    @Override
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info("Ingresando a la pagina con usuario: {} y contraseña: {}",usuario,clave);
        actor.attemptsTo(
                Clear.field(USERNAME),
                Enter.keyValues(usuario).into(USERNAME),
                Clear.field(PASWORD),
                Enter.keyValues(clave).into(PASWORD),
                Click.on(LOGGIN_BUTTON)
        );
        LOGGER.info("Ingreso completado");
    }

    public static IngresarDatosLogin ingresarDatosLogin (String usuario, String clave){
        return Tasks.instrumented(IngresarDatosLogin.class,usuario,clave);
    }
}
