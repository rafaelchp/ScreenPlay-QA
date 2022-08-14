package co.com.linio.Questions;

import co.com.linio.UI.UsuarioLogueadoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/*
 *@author Rafael Chica.
 */
public class UsuarioLogueado implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return UsuarioLogueadoUI.USUARIO_LOGUEADO.resolveFor(actor).isVisible();
    }

    public  static Question usuarioLogueado(){
        return  new UsuarioLogueado();
    }
}
