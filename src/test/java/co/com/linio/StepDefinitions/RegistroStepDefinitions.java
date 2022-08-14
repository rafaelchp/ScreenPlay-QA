package co.com.linio.StepDefinitions;

import co.com.linio.Questions.UsuarioLogueado;
import co.com.linio.Task.GoToRegistro;
import co.com.linio.Task.InsertDatosRegistro;
import co.com.linio.UI.RegistroUI;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


/*
 *@author Rafael Chica.
 */
public class RegistroStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor rafael= Actor.named("rafael");

    private RegistroUI registroUI= new RegistroUI();

    @Before
    public void  configuracion(){
        rafael.can(BrowseTheWeb.with(navegador));
    }

    @Dado("el usuario se encuentre en la pagina web")
    public void elUsuarioSeEncuentreEnLaPaginaWeb() {
        rafael.wasAbleTo(Open.browserOn(registroUI));

    }


    @Cuando("el usuario ingrese a la opción crear cuenta e ingrese los datos")
    public void elUsuarioIngreseALaOpciónCrearCuentaEIngreseLosDatos() {
        rafael.wasAbleTo(
                GoToRegistro.registrarse(),
                InsertDatosRegistro.insertardatos()
        );



    }
    @Entonces("podrá visualizar el nombre de usuario en la pagina")
    public void podráVisualizarElNombreDeUsuarioEnLaPagina() {
        rafael.should(seeThat("Se visualiza el usuario logueado", UsuarioLogueado.usuarioLogueado(), Matchers.equalTo(true)));

    }
}
