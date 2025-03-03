package hook;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tasks.AgregarProductos;

public class AbrirNavegador implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(AgregarProductos.class);

    private String url;

    public AbrirNavegador(String url) {
        this.url = url;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info("Abriendo el Navegador");
        actor.attemptsTo(Open.url(url));
    }

    public static AbrirNavegador abrirUrl(String url) {
        return Tasks.instrumented(AbrirNavegador.class, url);
    }
}
