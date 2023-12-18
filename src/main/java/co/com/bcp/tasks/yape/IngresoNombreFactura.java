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

public class IngresoNombreFactura implements Task {

    private final String nombre_factura;

    public IngresoNombreFactura(String nombre_factura) {
        this.nombre_factura = nombre_factura;
    }
    public static IngresoNombreFactura withTheFollowingFields(String nombre_factura) {
        return instrumented(IngresoNombreFactura.class, nombre_factura);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(TransferenciaYapePage.BTN_EDITAR),
                WaitUntil.the(TransferenciaYapePage.TXT_NOMBRE_FACTURA, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(TransferenciaYapePage.TXT_NOMBRE_FACTURA),
                Enter.theValue(nombre_factura).into(TransferenciaYapePage.TXT_NOMBRE_FACTURA),
                theActorHidesKeyboard());
    }
}
