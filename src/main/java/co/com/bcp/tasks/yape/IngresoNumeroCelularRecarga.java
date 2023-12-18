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

public class IngresoNumeroCelularRecarga implements Task {

    private final String numero_celular;

    public IngresoNumeroCelularRecarga(String numero_celular) {
        this.numero_celular = numero_celular;
    }
    public static IngresoNumeroCelularRecarga withTheFollowingFields(String numero_celular) {
        return instrumented(IngresoNumeroCelularRecarga.class, numero_celular);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(TransferenciaYapePage.TXT_NUMERO_CELULAR_RECARGA, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(TransferenciaYapePage.TXT_NUMERO_CELULAR_RECARGA),
                Enter.theValue(numero_celular).into(TransferenciaYapePage.TXT_NUMERO_CELULAR_RECARGA),
                theActorHidesKeyboard());
    }
}
