# language: es

Característica: SOLI BCP

  @pago_servicio_entel_01
  Esquema del escenario: Realizar el pago de servicio ENTEL
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
    Y valido que inicie sesion
    Y doy clic al boton Servicios
    Y valido que estoy en la pantalla servicios
    Y doy clic al boton telefonia
    Y valido que estoy dentro de la opcion telefonia
    Y doy clic a opcion Entel Prepago
    Y valido que estoy dentro de la opcion de pago
    Y doy clic al boton busqueda por codigo de celular
    Y ingreso el codigo de cliente "<codigo_celular>"
    Y doy clic al boton Buscar
    Y doy clic al pago a seleccionar
    Y valido que estoy en la pantalla de Pagos
    Y doy clic al check de seleccion
    Y doy clic al boton Pagar
    Y valido que estoy en la pantalla Ingreso Monto
    Y ingreso el monto a pagar "<monto_pagar>"
    Y ingreso el nombre de la factura "<nombre_factura>"
    Y doy clic al boton Pagar
    Y valido que aparezca la clave transaccional
    Y doy clic al boton Pagar
    Entonces se valida el pago de servicio exitoso

    Ejemplos:
      | celular    | password |codigo_celular |monto_pagar |nombre_factura |
      | 70621732   | 0001     |71361687       |5.00        |Roberto Mechan |

  @pago_servicio_luz_02
  Esquema del escenario: Realizar el pago de servicio LUZ ELECTRICA
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
    Y valido que inicie sesion
    Y doy clic al boton Servicios
    Y valido que estoy en la pantalla servicios
    Y doy clic al boton luz electrica
    Y selecciono la empresa de luz electrica
    Y valido que estoy dentro de la opcion de pago
    Y ingreso el codigo del consumidor "<codigo_consumidor>"
    Y doy clic al boton Buscar
    Y doy clic al pago a seleccionar
    Y valido que estoy en la pantalla de Pagos
    Y doy clic al check de seleccion
    Y doy clic al boton Pagar
    Y valido que estoy en la pantalla Ingreso Monto
    Y doy clic al boton Pagar
    Y valido que aparezca la clave transaccional
    Y doy clic al boton Pagar
    Entonces se valida el pago de servicio exitoso

    Ejemplos:
      | celular    | password | codigo_consumidor |
      | 70621732   | 0001     | 0006              |

  @pago_servicio_luz_03
  Esquema del escenario: Realizar el pago de servicio LUZ ELECTRICA
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
    Y valido que inicie sesion
    Y doy clic al boton Servicios
    Y valido que estoy en la pantalla servicios
    Y doy clic al boton luz electrica
    Y selecciono la empresa de luz electrica
    Y valido que estoy dentro de la opcion de pago
    Y ingreso el codigo del consumidor "<codigo_consumidor>"
    Y doy clic al boton Buscar
    Entonces valido el mensaje de error

    Ejemplos:
      | celular    | password | codigo_consumidor |
      | 70621732   | 1234     | aaaa              |