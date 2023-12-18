package co.com.bcp.tasks.yape;

import co.com.bcp.userinterface.yape.TransferenciaYapePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CelularTransferir implements Task {

    public CelularTransferir() {
        //Task
    }
    public static CelularTransferir withTheFollowingFields() {
        return instrumented(CelularTransferir.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(TransferenciaYapePage.SELECT_PERSONA_SOLI));
    }
}
