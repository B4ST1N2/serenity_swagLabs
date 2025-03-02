package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.PaginaLogin.*;

public class IngresarDatosLogin implements Task {

    private String usuario;
    private String clave;

    public IngresarDatosLogin(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(USERNAME),
                Enter.keyValues(usuario).into(USERNAME),
                Clear.field(PASWORD),
                Enter.keyValues(clave).into(PASWORD),
                Click.on(LOGGIN_BUTTON)
        );
    }

    public static IngresarDatosLogin ingresarDatosLogin (String usuario, String clave){
        return Tasks.instrumented(IngresarDatosLogin.class,usuario,clave);
    }
}
