/*Reto 4. Crear mi primera base de datos
1. Datos de identificacion
	- Nombre: 			Benjamin Rivera
	- Matricula: 		19015478
	- Fehca elaboracion:18 de Agosto de 2020
	- Nombre modulo:	Taller de bases de datos v2
	- Nombre asesor:	Araceli González García 
*/

--2. Definir lo siguientes roles sobre la base de datos _role_
/*	admin_store_role ALL PRIVILEGES
	read_Store_role  SELECT
	write_store_role SELECT, INSERT
*/ 

CREATE DATABASE tienda;
USE tienda;

CREATE TABLE tienda(
 	id 			INT 		 NOT NULL PRIMARY KEY,
 	nombre 		VARCHAR(100) NOT NULL,
 	direccion 	VARCHAR(100) NULL
);

-- agregaremos los roles ala base de datos tienda

CREATE ROLE rol_tienda_admin,
			rol_tienda_read,
			rol_tienda_write;


GRANT ALL PRIVILEGES ON tienda.tienda TO rol_tienda_admin;
GRANT SELECT ON tienda.tienda TO rol_tienda_read;
GRANT UPDATE ON tienda.tienda TO rol_tienda_write;


--3. Crear cuentas de usuario

CREATE USER 'admin'@'localhost' 		IDENTIFIED BY "adm2020";
CREATE USER 'arturo_torres'@'localhost' IDENTIFIED BY "arturoZXC123";
CREATE USER 'jose_ibarra'@'localhost' 	IDENTIFIED BY "josestoredb";
CREATE USER 'andrea_rodriguez'@'localhost' IDENTIFIED BY "1989";

SET DEFAULT ROLE ALL TO 'admin'@'localhost';
SET DEFAULT ROLE ALL TO 'arturo_torres'@'localhost';
SET DEFAULT ROLE ALL TO 'jose_ibarra'@'localhost';
SET DEFAULT ROLE ALL TO 'andrea_rodriguez'@'localhost';

GRANT rol_tienda_admin TO 'admin'@'localhost';
GRANT rol_tienda_read TO 'arturo_torres'@'localhost';
GRANT rol_tienda_write TO 'jose_ibarra'@'localhost';
GRANT rol_tienda_write TO 'andrea_rodriguez'@'localhost';


--4. Eliminar permiso SELECT de rol_tienda_write

REVOKE SELECT ON tienda.tienda TO rol_tienda_write;