package co.com.bcp.tasks.yape;

import co.com.bcp.userinterface.yape.TransferenciaYapePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpcionAgregarDinero implements Task {

    public OpcionAgregarDinero() {
        //Task
    }
    public static OpcionAgregarDinero element() {
        return instrumented(OpcionAgregarDinero.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(TransferenciaYapePage.BTN_AGREGAR_DINERO));
    }
}
