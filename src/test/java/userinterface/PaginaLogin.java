package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaLogin extends PageObject{

    public static final Target USERNAME = Target.the("nombre del usuario")
            .locatedBy("//*[@id=\"user-name\"]");

    public static final Target PASWORD = Target.the("contraseña")
            .locatedBy("//*[@id=\"password\"]");

    public static final Target LOGGIN_BUTTON = Target.the("boton ingresar")
            .locatedBy("//*[@id=\"login-button\"]");

    public static final Target MESSAGE_ERROR = Target.the("mensaje usuario bloqueado")
            .located(By.cssSelector("h3[data-test='error']"));
}
