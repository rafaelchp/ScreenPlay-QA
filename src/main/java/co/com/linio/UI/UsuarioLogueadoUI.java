package co.com.linio.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/*
 *@author Rafael Chica.
 */
public class UsuarioLogueadoUI {

    public static final Target USUARIO_LOGUEADO= Target.the("Usuario Logueado")
            .located(By.xpath("//span[.='Rafael']"));
}
