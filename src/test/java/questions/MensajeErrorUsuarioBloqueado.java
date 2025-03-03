package questions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.PaginaLogin;


public class MensajeErrorUsuarioBloqueado implements Question<String> {

    @Step("Validando Mensaje de error por usuario bloqueado")
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PaginaLogin.MESSAGE_ERROR).answeredBy(actor);
    }

    public static MensajeErrorUsuarioBloqueado mensaje() {
        return new MensajeErrorUsuarioBloqueado();
    }
}
