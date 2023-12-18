package co.com.bcp.tasks.yape;

import co.com.bcp.userinterface.yape.TransferenciaYapePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionActividad implements Task {

    public SeleccionActividad() {
        //Task
    }
    public static SeleccionActividad element() {
        return instrumented(SeleccionActividad.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(TransferenciaYapePage.CBX_ACTIVIDAD),
                Click.on(TransferenciaYapePage.SELECT_1));
    }
}
