#language: es

Característica: Gestión de compra de productos

  Esquema del escenario: Ordenar productos, agregar y eliminar productos del carrito y completar la compra
    Dado que el usuario ha iniciado sesión en la tienda con su usuario  "<usuario>" y contraseña "<contraseña>"
    Cuando ordena los productos por un metodo "<criterioOrden>"
    Y agrega los productos "<primerProducto>" y "<segundoProducto>" al carrito
    Y elimina el producto "<primerProducto>" del carrito
    Y procede a la compra ingresando su información de envío "<nombre>" , "<apellido>" , "<postal>"
    Entonces el sistema debe mostrar un mensaje de confirmación de compra exitoso

    Ejemplos:
      |     usuario   |  contraseña  | criterioOrden | primerProducto | segundoProducto | nombre | apellido | postal |
      | standard_user | secret_sauce | za | Sauce Labs Fleece Jacket | Sauce Labs Onesie | Oscar | Vanegas | 05002 |