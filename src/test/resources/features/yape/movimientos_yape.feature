# language: es

Característica: SOLI BCP

  @saldo_movimientos
  Esquema del escenario: Realizar la consulta de ultimos movimientos
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
    Y valido que inicie sesion
    Y ingreso a movimientos
    Y valido que estoy en la opcion movimientos
    Y ingreso a mi saldo y movimientos
    Entonces valido el saldo disponible
    Ejemplos:
      | celular    | password |
      | 70621732   | 0001     |

  @transferencias_otros_bancos
  Esquema del escenario: Realizar consulta transferencias a otros bancos
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
    Y valido que inicie sesion
    Y ingreso a movimientos
    Y valido que estoy en la opcion movimientos
    Y ingreso consultar otras transferencias
    Entonces valido las transferencias a otros bancos
    Ejemplos:
      | celular    | password |
      | 70621732   | 0001     |

  @consulta_retiro_dinero
  Esquema del escenario: Realizar consula retiro de dinero
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
    Y valido que inicie sesion
    Y ingreso a movimientos
    Y valido que estoy en la opcion movimientos
    Y ingreso consultar retiro dinero
    Entonces valido el codigo de retiro
    Ejemplos:
      | celular    | password |
      | 70621732   | 0001     |
