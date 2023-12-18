package co.com.bcp.tasks.yape;

import co.com.bcp.userinterface.yape.TransferenciaYapePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PantallaTengoCuenta implements Task {

    public PantallaTengoCuenta() {
        //Task
    }
    public static PantallaTengoCuenta withTheFollowingFields() {
        return instrumented(PantallaTengoCuenta.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(TransferenciaYapePage.BTN_TENGO_CUENTA));
    }
}
