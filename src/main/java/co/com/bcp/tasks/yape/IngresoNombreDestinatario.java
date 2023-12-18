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

public class IngresoNombreDestinatario implements Task {

    private final String nombres;

    public IngresoNombreDestinatario(String nombres) {
        this.nombres = nombres;
    }
    public static IngresoNombreDestinatario withTheFollowingFields(String nombres) {
        return instrumented(IngresoNombreDestinatario.class, nombres);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(TransferenciaYapePage.TXT_NOMBRE_DESTINATARIO, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(TransferenciaYapePage.TXT_NOMBRE_DESTINATARIO),
                Enter.theValue(nombres).into(TransferenciaYapePage.TXT_NOMBRE_DESTINATARIO),
                theActorHidesKeyboard());
    }
}
