package co.com.bcp.steps.yape;

import co.com.bcp.questions.IsEnabled;
import co.com.bcp.steps.conf.SharedComponents;
import co.com.bcp.tasks.yape.*;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.questions.Visibility;
import net.thucydides.core.annotations.Screenshots;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static co.com.bcp.steps.conf.Hooks.TESTER;
import static co.com.bcp.steps.conf.SharedComponents.getDriver;
import static co.com.bcp.userinterface.yape.TransferenciaYapePage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.waits.WaitUntil.the;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ServiciosSteps {

    @Screenshots()
    @Y("doy clic al boton Servicios")
    public void doyClicAlBotonServicios() {
        TESTER.attemptsTo(PantallaServicios.element());
    }
    @Screenshots()
    @Y("valido que estoy en la pantalla servicios")
    public void validoQueEstoyEnLaPantallaServicios() {
        TESTER.attemptsTo(
                the(LBL_SERVICIOS, isEnabled()).forNoMoreThan(100).seconds());
    }
    @Screenshots()
    @Y("doy clic al boton telefonia")
    public void doyClicAlBotonTelefonia() {
        TESTER.attemptsTo(OpcionTelefonia.element());
    }
    @Screenshots()
    @Y("valido que estoy dentro de la opcion telefonia")
    public void validoQueEstoyDentroDeLaOpcionTelefonia() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_OPCION_TELEFONIA), equalTo(true)));
    }
    @Screenshots()
    @Y("doy clic a opcion Entel Prepago")
    public void doyClicAOpcionEntelPrepago() {
        TESTER.attemptsTo(OpcionEntelPrepago.element());
    }
    @Screenshots()
    @Y("valido que estoy dentro de la opcion de pago")
    public void validoQueEstoyDentroDeLaOpcionDePago() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_DATOS_PAGO), equalTo(true)));
    }
    @Screenshots()
    @Y("doy clic al boton busqueda por codigo de celular")
    public void doyClicAlBotonBusquedaPorCodigoDeCelular() {
        //TESTER.attemptsTo(OpcionBusquedaPorCodigoCelular.element());
    }
    @Screenshots()
    @Y("ingreso el codigo de cliente {string}")
    public void ingresoElCodigoDeCliente(String codigo_celular) {
        TESTER.attemptsTo(IngresoCodigoCliente.withTheFollowingFields(codigo_celular));
    }
    @Screenshots()
    @Y("doy clic al boton Buscar")
    public void doyClicAlBotonBuscar() {
        TESTER.attemptsTo(BotonBuscarServicios.element());
    }
    @Screenshots()
    @Y("doy clic al pago a seleccionar")
    public void doyClicAlPagoASeleccionar() {
        TESTER.attemptsTo(
                the(LBL_ELIGE_PAGO, isEnabled()).forNoMoreThan(50).seconds());
        TESTER.attemptsTo(OpcionPagoSeleccionado.element());
    }
    @Screenshots()
    @Y("valido que estoy en la pantalla de Pagos")
    public void validoQueEstoyEnLaPantallaDePagos() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_PAGOS_PENDIENTES), equalTo(true)));
    }
    @Screenshots()
    @Y("doy clic al check de seleccion")
    public void doyClicAlCheckDeSeleccion() {
        TESTER.attemptsTo(CheckSeleccionPago.element());
    }
    @Screenshots()
    @Y("doy clic al boton Pagar")
    public void doyClicAlBotonPagar() {
        TESTER.attemptsTo(PagoServicio.withTheFollowingFields());
    }
    @Screenshots()
    @Y("valido que estoy en la pantalla Ingreso Monto")
    public void validoQueEstoyEnLaPantallaIngresoMonto() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_INGRESO_MONTO), equalTo(true)));
    }
    @Screenshots()
    @Y("ingreso el monto a pagar {string}")
    public void ingresoElMontoAPagar(String monto_pagar) {
        TESTER.attemptsTo(IngresoMontoPagarServicio.withTheFollowingFields(monto_pagar));
    }
    @Screenshots()
    @Y("ingreso el nombre de la factura {string}")
    public void ingresoElNombreDeLaFactura(String nombre_factura) {
        TESTER.attemptsTo(IngresoNombreFactura.withTheFollowingFields(nombre_factura));

        Actions action = new Actions(SharedComponents.getDriver());
        WebElement FROM = getDriver().findElement(By.id("com.bcp.bo.wallet:id/bottomSheetBilling"));
        WebElement TO = getDriver().findElement(By.xpath("//android.widget.TextView[contains(@text,'Correo electrónico')]"));
        action.dragAndDrop(FROM,TO).build().perform();
    }
    @Screenshots()
    @Y("valido que aparezca la clave transaccional")
    public void validoQueAparezcaLaClaveTransaccional() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_CLAVE_TRANSACCIONAL), equalTo(true)));
    }
    @Screenshots()
    @Entonces("se valida el pago de servicio exitoso")
    public void seValidaElPagoDeServicioExitoso() {

        if (TESTER.asksFor(Visibility.of(LBL_COMPROBANTE))){
        TESTER.
                should(seeThat(IsEnabled.theTarget(LBL_COMPROBANTE), equalTo(true)));}
        else{
        TESTER.
                attemptsTo(the(LBL_TRANSFERENCIA_FALLIDA, isEnabled()).forNoMoreThan(50).seconds());
        TESTER.attemptsTo(CloseTransferenciaFallida.element());
        }
    }
    @Screenshots()
    @Y("doy clic al boton luz electrica")
    public void doyClicAlBotonLuzElectrica() {
        TESTER.attemptsTo(OpcionLuzElectrica.element());
    }
    @Screenshots()
    @Y("selecciono la empresa de luz electrica")
    public void seleccionoLaEmpresaDeLuzElectrica() {
        TESTER.attemptsTo(OpcionEndeBeni.element());
    }
    @Screenshots()
    @Y("ingreso el codigo del consumidor {string}")
    public void ingresoElCodigoDelConsumidor(String codigo_consumidor) {
        TESTER.attemptsTo(IngresoCodigoCliente.withTheFollowingFields(codigo_consumidor));
    }
    @Entonces("valido el mensaje de error")
    public void validoElMensajeDeError() {
        TESTER.should(seeThat(IsEnabled.theTarget(LBL_ERROR_SERVICIO_LUZ), equalTo(true)));
    }
}
