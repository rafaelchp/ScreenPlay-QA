package co.com.linio.StepDefinitions;

/*
 *@author Rafael Chica.
 */
import co.com.linio.Questions.ResumenPedido;
import co.com.linio.Task.GotToLogin;
import co.com.linio.Task.InsertDatosLogin;
import co.com.linio.Task.SelectCategoria;
import co.com.linio.UI.RegistroUI;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SeleccionProductoStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor rafael= Actor.named("rafael");

    private RegistroUI registroUI= new RegistroUI();

    @Before
    public void  configuracion(){
        rafael.can(BrowseTheWeb.with(navegador));
    }

    @Dado("el usuario este logueado")
    public void elUsuarioEsteLogueado() {
        rafael.wasAbleTo(
                GotToLogin.login(),
                InsertDatosLogin.login()
        );

    }

    @Cuando("el usuario elija la categoria y el producto desado y agregue el producto al carrito")
    public void elUsuarioElijaLaCategoriaYElProductoDesadoYAgregueElProductoAlCarrito() {
        rafael.wasAbleTo(
                SelectCategoria.categorias()
        );

    }

    @Entonces("podrá visualizar el mensaje de resumen del pedido")
    public void podráVisualizarElMensajeDeResumenDelPedido() {
        rafael.should(seeThat("Se visualizará resumen de compra", ResumenPedido.pedido(), Matchers.equalTo(true)));

    }
}
