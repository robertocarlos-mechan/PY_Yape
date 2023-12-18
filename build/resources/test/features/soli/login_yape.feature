# language: es

Característica: YAPE BCP

  @login_yape_01
  Esquema del escenario: Realizar el logueo de usuario ya existente
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
    Entonces valido que inicie sesion
    Ejemplos:
      | celular    | password |
      | 70621732   | 0001     |

  @login_yape_02
  Esquema del escenario: Validar que usuario sea correcto
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
    Entonces valido el mensaje cliente no identificado
    Ejemplos:
      | celular    | password |
      | 80621732   | 0000     |

  @login_yape_03
  Esquema del escenario: Validar que el pin de usuario sea correcto
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
    Entonces valido el mensaje usuario o pin sea invalido
    Ejemplos:
      | celular    | password |
      | 70621732   | 4321     |