package co.com.bcp.tasks.yape;

import co.com.bcp.userinterface.yape.TransferenciaYapePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpcionBusquedaPorCodigoCelular implements Task {

    public OpcionBusquedaPorCodigoCelular() {
        //Task
    }
    public static OpcionBusquedaPorCodigoCelular element() {
        return instrumented(OpcionBusquedaPorCodigoCelular.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(TransferenciaYapePage.BTN_BUSQUEDA_CODIGO_CELULAR));
    }
}
