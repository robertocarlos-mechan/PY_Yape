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

public class IngresoMontoPagarQR implements Task {

    private final String monto_pagar;

    public IngresoMontoPagarQR(String monto_pagar) {
        this.monto_pagar = monto_pagar;
    }
    public static IngresoMontoPagarQR withTheFollowingFields(String monto_pagar) {
        return instrumented(IngresoMontoPagarQR.class, monto_pagar);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(TransferenciaYapePage.TXT_MONTO_PAGO_QR, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(TransferenciaYapePage.TXT_MONTO_PAGO_QR),
                Enter.theValue(monto_pagar).into(TransferenciaYapePage.TXT_MONTO_PAGO_QR),
                theActorHidesKeyboard());
    }
}
