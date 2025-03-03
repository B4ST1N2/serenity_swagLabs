package questions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.PaginaFinish;

public class MensajeAgradecimientoCompra implements Question<String> {

    @Step("Validando mensaje de agradecimiento por la compra")
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PaginaFinish.MENSAGE_AGRADECIMIENTO).answeredBy(actor);
    }

    public static MensajeAgradecimientoCompra mensajeAgradecimientoCompra() {
        return new MensajeAgradecimientoCompra();
    }
}
