package co.com.bcp.steps.yape;

import co.com.bcp.questions.IsEnabled;
import co.com.bcp.tasks.yape.*;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Screenshots;

import static co.com.bcp.steps.conf.Hooks.TESTER;
import static co.com.bcp.userinterface.yape.TransferenciaYapePage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static org.hamcrest.Matchers.equalTo;

public class TransferenciaYapeSteps {
    @Screenshots()
    @Y("ingreso a envio a otro soli")
    public void ingresoAEnvioAOtroSoli() {
        TESTER.attemptsTo(EnvioSoliTransferencia.withTheFollowingFields());
    }
    @Y("valido que estoy en la opcion envio a otro soli")
    public void validoQueEstoyEnLaOpcionEnvioAOtroSoli() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_SELECCIONA_CONTACTO), equalTo(true)));
    }
    @Screenshots()
    @Y("doy permiso para ingresar a contactos")
    public void doyPermisoParaIngresarAContactos() {
        TESTER.attemptsTo(AccesoContactos.element());
    }
    @Screenshots()
    @Y("ingreso numero de soli {string}")
    public void ingresoNumeroDeSoli(String celular_soli) {
        TESTER.attemptsTo(IngresoCelularSoli.withTheFollowingFields(celular_soli));
    }
    @Screenshots()
    @Y("doy clic al numero a transferir")
    public void doyClicAlNumeroATransferir() {
        if (TESTER.asksFor(Visibility.of(LBL_ENVIO_OTRO_SOLI)))
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_ENVIO_OTRO_SOLI), equalTo(true)));
        else {
            TESTER.attemptsTo(CelularTransferir.withTheFollowingFields());
        }
    }
    @Screenshots()
    @Y("ingreso el monto {string}")
    public void ingresoElMonto(String monto) {
        TESTER.attemptsTo(IngresoMonto.withTheFollowingFields(monto));
    }
    @Screenshots()
    @Y("ingreso un comentario")
    public void ingresoUnComentario() {
        TESTER.attemptsTo(IngresoMensajeOpcional.withTheFollowingFields());
    }
    @Screenshots()
    @Y("doy clic al boton para transferencia")
    public void doyClicAlBotonParaTransferencia() {
        TESTER.attemptsTo(EnvioTransferencia.element());
    }
    @Screenshots()
    @Entonces("valido que se haya realizado la transferencia")
    public void validoQueSeHayaRealizadoLaTransferencia() {
            TESTER.attemptsTo(
                    WaitUntil.the(LBL_TRANSFERENCIA_EXITOSA, isEnabled()).forNoMoreThan(200).seconds());
    }
    @Screenshots()
    @Y("ingreso a envio a otro banco")
    public void ingresoAEnvioAOtroBanco() {
        TESTER.attemptsTo(EnvioOtroBanco.withTheFollowingFields());
    }
    @Screenshots()
    @Y("se valida que estoy en la pantalla Envio otro banco")
    public void seValidaQueEstoyEnLaPantallaEnvioOtroBanco() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_ENVIO_OTRO_BANCO), equalTo(true)));
    }
    @Screenshots()
    @Y("ingreso al banco {string}")
    public void ingresoAlBanco(String banco) {
        TESTER.attemptsTo(OpcionBanco.element(banco));
    }
    @Y("valido que estoy en la pantalla banco BNB")
    public void validoQueEstoyEnLaPantallaBancoBNB() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_PANTALLA_BANCO_BNB), equalTo(true)));
    }
    @Screenshots()
    @Y("valido que estoy en la pantalla banco {string}")
    public void validoQueEstoyEnLaPantallaBanco(String banco) {
        if(banco.equals("BNB"))
            TESTER.should(seeThat(IsEnabled.theTarget(LBL_PANTALLA_BANCO_BNB), equalTo(true)));
        if(banco.equals("Banco_Fortaleza"))
            TESTER.should(seeThat(IsEnabled.theTarget(LBL_PANTALLA_BANCO_FORTALEZA), equalTo(true)));
        if(banco.equals("BCP"))
            TESTER.should(seeThat(IsEnabled.theTarget(LBL_PANTALLA_BANCO_BCP), equalTo(true)));
    }
    @Screenshots()
    @Y("ingreso numero de la cuenta {string}")
    public void ingresoNumeroDeLaCuenta(String numero_cuenta) {
        TESTER.attemptsTo(IngresoNumeroCuenta.withTheFollowingFields(numero_cuenta));
    }
    @Screenshots()
    @Y("ingreso datos personales del destinatario {string}")
    public void ingresoDatosPersonalesDelDestinatario(String nombres) {
        TESTER.attemptsTo(IngresoNombreDestinatario.withTheFollowingFields(nombres));
    }
    @Screenshots()
    @Y("doy clic al boton Continuar")
    public void doyClicAlBotonContinuar() {
        TESTER.attemptsTo(BotonContinuar.element());
    }
    @Screenshots()
    @Y("ingreso el detalle de transferencia")
    public void ingresoDetalleDeTransferencia() {
        TESTER.attemptsTo(IngresoDetalleTransferencia.withTheFollowingFields());
    }
    @Screenshots()
    @Y("ingreso el monto transferencia a otro banco {string}")
    public void ingresoElMontoTransferenciaAOtroBanco(String monto) {
        TESTER.attemptsTo(IngresoMontoTransferenciaOtroBanco.withTheFollowingFields(monto));
    }
    @Screenshots()
    @Y("doy clic al boton Siguiente")
    public void doyClicAlBotonSiguiente() {
        TESTER.attemptsTo(BotonSiguiente.element());
    }
    @Screenshots()
    @Y("ingreso a recarga de credito")
    public void ingresoARecargaDeCredito() {
        TESTER.attemptsTo(OpcionRecargaCredito.element());
    }
    @Screenshots()
    @Y("selecciono Entel")
    public void seleccionoEntel() {
        TESTER.attemptsTo(OpcionEntelRecarga.element());
    }
    @Screenshots()
    @Y("valido que estoy dentro de la opcion recarga de credito")
    public void validoQueEstoyDentroDeLaOpcionRecargaDeCredito() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_PANTALLA_RECARGA_CREDITO), equalTo(true)));
    }
    @Screenshots()
    @Y("ingreso numero celular a recargar {string}")
    public void ingresoNumeroCelularARecargar(String numero_celular) {
        TESTER.attemptsTo(IngresoNumeroCelularRecarga.withTheFollowingFields(numero_celular));
    }
    @Screenshots()
    @Y("se ingresa monto a recargar {string}")
    public void seIngresaMontoARecargar(String monto) {
        TESTER.attemptsTo(IngresoMontoRecarga.withTheFollowingFields(monto));
    }
    @Screenshots()
    @Y("doy clic al boton recargar")
    public void doyClicAlBotonRecargar() {
        TESTER.attemptsTo(BotonContinuarRecarga.element());
    }
    @Screenshots()
    @Y("validamos pop-up")
    public void validamosPopUp() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_ACTIVIDAD_ECONOMIA), equalTo(true)));
    }
    @Screenshots()
    @Y("seleccionamos la actividad economica")
    public void seleccionamosLaActividadEconomica() {
        TESTER.attemptsTo(SeleccionActividad.element());
    }
    @Screenshots()
    @Entonces("valido que no haya resultados en la busqueda")
    public void validoQueNoHayaResultadosEnLaBusqueda() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_SIN_RESULTADOS), equalTo(true)));
    }
    @Screenshots()
    @Y("doy clic en Ir a Inicio")
    public void doyClicEnIrAInicio() {
        TESTER.attemptsTo(BotonIrAInicio.element());
    }
    @Screenshots()
    @Y("doy clic en volver al inicio otros bancos")
    public void doyClicEnVolverAlInicioOtrosBancos() {
        TESTER.attemptsTo(BotonIrAInicioOB.element());
    }

    @Entonces("valido que se haya realizado la transferencia otros bancos")
    public void validoQueSeHayaRealizadoLaTransferenciaOtrosBancos() {
        TESTER.attemptsTo(
                WaitUntil.the(LBL_TRANSFERENCIA_EXITOSA_OTROS_BANCOS, isEnabled()).forNoMoreThan(200).seconds());
    }
}
