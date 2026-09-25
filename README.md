# EjercicioArreglo_Ventas

Este codigo se basa en un arreglo bidimensional, el cual se centra en almacenar, buscar, eliminar y visualizar las ventas que se producen a lo largo de un año o los 12 meses dentro de tres departamentos, que son Ropa, Deportes y Jugueteria. 
El codigo incluye 4 metódos:
1 - Registrar venta: Este método permite ingresar una nueva venta específica. Recibe como parámetros el mes, el departamento y el monto de la venta; además de hacer  una validación para revisar si el mes esté en el rango correcto (1-12) y que el departamento sea válido (0-2). Por ultimo, calcula el índice para la matriz (ajustando el mes a base 0) y guarda el monto en la posición establecida en la matriz.
2- Buscar venta: Es similar al anterior, en este método permite consultar el monto de una venta específica, recibiendo como parámetros el mes y el departamento y validar si son correctas, accediendo a la matriz para hallar el monto que esta guardado en esa posición y mostrando cual es su valor.
3- Eliminar venta: Se centra en reemplazar el monto que se encuentra en la posición ingresada, reescribiéndola por 0.0 y así indicando que no hay venta registrada.
4- Imprimir talbla: Fue agregado como extra para poder visulizar la tabla. En este metodo se centra en mostrar las ventas registrada en forma de tabla, utilizando ciclos for para recorrer cada mes y cada departamento de la matriz, ademas de contar con un formato de salida para lograr presentarse en forma de tabla.
