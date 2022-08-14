package co.com.linio.Task;

import co.com.linio.UI.RegistroUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.*;


/*
 *@author Rafael Chica.
 */
public class GoToRegistro implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.attemptsTo(
                    Click.on(RegistroUI.BTN_INICIO_SESION),
                    Click.on(RegistroUI.BTN_INICIO_SESION2),
                    Click.on(RegistroUI.BTN_CREAR_CUENTA)
                    );



        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
    public static GoToRegistro registrarse() {
        return instrumented(GoToRegistro.class);
    }
}
