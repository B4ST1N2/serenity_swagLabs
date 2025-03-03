package tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static userinterface.PaginaProductos.BOTON_PRODUCTO;

public class AgregarProductos implements Task {

    private static final Logger LOGGER = LoggerFactory.getLogger(AgregarProductos.class);

    private String primerProducto;
    private String segundoProducto;


    public AgregarProductos(String primerProducto, String segundoProducto) {
        this.primerProducto = primerProducto;
        this.segundoProducto = segundoProducto;
    }

    @Step("El usuario agrega los productos {0} y {1} al carrito")
    @Override
    public <T extends Actor> void performAs(T actor) {
        LOGGER.info("Iniciando el proceso de agregar al carrito los productos {} y {}",primerProducto, segundoProducto);
        actor.attemptsTo(
                Click.on(BOTON_PRODUCTO.of(primerProducto)),
                Click.on(BOTON_PRODUCTO.of(segundoProducto))
        );
        LOGGER.info("Productos agregados exitosamente");
    }

    public static AgregarProductos agregarProductos (String primerProducto, String segundoProducto){
        return Tasks.instrumented(AgregarProductos.class,primerProducto,segundoProducto);
    }
}
