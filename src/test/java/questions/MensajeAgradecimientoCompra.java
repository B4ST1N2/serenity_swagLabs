package questions;

import io.cucumber.java.sk.Tak;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.PaginaFinish;
import userinterface.PaginaLogin;


public class MensajeAgradecimientoCompra implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PaginaFinish.MENSAGE_AGRADECIMIENTO).answeredBy(actor);
    }

    public static MensajeAgradecimientoCompra mensajeAgradecimientoCompra() {
        return new MensajeAgradecimientoCompra();
    }
}
