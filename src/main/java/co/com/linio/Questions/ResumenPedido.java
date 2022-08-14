package co.com.linio.Questions;

import co.com.linio.UI.SelectCategoriaUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/*
 *@author Rafael Chica.
 */
public class ResumenPedido implements Question {


    @Override
    public Boolean answeredBy(Actor actor) {
        return SelectCategoriaUI.MSJ_PEDIDO.resolveFor(actor).isVisible();
    }

    public static Question pedido() {
        return  new ResumenPedido();
    }
}
