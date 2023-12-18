package co.com.bcp.tasks.yape;

import co.com.bcp.userinterface.yape.TransferenciaYapePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckSeleccionPago implements Task {

    public CheckSeleccionPago() {
        //Task
    }
    public static CheckSeleccionPago element() {
        return instrumented(CheckSeleccionPago.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(TransferenciaYapePage.CHECK_PAGO_SELECCIONADO));
    }
}
