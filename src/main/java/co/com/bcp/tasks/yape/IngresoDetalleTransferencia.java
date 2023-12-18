package co.com.bcp.tasks.yape;

import co.com.bcp.userinterface.yape.TransferenciaYapePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bcp.interactions.HideKeyboard.theActorHidesKeyboard;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class IngresoDetalleTransferencia implements Task {

    public IngresoDetalleTransferencia() {
        //Task
    }
    public static IngresoDetalleTransferencia withTheFollowingFields() {
        return instrumented(IngresoDetalleTransferencia.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(TransferenciaYapePage.TXT_DETALLE_TRANSFERENCIA, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(TransferenciaYapePage.TXT_DETALLE_TRANSFERENCIA),
                Enter.theValue("Transferencia QA").into(TransferenciaYapePage.TXT_DETALLE_TRANSFERENCIA),
                theActorHidesKeyboard());
    }
}
