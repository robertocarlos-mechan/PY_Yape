package co.com.bcp.tasks.yape;

import co.com.bcp.userinterface.yape.TransferenciaYapePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpcionGeneraCodigoQR implements Task {

    public OpcionGeneraCodigoQR() {
        //Task
    }
    public static OpcionGeneraCodigoQR element() {
        return instrumented(OpcionGeneraCodigoQR.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(TransferenciaYapePage.BTN_GENERA_CODIGO_QR));
    }
}
