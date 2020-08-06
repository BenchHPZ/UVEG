/*Reto 2. Crear mi primera base de datos
1. Datos de identificacion
	- Nombre: 			Benjamin Rivera
	- Matricula: 		19015478
	- Fehca elaboracion:6 de Agosto de 2020
	- Nombre modulo:	Taller de bases de datos v2
	- Nombre asesor:	Araceli González García 
*/


-- 2. Base de datos storepara la empresa Electronic Technologies 
CREATE DATABASE empresa;
 
USE empresa;
 
CREATE TABLE tienda(
 	id 			INT 		 NOT NULL PRIMARY KEY,
 	nombre 		VARCHAR(100) NOT NULL,
 	direccion 	VARCHAR(100) NULL
);
 
CREATE TABLE productos(
 	id 			INT 		NOt NULL PRIMARY KEY,
 	nombre 		VARCHAR(50) NOT NULL,
 	precio 		DOUBLE 		NOT NULL,
 	descripcion VARCHAR(50) NULL
);


-- 3. Tabla customer
CREATE TABLE cliente(
	id 			INT 		NOT NULL PRIMARY KEY,
	nombre 		VARCHAR(50) NOT NULL,
	apellido 	VARCHAR(50) NOT NULL,
	email		VARCHAR(50) NOT NULL,
	password	VARCHAR(50) NOT NULL,
	direccion	VARCHAR(50) NULL,
	telefono	VARCHAR(10) NULL
);


-- 4. Tabla payment_method
CREATE TABLE forma_pago(
	id 			INT 		NOT NULL PRIMARY KEY,
	forma_pago 	VARCHAR(50)	NOT NULL	
);


-- 5. Relaciones entre tablas
ALTER TABLE forma_pago 
	ADD CONSTRAINT compra 
	FOREIGN KEY id_cliente 
	REFERENCES cliente(id);

/*La siguiente linea se agregao para poder generar el
diagrama que se solicita en el Reto.
	Esta sentencia crea un relacion entre tienda y pro_
	ducto mediante la variable id_tienda en la tabla
	producto, una realcion uno a muchos de tienda a
	producto
*/
ALTER TABLE productos
	ADD CONSTRAINT inventario
	FOREIGN KEY id_tienda
	REFERENCES tienda(id);


-- 6. Tabla purchase_order
CREATE TABLE orden_compra(
	id 				INT		NOT NULL PRIMARY KEY,
	id_forma_pago 	INT 	NOT NULL FOREIGN KEY
		REFERENCES forma_pago(id),
	id_cliente		INT 	NOT NULL FOREIGN KEY
		REFERENCES cliente(id)
);


CREATE TABLE detalle_orden_compra(
	id 			INT 		NOT NULL PRIMARY KEY,
	cantidad	INT 		NOT NULL,
	precio_x_unidad DOUBLE	NOT NULL,
	descripcion VARCHAR(150)	NULL,
	id_producto INT 		NOT NULL FOREIGN KEY
		REFERENCES productos(id,
	id_orden_compra INT 	NOT NULL FOREIGN KEY
		REFERENCES orden_compra(id)
);


-- 7. Revisión de estructura
/*
	La estructura resultante del codigo anterior
	puede ser consultado en 
	https://github.com/BenchHPZ/UVEG-IngSisComp/tree/master/TallerDeBasesDeDatos/Actividades/assets/MTBD-U2-R2-1.png
*/