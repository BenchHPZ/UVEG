/*Reto 5. Transacciones e integridad de la información de una base de datos
1. Datos de identificacion
	- Nombre: 			Benjamin Rivera
	- Matricula: 		19015478
	- Fehca elaboracion:18 de Agosto de 2020
	- Nombre modulo:	Taller de bases de datos v2
	- Nombre asesor:	Araceli González García 
*/

--2. Iniciar una transaccion
--3. Obtén los datos de un cliente de la tabla customer con el id = 548.
--4. Obtén la forma de pago del mismo cliente de la tabla payment_method.
--5. Realiza un registro en la tabla purchase_order con los siguiente valores.
--6. Obtén el registro identificado con el id 266 elaborado previamenteenla tabla purchase_order,solo para comprobar que los datos se insertaron correctamente.
--7. Obtén los datos de un producto identificado con el id 317 de la tabla produc
--8. Genera un error
--9. Usar ROLLBACK para deshacer los cambios
--10. Verifica 266 ya no existe
--11. Corrige el nuevo registro
--12.

BEGIN

 SELECT * FROM customer WHERE id = 548;
 SELECT forma_pago FROM forma_pago WHERE id_cliente = 548;

 INSERT INTO orden_compra 
 	(id, id_forma_pago, id_cliente)
 	VALUES (266, 185, 548);
 SELECT * FROM orden_compra WHERE id = 266;

 SELECT * FROM productos WHERE id = 317;

 INSERT INTO detalle_orden_compra
 	(id, cantidad, precio_x_unidad, descripcion, id_producto, id_orden_compra)
 	VALUES (167, 5, 8890, "Tamanio de pantalla mxn", 555, 266)

ROLLBACK
 
 INSERT INTO detalle_orden_compra
 	(id, cantidad, precio_x_unidad, descripcion, id_producto, id_orden_compra)
 	VALUES (167, 5, 8890, "Tamanio de pantalla mxn", 317, 266)

COMMIT;

 


