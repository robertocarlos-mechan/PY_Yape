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

public class CashInOutSteps {

    @Screenshots()
    @Y("ingreso a la opcion retirar dinero")
    public void ingresoALaOpcionRetirarDinero() {
        TESTER.attemptsTo(OpcionRetirarDinero.element());
    }
    @Screenshots()
    @Y("valido que estoy en la pantalla Retirar Dinero")
    public void validoQueEstoyEnLaPantallaRetirarDinero() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_RETIRO), equalTo(true)));
    }
    @Screenshots()
    @Y("genero el retiro")
    public void generoElRetiro() {
        TESTER.attemptsTo(RetiroDinero.element());
    }
    @Screenshots()
    @Entonces("valido que se haya generado el codigo correctamente")
    public void validoQueSeHayaGeneradoElCodigoCorrectamente() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_MENSAJE_RETIRO_DINERO), equalTo(true)));
    }
    @Screenshots()
    @Y("ingreso a la opcion agregar dinero")
    public void ingresoALaOpcionAgregarDinero() {
        TESTER.attemptsTo(OpcionAgregarDinero.element());
    }
    @Screenshots()
    @Y("valido que estoy en la pantalla Agregar Dinero")
    public void validoQueEstoyEnLaPantallaAgregarDinero() {
        TESTER.should(seeThat(IsEnabled.theTarget(BTN_GENERA_CODIGO_QR), equalTo(true)));
    }
    @Screenshots()
    @Y("doy clic al boton genera tu codigo QR")
    public void doyClicAlBotonGeneraTuCodigoQR() {
        TESTER.attemptsTo(OpcionGeneraCodigoQR.element());
    }
    @Screenshots()
    @Y("ingreso a la opcion generar qr")
    public void ingresoALaOpcionGenerarQr() {
        TESTER.attemptsTo(OpcionQR.element());
    }
    @Screenshots()
    @Y("doy clic al boton cobro por QR")
    public void doyClicAlBotonCobroPorQR() {
        TESTER.attemptsTo(OpcionCobroQR.element());
    }
    @Screenshots()
    @Entonces("valido que se haya generado mi codigo qr correctamente")
    public void validoQueSeHayaGeneradoMiCodigoQrCorrectamente() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_PANTALLA_CODIGO_QR), equalTo(true)));
    }
    @Screenshots()
    @Y("doy clic al boton pago por QR")
    public void doyClicAlBotonPagoPorQR() {
        TESTER.attemptsTo(OpcionPagoQR.element());
    }
    @Screenshots()
    @Y("valido que estoy en la pantalla escaneo para pagar")
    public void validoQueEstoyEnLaPantallaEscaneoParaPagar() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_PANTALLA_ESCANEO_PAGO), equalTo(true)));
    }
    @Screenshots()
    @Y("doy clic en el boton galeria de imagenes")
    public void doyClicEnElBotonGaleriaDeImagenes() {
        TESTER.attemptsTo(BotonGaleriaImagenes.element());
    }
    @Screenshots()
    @Y("doy clic en la carpeta download")
    public void doyClicEnLaCarpetaDownload() {
        TESTER.attemptsTo(BotonCarpetaDownload.element());
    }
    @Screenshots()
    @Y("doy clic en la imagen qr")
    public void doyClicEnLaImagenQr() {
        TESTER.attemptsTo(ImagenQR.element());
    }
    @Screenshots()
    @Y("valido que se muestre los datos del pago")
    public void validoQueSeMuestreLosDatosDelPago() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_DATOS_PAGO_QR), equalTo(true)));
    }
    @Screenshots()
    @Y("doy clic en el boton Correcto")
    public void doyClicEnElBotonCorrecto() {
        TESTER.attemptsTo(BotonCorrecto.element());
    }
    @Screenshots()
    @Y("valido que estoy en la pantalla Enviar Dinero")
    public void validoQueEstoyEnLaPantallaEnviarDinero() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_ENVIAR_DINERO), equalTo(true)));
    }
    @Screenshots()
    @Y("doy permiso para ingresar a camara")
    public void doyPermisoParaIngresarACamara() {
        TESTER.attemptsTo(AccesoFotos.element());
    }
    @Screenshots()
    @Y("ingreso el monto de pago {string}")
    public void ingresoElMontoDePago(String monto_pagar) {
        TESTER.attemptsTo(IngresoMontoPagarQR.withTheFollowingFields(monto_pagar));
    }
    @Screenshots()
    @Y("doy permiso para ingresar a video")
    public void doyPermisoParaIngresarAVideo() {
        TESTER.attemptsTo(AccesoVideo.element());
    }
    @Screenshots()
    @Y("doy permiso para abrir la imagen")
    public void doyPermisoParaAbrirLaImagen() {
        TESTER.attemptsTo(AccesoImagenQR.element());
    }
    @Screenshots()
    @Y("doy clic en la imagen qr otra vez")
    public void doyClicEnLaImagenQrOtraVez() {
        TESTER.attemptsTo(ImagenQRV2.element());
    }
    @Screenshots()
    @Y("doy clic en volver al inicio")
    public void doyClicEnVolverAlInicio() {
        TESTER.attemptsTo(BotonVolveraInicio.element());
    }
}
