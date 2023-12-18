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

public class IngresoCodigoCliente implements Task {

    private final String codigo_cliente;

    public IngresoCodigoCliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }
    public static IngresoCodigoCliente withTheFollowingFields(String codigo_cliente) {
        return instrumented(IngresoCodigoCliente.class, codigo_cliente);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(TransferenciaYapePage.TXT_CODIGO_CLIENTE, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(TransferenciaYapePage.TXT_CODIGO_CLIENTE),
                Enter.theValue(codigo_cliente).into(TransferenciaYapePage.TXT_CODIGO_CLIENTE),
                theActorHidesKeyboard());
    }
}
