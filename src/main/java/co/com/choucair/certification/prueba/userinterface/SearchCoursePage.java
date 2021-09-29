package co.com.choucair.certification.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("selecciona cursos y certificaciones")
            .located(By.xpath("//*[@id='certificaciones']/div[1]/a/h4/strong"));
    public static final Target INPUT_COURSE = Target.the("buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("da click para buscar el curso")
            .located(By.id("coursesearch"));
    public static final Target SELECT_COURSE = Target.the("da click para seleccionar el curso")
            .located(By.xpath("//*[text()='Foundation Level']"));
    public static final Target NAME_COURSE = Target.the("extrae el nombre del curso")
            .located(By.xpath("//*[@id='region-main']/div/div[1]/div/div[1]/h3"));
}
