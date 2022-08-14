package co.com.linio.Task;

import co.com.linio.UI.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.*;
import net.serenitybdd.screenplay.actions.Click;

/*
 *@author Rafael Chica.
 */
public class GotToLogin implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.attemptsTo(
                    Click.on(LoginUI.BTN_INICIO_SESION),
                    Click.on(LoginUI.BTN_INICIO_SESION2)
            );

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static GotToLogin login() {
        return instrumented(GotToLogin.class);
    }
}
