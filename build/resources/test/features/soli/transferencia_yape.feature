# language: es

Característica: SOLI BCP

  @envio_otro_yape_01
  Esquema del escenario: Realizar el envio a otros yape
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
    Y valido que inicie sesion
    Y ingreso a envio a otro soli
    Y doy permiso para ingresar a contactos
    Y valido que estoy en la opcion envio a otro soli
    Y ingreso numero de soli "<celular_soli>"
    Y doy clic al numero a transferir
    Y ingreso el monto "<monto>"
    Y ingreso un comentario
    Y doy clic al boton para transferencia
    Entonces valido que se haya realizado la transferencia
    Ejemplos:
      | celular    | password |celular_soli | monto |
      | 70621732   | 0001     |70621522     | 0.01  |

  @envio_otro_banco_02
  Esquema del escenario: Realizar el envio a otro BANCO
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
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
    #    Y doy clic al boton Siguiente
    #    Y validamos pop-up
    #    Y seleccionamos la actividad economica
    Y doy clic al boton Siguiente
    Entonces valido que se haya realizado la transferencia otros bancos
    Ejemplos:
      | celular    | password |numero_cuenta  | nombres                     | banco                      | monto |
      | 70621732   | 0001     |1051268091     | ENRIQUE DANIEL CASAS RAMOS  | Banco_Fortaleza            | 0.01  |

  @envio_banco_bcp_03
  Esquema del escenario: Realizar el envio a Banco BCP
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
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
    #    Y doy clic al boton Siguiente
    #    Y validamos pop-up
    #    Y seleccionamos la actividad economica
    Y doy clic al boton Siguiente
    Entonces valido que se haya realizado la transferencia otros bancos
    Ejemplos:
      | celular    | password |numero_cuenta    | nombres            | banco   | monto |
      | 70621732   | 0001     |20150092139302   | PRUEBA NUDVO NUEVO | BCP     | 0.01  |

  @recarga_credito_04
  Esquema del escenario: Realizar la recarga de credito
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
    Y valido que inicie sesion
    Y ingreso a recarga de credito
    Y selecciono Entel
    Y valido que estoy dentro de la opcion recarga de credito
    Y ingreso numero celular a recargar "<numero_celular>"
    Y se ingresa monto a recargar "<monto>"
    Y doy clic al boton recargar
    #Entonces valido que se haya realizado la transferencia
    Ejemplos:
      | celular    | password |numero_celular | monto |
      | 70621732   | 0001     |71361687       | 5.00  |

  @envio_otro_yape_05
  Esquema del escenario: Validar el numero de yape exista
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
    Y valido que inicie sesion
    Y ingreso a envio a otro soli
    Y doy permiso para ingresar a contactos
    Y valido que estoy en la opcion envio a otro soli
    Y ingreso numero de soli "<celular_soli>"
    Entonces valido que no haya resultados en la busqueda
    Ejemplos:
      | celular    | password |celular_soli |
      | 70621732   | 0001     |90621522     |

