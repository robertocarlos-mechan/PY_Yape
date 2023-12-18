package co.com.bcp.tasks.yape;

import co.com.bcp.userinterface.yape.TransferenciaYapePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BotonCarpetaDownload implements Task {

    public BotonCarpetaDownload() {
        //Task
    }
    public static BotonCarpetaDownload element() {
        return instrumented(BotonCarpetaDownload.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(TransferenciaYapePage.BTN_CARPETA_DOWNLOAD));
    }
}
