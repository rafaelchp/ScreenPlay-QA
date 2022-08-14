package co.com.linio.UI;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/*
 *@author Rafael Chica.
 */
public class LoginUI {
    public  static  final Target BTN_INICIO_SESION= Target.the("clic inicio sesion")
            .located(By.xpath("//*[@id=\"navbar\"]/div/div[4]/div[2]/a"));

    public  static  final Target BTN_INICIO_SESION2= Target.the("clic opcion inicio sesion")
            .located(By.xpath("//*[@id=\"user-menu\"]/ul/li[1]"));
    public static  final Target TXT_EMAIL_LOGIN= Target.the("ingresar correo")
            .located(By.name("login_form[email]"));
    public static  final Target TXT_CLAVE_LOGIN= Target.the("ingresar clave")
            .located(By.name("login_form[password]"));
    public static  final Target BTN_INICIAR_SESION= Target.the("clic boton iniciar sesion")
            .located(By.xpath("//*[@id=\"login-form\"]/form/button"));
}
