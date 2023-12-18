package co.com.bcp.tasks.yape;

import co.com.bcp.userinterface.yape.TransferenciaYapePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnvioOtroBanco implements Task {

    public EnvioOtroBanco() {
        //Task
    }
    public static EnvioOtroBanco withTheFollowingFields() {
        return instrumented(EnvioOtroBanco.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(TransferenciaYapePage.BTN_ENVIO_OTRO_BANCO));
    }
}
