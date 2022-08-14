package co.com.linio.Task;

import co.com.linio.UI.LoginUI;
import co.com.linio.UI.RegistroUI;
import co.com.linio.Utils.Datos;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;

import static co.com.linio.UI.LoginUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;



/*
 *@author Rafael Chica.
 */
public class InsertDatosLogin implements Task {
    Datos datos= new Datos();



    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.attemptsTo(
                    Enter.theValue(datos.leerDatosExcel("DataScreenPlay.xlsx","Login",1,0)).into(TXT_EMAIL_LOGIN),
                    Enter.theValue(datos.leerDatosExcel("DataScreenPlay.xlsx","Login",1,1)).into(TXT_CLAVE_LOGIN),
                    Click.on(BTN_INICIAR_SESION)
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static InsertDatosLogin login() {
        return instrumented(InsertDatosLogin.class);
    }
}
