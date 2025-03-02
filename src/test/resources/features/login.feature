#language: es

Característica: inicio de sesión en Swag Labs

  Esquema del escenario: login fallido usuario bloqueado
    Dado un usuario se encuentra en la pagina inicial de swaglabs
    Cuando el usuario ingresa una username "<username>" y un password "<password>"
    Entonces el sistema debe mostrar un mensage de error

    Ejemplos:
      |     username     |  password      |
      |locked_out_user   |  secret_sauce  |