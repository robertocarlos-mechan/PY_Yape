# language: es

Característica: SOLI BCP

  @retirar_dinero
  Esquema del escenario: Realizar la operacion retirar dinero
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
    Y valido que inicie sesion
    Y ingreso a la opcion retirar dinero
    Y valido que estoy en la pantalla Retirar Dinero
    Y genero el retiro
    Entonces valido que se haya generado el codigo correctamente

    Ejemplos:
      | celular    | password |
      | 70621732   | 0001     |

  @agregar_dinero_por_qr
  Esquema del escenario: Realizar la operacion agregar dinero
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
    Y valido que inicie sesion
    Y ingreso a la opcion agregar dinero
    Y valido que estoy en la pantalla Agregar Dinero
    Y doy clic al boton genera tu codigo QR
    Entonces valido que se haya generado mi codigo qr correctamente
    Ejemplos:
      | celular    | password |
      | 70621732   | 0001     |

  @generar_qr
  Esquema del escenario: Realizar la operacion generacion qr
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
    Y valido que inicie sesion
    Y ingreso a la opcion generar qr
    Y doy clic al boton cobro por QR
    Entonces valido que se haya generado mi codigo qr correctamente

    Ejemplos:
      | celular    | password |
      | 70621732   | 0001     |

  @pago_qr
  Esquema del escenario: Realizar la operacion pago qr
    Dado Ingreso a soli
    Y valido que estoy dentro de soli
    Cuando ingreso opcion ya tengo cuenta
    Y ingreso mi celular "<celular>"
    Y ingreso mi password "<password>"
    Y doy clic al boton ingresar
    Y valido que inicie sesion
    Y ingreso a la opcion generar qr
    Y doy clic al boton pago por QR
    #Y valido que estoy en la pantalla escaneo para pagar
    Y doy permiso para ingresar a video
    Y doy clic en el boton galeria de imagenes
    Y doy permiso para ingresar a camara
    Y doy clic en la imagen qr
    Y doy permiso para abrir la imagen
    Y doy clic en la carpeta download
    Y doy clic en la imagen qr otra vez
    Y valido que se muestre los datos del pago
    Y doy clic en el boton Correcto
    Y valido que estoy en la pantalla Enviar Dinero
    Y ingreso el monto de pago "<monto_pagar>"
    Y doy clic al boton Siguiente
    Entonces se valida el pago de servicio exitoso

    Ejemplos:
      | celular    | password |monto_pagar|
      | 70621732   | 0001     |  0.01     |