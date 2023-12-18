package co.com.bcp.tasks.yape;

import co.com.bcp.userinterface.yape.TransferenciaYapePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CloseTransferenciaFallida implements Task {

    public CloseTransferenciaFallida() {
        //Task
    }
    public static CloseTransferenciaFallida element() {
        return instrumented(CloseTransferenciaFallida.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(TransferenciaYapePage.BTN_CLOSE_TRANSFERENCIA_FALLIDA));
    }
}
