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

public class IngresoMontoRecarga implements Task {

    private final String monto_recarga;

    public IngresoMontoRecarga(String monto_recarga) {
        this.monto_recarga = monto_recarga;
    }
    public static IngresoMontoRecarga withTheFollowingFields(String monto_recarga) {
        return instrumented(IngresoMontoRecarga.class, monto_recarga);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(TransferenciaYapePage.TXT_MONTO_RECARGA, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(TransferenciaYapePage.TXT_MONTO_RECARGA),
                Enter.theValue(monto_recarga).into(TransferenciaYapePage.TXT_MONTO_RECARGA),
                theActorHidesKeyboard());
    }
}
