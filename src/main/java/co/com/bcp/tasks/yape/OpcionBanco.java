package co.com.bcp.tasks.yape;

import co.com.bcp.userinterface.yape.TransferenciaYapePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpcionBanco implements Task {

    private final String banco;

    public static IngresoNumeroCelularRecarga withTheFollowingFields(String numero_celular) {
        return instrumented(IngresoNumeroCelularRecarga.class, numero_celular);
    }

    public OpcionBanco(String banco) {
        //Task
        this.banco = banco;
    }
    public static OpcionBanco element(String banco) {
        return instrumented(OpcionBanco.class,banco);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        if (banco.equals("BNB")){
        actor.attemptsTo(
                Click.on(TransferenciaYapePage.BTN_BANCO_BNB));
        }
        if (banco.equals("Banco_Fortaleza")){
            actor.attemptsTo(
                    Click.on(TransferenciaYapePage.BTN_BANCO_FORTALEZA));
        }
        if (banco.equals("BCP")){
            actor.attemptsTo(
                    Click.on(TransferenciaYapePage.BTN_BANCO_BCP));
        }
    }
}
