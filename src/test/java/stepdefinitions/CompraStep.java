package stepdefinitions;

import hook.AbrirNavegador;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.MensajeAgradecimientoCompra;

import static constantes.Constantes.ACTOR;
import static constantes.Constantes.WEB_URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static tasks.AgregarProductos.agregarProductos;
import static tasks.EliminarProducto.eliminarProducto;
import static tasks.FinalizarCompra.finalizarCompra;
import static tasks.IngresarAlCarrito.ingresarAlCarrito;
import static tasks.IngresarAlCheckout.ingresarAlCheckout;
import static tasks.IngresarDatosAlCheckout.ingresarDatosAlCheckout;
import static tasks.IngresarDatosLogin.ingresarDatosLogin;
import static tasks.OrdenarProductos.ordenarProductos;

public class CompraStep {
    @Dado("que el usuario ha iniciado sesión en la tienda con su usuario  {string} y contraseña {string}")
    public void queElUsuarioHaIniciadoSesiónEnLaTiendaConSuUsuarioYContraseña(String usuario, String contraseña) {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                AbrirNavegador.abrirUrl(WEB_URL),
                ingresarDatosLogin(usuario, contraseña)
        );
    }

    @Cuando("ordena los productos por un metodo {string}")
    public void ordenaLosProductosPorUnMetodo(String metodoOrdenamiento) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ordenarProductos(metodoOrdenamiento)
        );
    }

    @Y("agrega los productos {string} y {string} al carrito")
    public void agregaLosProductosYAlCarrito(String primerProducto, String segundoProducto) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                agregarProductos(primerProducto,segundoProducto)
        );
    }

    @Y("elimina el producto {string} del carrito")
    public void eliminaElProductoDelCarrito(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ingresarAlCarrito(),
                eliminarProducto(producto)
        );
    }

    @Y("procede a la compra ingresando su información de envío {string} , {string} , {string}")
    public void procedeALaCompraIngresandoSuInformaciónDeEnvío(String nombre, String apellido, String codigo) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ingresarAlCheckout(),
                ingresarDatosAlCheckout(nombre,apellido,codigo),
                finalizarCompra()
        );

    }

    @Entonces("el sistema debe mostrar un mensaje de confirmación de compra exitoso")
    public void elSistemaDebeMostrarUnMensajeDeConfirmaciónDeCompraExitoso() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(MensajeAgradecimientoCompra.mensajeAgradecimientoCompra(),equalTo("THANK YOU FOR YOUR ORDER"))
        );
    }
}
