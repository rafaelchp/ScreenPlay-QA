package co.com.linio.Task;

import co.com.linio.UI.RegistroUI;
import co.com.linio.Utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;

import static co.com.linio.UI.RegistroUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

/*
 *@author Rafael Chica.
 */
public class InsertDatosRegistro implements Task {
    Datos datos= new Datos();





    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    Enter.theValue(datos.leerDatosExcel("DataScreenPlay.xlsx","Registro",1,0)).into(TXT_NOMBRE),
                    Enter.theValue(datos.leerDatosExcel("DataScreenPlay.xlsx","Registro",1,1)).into(TXT_APELLIDO),
                    Enter.theValue(datos.leerDatosExcel("DataScreenPlay.xlsx","Registro",1,2)).into(TXT_EMAIL),
                    Enter.theValue(datos.leerDatosExcel("DataScreenPlay.xlsx","Registro",1,3)).into(TXT_CLAVE),
                    Enter.theValue(datos.leerDatosExcel("DataScreenPlay.xlsx","Registro",1,4)).into(TXT_IDENTIFICACION),
                    //Enter.theValue("45787457").into(TXT_IDENTIFICACION),
                    Click.on(RegistroUI.CHK_TERMINOS),


                    Click.on(RegistroUI.BTN_COMPLETAR_REGISTRO)
            );





        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static InsertDatosRegistro insertardatos() {
        return instrumented(InsertDatosRegistro.class);
    }
}
