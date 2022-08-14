package co.com.linio.Task;

import static co.com.linio.UI.SelectCategoriaUI.*;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;

/*
 *@author Rafael Chica.
 */
public class SelectCategoria implements Task {




    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.attemptsTo(
                    Click.on(BTN_CATEGORIA),
                    Click.on(LNK_SUBCATEGORIA),
                    Click.on(LNK_PRODUCTOS),
                    Click.on(IMG_PRODUCTO),
                    Click.on(BTN_AGREGAR_AL_CARRITO),
                    Click.on(BTN_SEGUIR_COMPRANDO),
                    Enter.theValue("zapatos para hombre").into(TXT_BUSQUEDA),
                    Click.on(BTN_BUSQUEDA),
                    Click.on(LNK_NUEVO_PRODUCTO),
                    Click.on(BTN_AGREGAR_AL_CARRITO),
                    Click.on(BTN_IR_AL_CARRITO)

            );

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static SelectCategoria categorias() {
        return instrumented(SelectCategoria.class);
    }
}
