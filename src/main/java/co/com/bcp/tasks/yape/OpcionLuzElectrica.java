package co.com.bcp.tasks.yape;

import co.com.bcp.userinterface.yape.TransferenciaYapePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpcionLuzElectrica implements Task {

    public OpcionLuzElectrica() {
        //Task
    }
    public static OpcionLuzElectrica element() {
        return instrumented(OpcionLuzElectrica.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(TransferenciaYapePage.BTN_LUZ_ELECTRICA));
    }
}
