package co.com.bcp.userinterface.yape;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class TransferenciaYapePage {
    public static Target BTN_CREAR_CUENTA = Target.the("Ingreso Onboarding")
            .located(By.id("com.bcp.bo.wallet:id/buttonCreate"));
    public static Target BTN_TENGO_CUENTA = Target.the("Ingreso a loguearme")
            .located(By.id("com.bcp.bo.wallet:id/buttonLogin"));
    public static Target TXT_CELULAR = Target.the("Ingreso celular")
            .located(By.id("com.bcp.bo.wallet:id/textCelular"));
    public static Target TXT_PIN1 = Target.the("Ingreso pin1")
            .located(By.id("com.bcp.bo.wallet:id/editTextPin1"));
    public static Target TXT_PIN2 = Target.the("Ingreso pin2")
            .located(By.id("com.bcp.bo.wallet:id/editTextPin2"));
    public static Target TXT_PIN3 = Target.the("Ingreso pin3")
            .located(By.id("com.bcp.bo.wallet:id/editTextPin3"));
    public static Target TXT_PIN4 = Target.the("Ingreso pin4")
            .located(By.id("com.bcp.bo.wallet:id/editTextPin4"));
    public static Target BTN_LOGIN = Target.the("Boton de Logueo Usuario")
            .located(By.id("com.bcp.bo.wallet:id/buttonLogin"));
    public static Target LBL_SALDO = Target.the("Valido inicio sesion")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Saldo')]"));
    public static Target LBL_CONSULTAS = Target.the("Valido inicio sesion")
            .located(By.id("com.bcp.bo.wallet:id/textView_contacts_results"));
    public static Target BTN_OPCION_MOVIMIENTOS = Target.the("Ingreso a opcion Movimientos")
            .located(By.xpath("//android.widget.FrameLayout[@content-desc=\"Movimientos\"]/android.widget.ImageView"));
    public static Target LBL_MOVIMIENTOS = Target.the("Valido inicio sesion")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Movimientos')]"));
    public static Target BTN_CONSULTA_SALDOS_MOVIMIENTOS = Target.the("Boton Saldo y Movimientos")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Mi Saldo y Movimientos')]"));
    public static Target LBL_SALDO_DISPONIBLE = Target.the("Boton Saldo y Movimientos")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Saldo disponible')]"));
    public static Target BTN_ENVIO_SOLI = Target.the("Boton Envio a Otro soli")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Enviar a\n" +
                    "otro Yape')]"));
    public static Target LBL_SELECCIONA_CONTACTO = Target.the("Pantalla Envio a Otro Soli")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Selecciona un contacto')]"));
    public static Target TXT_CELULAR_SOLI = Target.the("Ingreso numero celular soli")
            .located(By.id("com.bcp.bo.wallet:id/search_src_text"));
    public static Target LBL_ENVIO_OTRO_SOLI = Target.the("Pantalla Envio a Otro Soli")
            .located(By.id("com.bcp.bo.wallet:id/textView_no_results"));
    public static Target SELECT_PERSONA_SOLI = Target.the("Persona a Enviar Soli")
            .located(By.id("com.bcp.bo.wallet:id/textViewAction"));
    public static Target BTN_ACCESO_CONTACTOS = Target.the("Boton Permiso acceso contactos")
            .located(By.id("com.android.permissioncontroller:id/permission_allow_button"));
    public static Target TXT_MONTO = Target.the("Envio monto")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.EditText"));
    public static Target BTN_ENVIO_TRANSFERENCIA = Target.the("Boton Enviar")
            .located(By.id("com.bcp.bo.wallet:id/buttonExecute"));
    public static Target LBL_TRANSFERENCIA_EXITOSA = Target.the("Transferencia Exitosa")
            .located(By.xpath("//android.widget.TextView[contains(@text,'¡Así de fácil!')]"));
    public static Target LBL_TRANSFERENCIA_EXITOSA_OTROS_BANCOS = Target.the("Transferencia Exitosa")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Comprobante')]"));
    public static Target TXT_OPCIONAL = Target.the("Optional")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"));
    public static Target BTN_REGRESO = Target.the("Optional")
            .located(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
    public static Target BTN_CONSULTA_TRANSFERENCIA_OTROS_SOLI = Target.the("Consulta Transferencia Otros Soli")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Mis transferencias a otros Bancos')]"));
    public static Target BTN_CONSULTA_RETIRO_DINERO = Target.the("Consulta Retiro Diner")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Retiro de dinero')]"));
    public static Target BTN_MAS_OPCIONES = Target.the("Mas Opciones")
            .located(By.id("com.bcp.bo.wallet:id/actionMore"));
    public static Target LBL_AJUSTES = Target.the("Mas Opciones")
            .located(By.id("com.bcp.bo.wallet:id/textViewToolbar"));
    public static Target BTN_CAMBIAR_PIN = Target.the("Opcion cambio de PIN")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Cambiar PIN')]"));
    public static Target TXT_PIN_ACTUAL = Target.the("Ingreso PIN Actual")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText"));
    public static Target TXT_NUEVO_PIN = Target.the("Ingreso Nuevo PIN")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.EditText"));
    public static Target TXT_CONFIRMA_PIN = Target.the("Ingreso confirmacion nuevo PIN")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.EditText"));
    public static Target BTN_CAMBIO_PIN = Target.the("Cambio el PIN")
            .located(By.id("com.bcp.bo.wallet:id/buttonChange"));
    public static Target LBL_CAMBIO_PIN_EXITOSO = Target.the("Mensaje de cambio de PIN")
            .located(By.id("com.bcp.bo.wallet:id/textViewTitle"));
    public static Target BTN_SERVICIOS = Target.the("Clic al boton Servicios")
            .located(By.id("com.bcp.bo.wallet:id/actionServices"));
    public static Target LBL_SERVICIOS = Target.the("Pantalla Servicios")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Escoge el rubro')]"));
    public static Target BTN_TELEFONIA = Target.the("Opcion Telefonia")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.GridView/android.widget.LinearLayout[11]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ImageView"));
    public static Target LBL_OPCION_TELEFONIA = Target.the("Elige una empresa telefonica")
            .located(By.xpath(" //android.widget.TextView[contains(@text,'Elige una empresa')]"));
    public static Target BTN_ENTEL_PREPAGO = Target.the("Selecciono Entel Prepago")
            .located(By.xpath("//android.widget.TextView[contains(@text,'ENTEL PREPAGO')]"));
    public static Target LBL_DATOS_PAGO = Target.the("Datos del pago")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Datos del pago')]"));
    public static Target BTN_BUSQUEDA_CODIGO_CELULAR = Target.the("Opcion por codigo cliente")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[1]/android.widget.RelativeLayout[3]/android.widget.Button"));
    public static Target TXT_CODIGO_CLIENTE = Target.the("Ingreso codigo cliente")
            .located(By.className("android.widget.EditText"));
    public static Target BTN_BUSCAR_SERVICIO = Target.the("Buscar codigo cliente ")
            .located(By.id("com.bcp.bo.wallet:id/buttonSearch"));
    public static Target LBL_ELIGE_PAGO = Target.the("Elegir pago")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Elige un pago')]"));
    public static Target BTN_PAGO_SELECCIONADO = Target.the("Ir al pago")
            .located(By.id("com.bcp.bo.wallet:id/textViewDescription"));
    public static Target LBL_PAGOS_PENDIENTES = Target.the("Pagos pendientes")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Pagos pendientes')]"));
    public static Target CHECK_PAGO_SELECCIONADO = Target.the("Selecciono el pago")
            .located(By.id("com.bcp.bo.wallet:id/checkboxSelect"));
    public static Target BTN_CLOSE_TRANSFERENCIA_FALLIDA = Target.the("Selecciono el pago")
            .located(By.id("com.bcp.bo.wallet:id/button_Close\n"));
    public static Target LBL_TRANSFERENCIA_FALLIDA = Target.the("Selecciono el pago")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Transferencia Fallida')]"));
    public static Target BTN_PAGAR_SERVICIO = Target.the("Pagar el servicio")
            .located(By.id("com.bcp.bo.wallet:id/buttonPay"));
    public static Target LBL_INGRESO_MONTO = Target.the("Ingresar el monto")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Ingresa el monto')]"));
    public static Target BTN_OTRO = Target.the("Clic Otro")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Otro')]"));
    public static Target TXT_MONTO_SERVICIO = Target.the("Ingreso monto servicio")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.EditText"));
    public static Target BTN_EDITAR = Target.the("Editar factura")
            .located(By.id("com.bcp.bo.wallet:id/buttonEditBilling"));
    public static Target TXT_NOMBRE_FACTURA = Target.the("Ingreso Nombre Factura")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
    public static Target LBL_CLAVE_TRANSACCIONAL = Target.the("Valido clave transaccional")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Clave transaccional')]"));
    public static Target LBL_ERROR = Target.the("Ocurrio un error")
            .located(By.xpath("com.bcp.bo.wallet:id/textView_Error"));
    public static Target LBL_COMPROBANTE = Target.the("Ocurrio un error")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Comprobante')]"));
    public static Target BTN_LUZ_ELECTRICA = Target.the("Selecciono Luz Electrica")
            .located(By.xpath("//android.widget.TextView[contains(@text,'LUZ ELÉCTRICA')]"));
    public static Target BTN_ENDE_BENI = Target.the("Selecciono ENDE BENI")
            .located(By.xpath("//android.widget.TextView[contains(@text,'ENDE BENI')]"));
    public static Target BTN_ENVIO_OTRO_BANCO = Target.the("Envio Otro banco")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Enviar a\n" +
                    "otro banco')]"));
    public static Target LBL_ENVIO_OTRO_BANCO = Target.the("Pantalla Envio Otro Banco")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Enviar dinero')]"));
    public static Target BTN_BANCO_BNB = Target.the("Opcion Banco BNB")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Banco Nacional De Bolivia')]"));
    public static Target BTN_BANCO_FORTALEZA = Target.the("Opcion Banco Fortaleza")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.GridView/android.widget.FrameLayout[14]/androidx.appcompat.widget.LinearLayoutCompat"));
    public static Target BTN_BANCO_BCP = Target.the("Opcion Banco BCP")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.GridView/android.widget.FrameLayout[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ImageView"));
    public static Target LBL_PANTALLA_BANCO_BNB = Target.the("Pantalla Banco BNB")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Banco Nacional De Bolivia')]"));
    public static Target LBL_PANTALLA_BANCO_FORTALEZA = Target.the("Pantalla Banco Fortaleza")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Banco Fortaleza S.a.')]"));
    public static Target LBL_PANTALLA_BANCO_BCP = Target.the("Pantalla Banco Banco De Crédito De Bolivia")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Banco De Crédito De Bolivia')]"));
    public static Target TXT_NUMERO_CUENTA = Target.the("Ingreso numero de cuenta")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
    public static Target TXT_NOMBRE_DESTINATARIO = Target.the("Ingreso nombres del destinatario")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
    public static Target BTN_CONTINUAR= Target.the("Clic al boton continuar")
            .located(By.id("com.bcp.bo.wallet:id/buttonNext"));
    public static Target TXT_MONTO_OTRO_BANCO = Target.the("Ingreso Monto Otro Banco")
            .located(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
    public static Target TXT_DETALLE_TRANSFERENCIA = Target.the("Ingreso Detalle transferencia")
            .located(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText"));
    public static Target BTN_RECARGA_CREDITO = Target.the("Opcion recarga credito")
            .located(By.xpath("(//android.widget.ImageView[@content-desc=\"Agent\"])[1]"));
    public static Target BTN_ENTEL_RECARGA = Target.the("Selecciono Entel Recarga")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Entel')]"));
    public static Target LBL_PANTALLA_RECARGA_CREDITO = Target.the("Pantalla Recarga Credito")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Complementa')]"));
    public static Target TXT_NUMERO_CELULAR_RECARGA = Target.the("Ingreso numero de celular a recargar")
            .located(By.id("com.bcp.bo.wallet:id/editTextTelephoneAccount"));
    public static Target TXT_MONTO_RECARGA = Target.the("Ingreso monto a recargar")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"));
    public static Target BTN_CONTINUAR_RECARGA = Target.the("Continuar Recarga")
            .located(By.id("com.bcp.bo.wallet:id/buttonRecharge"));
    public static Target BTN_RETIRO_DINERO = Target.the("Retirar Dinero")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Retirar dinero')]"));
    public static Target LBL_RETIRO = Target.the("Pantalla Retiro dinero")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Retiro')]"));
    public static Target BTN_GENERAR_RETIRO = Target.the("Genero Retiro")
            .located(By.id("com.bcp.bo.wallet:id/buttonGenerate"));
    public static Target LBL_MENSAJE_RETIRO_DINERO = Target.the("Mensaje codigo generado")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Código generado exitosamente')]"));
    public static Target BTN_AGREGAR_DINERO = Target.the("Agregar Dinero")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Agregar dinero')]"));
    public static Target LBL_PANTALLA_CODIGO_QR = Target.the("Codigo QR generado correctamente")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Escanea este QR')]"));
    public static Target BTN_GENERA_CODIGO_QR = Target.the("Pantalla Agregar Dinero")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Genera tu código QR')]"));
    public static Target BTN_QR = Target.the("Opcion QR")
            .located(By.id("com.bcp.bo.wallet:id/floatingActionButtonQR"));
    public static Target BTN_COBRAR_QR = Target.the("Opcion cobro por QR")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Cobrar')]"));
    public static Target BTN_PAGAR_QR = Target.the("Opcion pago por QR")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Pagar')]"));
    public static Target LBL_PANTALLA_ESCANEO_PAGO = Target.the("Pantalla escanea para pagar")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Escanea para pagar')]"));
    public static Target BTN_GALERIA_IMAGENES = Target.the("Boton Galeria Imagenes")
            .located(By.xpath("(//android.widget.ImageView[@content-desc=\"Yape\"])[2]"));
    public static Target BTN_CARPETA_DOWNLOAD = Target.the("Carpeta download")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Download')]"));
    public static Target BTN_IMAGEN_QR = Target.the("Imagen QR de pago")
            .located(By.xpath("//android.widget.FrameLayout[@content-desc=\"Photo taken on Dec 13, 2023, 3:44:35 PM\"]/androidx.cardview.widget.CardView/android.widget.FrameLayout/android.widget.ImageView"));
    public static Target BTN_IMAGEN_QR_V2 = Target.the("Imagen QR de pago")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"Photo taken on Dec 13, 2023 3:44:35 PM\"]"));
    public static Target LBL_DATOS_PAGO_QR = Target.the("Datos del pago por QR")
            .located(By.xpath("//android.widget.TextView[contains(@text,'La cuenta pertenece a')]"));
    public static Target BTN_CORRECTO = Target.the("Clic al boton Correcto")
            .located(By.id("com.bcp.bo.wallet:id/buttonSuccess"));
    public static Target LBL_ENVIAR_DINERO = Target.the("Pantalla Enviar Dinero")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Enviar dinero')]"));
    public static Target BTN_ACCESO_FOTOS = Target.the("Acceso a Video")
            .located(By.id("com.android.permissioncontroller:id/permission_allow_selected_button"));
    public static Target BTN_ACCESO_VIDEO = Target.the("Acceso a Fotos")
            .located(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
    public static Target TXT_MONTO_PAGO_QR = Target.the("Ingreso el monto de pago por QR")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText"));
    public static Target LBL_TRANSFERENCIAS_OB = Target.the("Pantalla Transferencias OB")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView"));
    public static Target LBL_CODIGO_RETIRO = Target.the("Pantalla Retiro Dinero")
            .located(By.xpath("//android.widget.TextView[contains(@text,'NO EXISTE OTP VIGENTE')]"));
    public static Target BTN_ACCESO_IMAGEN_QR = Target.the("Acceso Imagen QR")
            .located(By.id("com.google.android.providers.media.module:id/button_add"));
    public static Target BTN_SIGUIENTE = Target.the("Boton siguiente")
            .located(By.className("android.widget.Button"));
    public static Target LBL_ACTIVIDAD_ECONOMIA = Target.the("POP UP")
            .located(By.xpath("//android.widget.TextView[contains(@text,'¡Necesitamos conocerte mejor!')]"));
    public static Target CBX_ACTIVIDAD = Target.the("Seleccionar Actividad Economica")
            .located(By.id("com.bcp.bo.wallet:id/textView_Title"));
    public static Target SELECT_1 = Target.the("Seleccionar Actividad Economica")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.TextView"));
    public static Target LBL_USER_INVALIDO = Target.the("Cliente no identificado")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Cliente no identificado')]"));
    public static Target LBL_PIN_INVALIDO = Target.the("PIN invalido")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Usuario o PIN inválido')]"));
    public static Target LBL_ERROR_SERVICIO_LUZ = Target.the("Mensaje de error servicio luz")
            .located(By.id("com.bcp.bo.wallet:id/textView_Error"));
    public static Target LBL_SIN_RESULTADOS = Target.the("No se encontraron resultados")
            .located(By.id("com.bcp.bo.wallet:id/textViewNoResults"));
    public static Target BTN_SALIR = Target.the("SALIR")
            .located(By.id("com.bcp.bo.wallet:id/cardView_PrimaryAction"));
    public static Target BTN_RETURN = Target.the("REGRESAR")
            .located(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
    public static Target BTN_IR_INICIO = Target.the("Ir A Inicio")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Ir a inicio')]"));
    public static Target BTN_VOLVER_INICIO = Target.the("Volver A Inicio")
            .located(By.id("com.bcp.bo.wallet:id/buttonBackHome"));
    public static Target BTN_VOLVER_INICIO_OB = Target.the("Volver A Inicio")
            .located(By.id("com.bcp.bo.wallet:id/button_back_home_transaction"));




    private TransferenciaYapePage() {
        //Nothing
    }
}