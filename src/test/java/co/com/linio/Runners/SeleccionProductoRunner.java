package co.com.linio.Runners;

/*
 *@author Rafael Chica.
 */
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/seleccionProducto.feature",

        glue = "co.com.linio.StepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class SeleccionProductoRunner {
}
