package co.com.linio.UI;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

/*
 *@author Rafael Chica.
 */
@DefaultUrl("https://www.linio.com.co/")
public class RegistroUI extends PageObject {

    public  static  final Target BTN_INICIO_SESION= Target.the("clic inicio sesion")
            .located(By.xpath("//*[@id=\"navbar\"]/div/div[4]/div[2]/a"));

    public  static  final Target BTN_INICIO_SESION2= Target.the("clic opcion inicio sesion")
            .located(By.xpath("//*[@id=\"user-menu\"]/ul/li[1]"));

    public  static  final Target BTN_CREAR_CUENTA= Target.the("clic crear cuenta")
            .located(By.xpath("//a[.='Crear cuenta']"));



    public static  final Target TXT_NOMBRE= Target.the("ingresar nombre")
            .located(By.name("registration[firstName]"));

    public static  final Target TXT_APELLIDO= Target.the("ingresar apellido")
            .located(By.name("registration[lastName]"));

    public static  final Target TXT_EMAIL= Target.the("ingresar correo")
            .located(By.name("registration[email]"));

    public static  final Target TXT_CLAVE= Target.the("ingresar clave")
            .located(By.name("registration[password]"));

    public static  final Target TXT_IDENTIFICACION= Target.the("ingresar cedula")
            .located(By.name("registration[nationalRegistrationNumber]"));

    public static  final Target CHK_TERMINOS= Target.the("check terminos y condiciones")
            .located(By.xpath("//*[@id=\"registration-form\"]/div/label[1]"));

    public static  final Target BTN_COMPLETAR_REGISTRO= Target.the("clic completar registro")
            .located(By.xpath("//button[.='Completar registro']"));
}
