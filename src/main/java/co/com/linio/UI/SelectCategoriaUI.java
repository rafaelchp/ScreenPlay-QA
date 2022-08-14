package co.com.linio.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/*
 *@author Rafael Chica.
 */
public class SelectCategoriaUI {

    public static  final Target BTN_CATEGORIA= Target.the("clic menu amburguesa categorias")
            .located(By.xpath("//*[@id=\"open-left-menu\"]"));

    public static  final Target LNK_SUBCATEGORIA= Target.the("clic categoria")
            .located(By.xpath("//span[.='Moda']"));

    public static  final Target LNK_PRODUCTOS= Target.the("clic SUB categoria")
            .located(By.xpath("//span[.='Hombres']"));

    public static  final Target IMG_PRODUCTO= Target.the("clic producto")
            .located(By.xpath("//span[.='Sweater Hombre Wolf & Hank']"));

    public static  final Target BTN_AGREGAR_AL_CARRITO= Target.the("clic agregar al carrito")
            .located(By.id("buy-now"));

    public static  final Target BTN_SEGUIR_COMPRANDO= Target.the("clic seguir comprando")
            .located(By.xpath("//button[.='Seguir comprando']"));

    public static  final Target TXT_BUSQUEDA= Target.the("campo busqueda")
            .located(By.xpath("//*[@id=\"navbar\"]/div/div[3]/div[2]/form/div/div/input"));

    public static  final Target BTN_BUSQUEDA= Target.the("Clic boton busqueda")
            .located(By.xpath("//*[@id=\"navbar\"]/div/div[3]/div[2]/form/div/div/div/button"));

    public static  final Target LNK_NUEVO_PRODUCTO= Target.the("Seleccion nuevo producto")
            .located(By.xpath("//span[.='Tenis NIKE DEFY ALL DAY DJ1196-002 Para...']"));

    public static  final Target BTN_IR_AL_CARRITO= Target.the("Ir al carrito")
            .located(By.xpath("//*[@id=\"alert-add-to-cart\"]/div/div/div[4]/a"));

    public static  final Target MSJ_PEDIDO= Target.the("Resumen del pedido")
            .located(By.xpath("//a[@href='/checkout/payment']"));

}
