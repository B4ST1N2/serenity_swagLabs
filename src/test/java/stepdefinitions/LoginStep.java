package stepdefinitions;

import hook.AbrirNavegador;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.MensajeErrorUsuarioBloqueado;

import static constantes.Constantes.ACTOR;
import static constantes.Constantes.WEB_URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static tasks.IngresarDatosLogin.ingresarDatosLogin;
import static org.hamcrest.Matchers.equalTo;

public class LoginStep {
    @Dado("un usuario se encuentra en la pagina inicial de swaglabs")
    public void unUsuarioSeEncuentraEnLaPaginaInicialDeSwaglabs() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                AbrirNavegador.abrirUrl(WEB_URL)
        );
    }

    @Cuando("el usuario ingresa una username {string} y un password {string}")
    public void elUsuarioIngresaUnaUsernameYUnPassword(String usuario, String clave) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ingresarDatosLogin(usuario,clave)
        );
    }

    @Entonces("el sistema debe mostrar un mensage de error")
    public void elSistemaDebeMostrarUnMensageDeError() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(MensajeErrorUsuarioBloqueado.mensaje(), equalTo("Epic sadface: Sorry, this user has been locked out."))
        );
    }
}
