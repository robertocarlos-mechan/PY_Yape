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

public class IngresoNumeroCuenta implements Task {

    private final String numero_cuenta;

    public IngresoNumeroCuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }
    public static IngresoNumeroCuenta withTheFollowingFields(String numero_cuenta) {
        return instrumented(IngresoNumeroCuenta.class, numero_cuenta);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(TransferenciaYapePage.TXT_NUMERO_CUENTA, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(TransferenciaYapePage.TXT_NUMERO_CUENTA),
                Enter.theValue(numero_cuenta).into(TransferenciaYapePage.TXT_NUMERO_CUENTA),
                theActorHidesKeyboard());
    }
}
