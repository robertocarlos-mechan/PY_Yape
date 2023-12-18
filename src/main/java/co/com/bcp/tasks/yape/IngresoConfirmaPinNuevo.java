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

public class IngresoConfirmaPinNuevo implements Task {

    private final String pin_new;

    public IngresoConfirmaPinNuevo(String pin_new) {
        this.pin_new = pin_new;
    }
    public static IngresoConfirmaPinNuevo withTheFollowingFields(String pin_new) {
        return instrumented(IngresoConfirmaPinNuevo.class, pin_new);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(TransferenciaYapePage.TXT_CONFIRMA_PIN, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(TransferenciaYapePage.TXT_CONFIRMA_PIN),
                Enter.theValue(pin_new).into(TransferenciaYapePage.TXT_CONFIRMA_PIN),
                theActorHidesKeyboard());
    }
}
