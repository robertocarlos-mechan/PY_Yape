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

public class IngresoMonto implements Task {

    private final String monto;

    public IngresoMonto(String monto) {
        this.monto = monto;
    }
    public static IngresoMonto withTheFollowingFields(String monto) {
        return instrumented(IngresoMonto.class, monto);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(TransferenciaYapePage.TXT_MONTO, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(TransferenciaYapePage.TXT_MONTO),
                Enter.theValue(monto).into(TransferenciaYapePage.TXT_MONTO),
                theActorHidesKeyboard());
    }
}
