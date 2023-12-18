package co.com.bcp.tasks.yape;

import co.com.bcp.userinterface.yape.TransferenciaYapePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnvioSoliTransferencia implements Task {

    public EnvioSoliTransferencia() {
        //Task
    }
    public static EnvioSoliTransferencia withTheFollowingFields() {
        return instrumented(EnvioSoliTransferencia.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(TransferenciaYapePage.BTN_ENVIO_SOLI));
    }
}
