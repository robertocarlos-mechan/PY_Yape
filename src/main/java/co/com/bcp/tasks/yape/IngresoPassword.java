package co.com.bcp.tasks.yape;

import co.com.bcp.userinterface.yape.TransferenciaYapePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresoPassword implements Task {

    private final String password;

    public IngresoPassword(String password) {
        //Task
        this.password = password;
    }
    public static IngresoPassword withTheFollowingFields(String password) {
        return instrumented(IngresoPassword.class,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                        Enter.theValue(password.substring(0,1)).into(TransferenciaYapePage.TXT_PIN1),
                        Enter.theValue(password.substring(1,2)).into(TransferenciaYapePage.TXT_PIN2),
                        Enter.theValue(password.substring(2,3)).into(TransferenciaYapePage.TXT_PIN3),
                        Enter.theValue(password.substring(3,4)).into(TransferenciaYapePage.TXT_PIN4))
                ;
    }
}
