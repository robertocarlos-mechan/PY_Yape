package co.com.bcp.steps.yape;

import co.com.bcp.questions.IsEnabled;
import co.com.bcp.tasks.yape.*;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Screenshots;

import static co.com.bcp.steps.conf.Hooks.TESTER;
import static co.com.bcp.userinterface.yape.TransferenciaYapePage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class AjustesSteps {

    @Screenshots()
    @Y("doy clic al boton Mas")
    public void doyClicAlBotonMas() {
        TESTER.attemptsTo(OpcionAjustes.element());
    }
    @Screenshots()
    @Y("valido que estoy en la opcion ajustes")
    public void validoQueEstoyEnLaOpcionAjustes() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_AJUSTES), equalTo(true)));
    }
    @Screenshots()
    @Y("doy clic a la opcion cambiar pin")
    public void doyClicALaOpcionCambiarPin() {
        TESTER.attemptsTo(OpcionCambiarPin.element());
    }
    @Screenshots()
    @Y("ingreso pin actual {string}")
    public void ingresoPinActual(String pin_actual) {
        TESTER.attemptsTo(IngresoPinActual.withTheFollowingFields(pin_actual));
    }
    @Screenshots()
    @Y("ingreso nuevo pin {string}")
    public void ingresoNuevoPin(String pin_new) {
        TESTER.attemptsTo(IngresoPinNuevo.withTheFollowingFields(pin_new));
    }
    @Screenshots()
    @Y("confirmo nuevo pin {string}")
    public void confirmoNuevoPin(String pin_new) {
        TESTER.attemptsTo(IngresoConfirmaPinNuevo.withTheFollowingFields(pin_new));
    }
    @Screenshots()
    @Y("doy clic a cambio de pin")
    public void doyClicACambioDePin() {
        TESTER.attemptsTo(CambioPin.element());
    }
    @Screenshots()
    @Entonces("se valida el cambio de pin exitoso")
    public void seValidaElCambioDePinExitoso() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_CAMBIO_PIN_EXITOSO), equalTo(true)));
    }
    @Screenshots()
    @Y("doy clic al boton Salir")
    public void doyClicAlBotonSalir() {
        TESTER.attemptsTo(BotonSalir.element());
    }
}
