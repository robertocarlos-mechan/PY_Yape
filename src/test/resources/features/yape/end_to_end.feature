# language: es

Característica: SOLI BCP

  @end_to_end
  Esquema del escenario: Realizar todos los flujos de YAPE
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
    Entonces valido que inicie sesion
    Y ingreso a movimientos
    Y valido que estoy en la opcion movimientos
    Y ingreso a mi saldo y movimientos
    Entonces valido el saldo disponible
    Y regreso a la pantalla anterior
    Y ingreso consultar otras transferencias
    Entonces valido las transferencias a otros bancos
    Y regreso a la pantalla anterior
    Y ingreso consultar retiro dinero
    #Entonces valido el codigo de retiro
    Y regreso a la pantalla anterior
    Y regreso a la pantalla anterior
    Y ingreso a envio a otro soli
    Y doy permiso para ingresar a contactos
    Y valido que estoy en la opcion envio a otro soli
    Y ingreso numero de soli "<celular_soli>"
    Y doy clic al numero a transferir
    Y ingreso el monto "<monto>"
    Y ingreso un comentario
    Y doy clic al boton para transferencia
    Entonces valido que se haya realizado la transferencia
    Y doy clic en Ir a Inicio
    Y valido que inicie sesion
    Y ingreso a envio a otro banco
    Y se valida que estoy en la pantalla Envio otro banco
    Y ingreso al banco "<banco>"
    Y valido que estoy en la pantalla banco "<banco>"
    Y ingreso numero de la cuenta "<numero_cuenta>"
    Y ingreso datos personales del destinatario "<nombres>"
    Y doy clic al boton Continuar
    Y valido que estoy en la pantalla Ingreso Monto
    Y ingreso el monto transferencia a otro banco "<monto>"
    Y ingreso el detalle de transferencia
    Y doy clic al boton Siguiente
    Entonces valido que se haya realizado la transferencia otros bancos
    Y doy clic en volver al inicio otros bancos
    Y valido que inicie sesion
    Y ingreso a la opcion retirar dinero
    Y valido que estoy en la pantalla Retirar Dinero
    Y genero el retiro
    Entonces valido que se haya generado el codigo correctamente
    Y doy clic en volver al inicio
    Y valido que inicie sesion
    Y ingreso a la opcion agregar dinero
    Y valido que estoy en la pantalla Agregar Dinero
    Y doy clic al boton genera tu codigo QR
    Entonces valido que se haya generado mi codigo qr correctamente
    Y regreso a la pantalla anterior
    Y regreso a la pantalla anterior
    Y valido que inicie sesion
    Y ingreso a la opcion generar qr
    Y doy clic al boton cobro por QR
    Entonces valido que se haya generado mi codigo qr correctamente
    Ejemplos:
      | celular    | password |celular_soli  | monto |numero_cuenta  | nombres                     | banco                      |
      | 70621732   | 0001     |70621522      | 0.01  |1051268091     | ENRIQUE DANIEL CASAS RAMOS  | Banco_Fortaleza            |




