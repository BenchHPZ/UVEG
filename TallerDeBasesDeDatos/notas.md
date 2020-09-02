# Taller de bases de datos v2

___MTBD___

__Periodo:__ Agosto 2020

__Fecha limite actividades:__ 26/08/2020

__Asesor:__ Araceli González García

Este curso tiene como objetivo general hacer que el estudiante aprenda a manipular las bases de datos considerando la integridad y seguridad de la información. esto bajo los estándares de modelado de sistemas informáticos, para solucionar problemas reales.

El curso estara distribuido en 3 unidades, repartidas en 24 días,  y se requiere una calificación minima de 70 para aprovar.

## Unidad 1.

| Retos | Lecciones | Ponderación |
|---|---|---:|
|  |L1. Sistema de gestor de bases de datos | |
|  |L2. conectar una base de datos | |
|R1 Sistemas gestores de bases de datos (SGBD): análisis|  | 15%|


### Lección 1. Sistema de gestor de bases de datos

Los __Sistema de gestor de bases de datos__, o __(SGBD)__ por sus siglas, es

> una aplicación que funciona como intermediario entre los usuarios y las bases de datos

estas aplicaciones permiten _crear_, _manipular_ y _respaldar_ bases de datos.

<img src="./Actividades/assets/MTBD-U1-L1-1.png" alt="Grafico representativo de SGBD" width="600">

Ejemplo de estas aplicaciones son
 - Microsoft Access
	- Programa utilizado por supermercados

Existen dos tipos de bases de datos, y por lo tanto dos tipos de SGBD para manipular cada uno de ellos, y la diferencia entre estos radica en la manera en que guarda la información, estos tipos son
 - SQL
	- Modelos de datos relacionales
	- Ejemplos
		- MySQL
			- Más usado
			- Bases de datos no muy grandes
		- Oracle 
			- Más usado en ambiente empresarial y el más popular en la actualidad
			- Orientado a _web apps_
		- Postgre SQL
			- Usado por aplicaciones _POO_
			- Grandes volumenes de datos
			- Usado en investigación y estadística
		- SQL Server
			- Usado por la familia _.NET_
			- Soporte exclusivo de Microsoft
 - NoSQL
	- Modelos de datos documentales
	- Ejemplos
		- mongoDB
			- Bases amplias que requieren escalabilidad
			- Usado por Google, Facebook, eBay
		- redis
			- Aplicaciones de almacenamiento en memoria caché y de administración de sesiones
			- Popular en _web apps_, moviles y juegos
		- cassandra
			- Aplicaciones de monitoreo de usuarios y _IoT_
			- Usado por Instagram, Twitter y Netflix


Todas y cada una de estas aplicaciones posee tres funciones básicas sobre las bases de datos
 - Creación y definición
	- Define la estructura, los tipos de datos y realciones entre ellos.
 - Manipulación de datos
	- Realiza consultas, inserciones y manipulación de estos.
 - Acceso controlado
	- Restringe el acceso mediante usuarios.
	
	
### Lección 2. Conectar una base de datos.

Las conexiones a las bases de datos suelen hacerse mediante __API's__, que sirven como filtro e identificador entre el usuario y alguna aplicación web.

<img src="./Actividades/assets/MTBD-U1-L2-1.png" alt="Esquema interaccion API-SGBD" width=600>

En el esquema anterior identificamos el esquema de uso de una base de datos. La __aplicación__ es algúna desarrollada capaz de conectar con una base de datos. La __API__ es la interfaz que permite la interacción entre el _SGBD_ y la _aplicación_. Los __Driver manager__ son aquellos que realizan operaciones en la base de datos; algunos son _ODBC, JDBC, ADO.NET_. Los _controladores (driver)_, son aquellas que tienen una directa interacción con las _SGBD_. Y al final estan las __SGBD__, que estamos estudiando actualmente.

Las __API__ de cada _driver manager_ requieren de parametros especificos para devolver una respuesta acertada. Como por ejemplo
 - ODBC (Open DataBase Conectivity)
	- Requiere los parámetros:
		- Ubicación de la base de datos (IP)
		- Puerto de conexión
		- Ususario
		- Contraseña
		- Base de datos
 - JDBC (Java DataBase Connectivity)
	- Aplicaciones que especificamente usen Java
	- Requiere los parámetros:
		- Ubicación de la base de datos (IP)
		- Usuario
		- Contraseña
		- Base de datos
 - ADO.NET (ActiveX Data Objects.NET)
	- Requiere los parámetros:
		- Ubicación de las base de datos (IP)
		- Usuarios
		- Contrseña
		- Base de datos

Un caso especial de las conexiones se da con los dispositivos moviles. Como la mayoría de sus aplicaciones estan programadas en _Java_ se suele utilizar _JDBC_, y por lo tanto se requieren los parámetros antes mencionados.

### Reto 1. 

Saludos profesora

Esta es mi confirmación de lectura de su mensaje de bienvenida. Y mi __Reto 1__.

Mi nombre es Benjamín Rivera, tengo 22 años y soy de Guanajauto. Mi pasatiempo favorito es leer. Espero adquirir habilidades prácticas en este m[odulo.

Algunos lugares donde se utilizan las bases de datos son:

 - En las paginas web, como en <https://datos.gob.mx/>,  donde se publica información abierta para que todos puedan utilizarla en distintos proyectos.
 - En hospitales, a pesar de que no todos lo implementan, existen hospitales que llevan un registro electrónico de los pacientes que estan en el edificio.
 - En las escuelas, la mayoría de las escuelas ya cuentan con bases de datos de sus alumnos que permiten hacer consultas de calificaciones y contactos de emergencia.
 
 
| Nombre del SGBD | Ventajas | Desventajas | Conclusiones personales |
|---:|---|---|---|
| Db2     | <ul><li>Soporta tanto bases relacionales, como las NoSQL</li><li>Corre en Linux, Windows y Unix-like</li><li>Respaldado por IBM</li><li>Facil integración con otros SGDB </li></ul> | <ul><li>No es software libre</li><li>Software de pago por uso</li></ul> | Parece ser un sfotware maravilloso, facilmente escalable y adaptable a distintos lenguajes de programación y adapatativo a la aqruitectura; adempas esta respaldado por una compañia muy importante como IBM. La única desventaja es que es un software privativo, aunque es de esperarse con todas las caracteristicas que tiene |
| OrientDB| <ul><li>Open Source</li><li>Escrito en Java</li><li>Soporta bases de datos con estructura de grafos, documentos, relacionales y orientada a obejtos</li></ul> | <ul><li>Escrito en Java</li><li>Soporte poco eficiente</li></ul> | Primero que nada, JAVA, yo en lo personal tengo una relación complicada con este lenguaje de programación, lo puse e ventajas porque casi todas las maquinas tiene instalado JAVA, lo que implica portabilidad; por otro lado, Java no me parece el lenguaje más espectacular, pero eso es bastante personal. Además, este SGDB de software libre, como la mayoría de ellos, carece de un buen soporte, esto implica que los bugs tardan ens ser arreglados y no hay certesa de cuando dejara de estar el proyecto en mantenimiento. |

#### Fuentes de información

 - S/D. (2020). _Introducción al sistema gestor de base de datos (SGBD)_. 2 de agosto de 2020, de IONOS Sitio web: <https://www.ionos.mx/digitalguide/hosting/cuestiones-tecnicas/sistema-gestor-de-base-de-datos-sgbd/>
 

## Unidad 2.

| Retos | Lecciones | Ponderación |
|---|---|---:|
|  |L3. Definir y crear una base de datos | |
|[R2. Crear mi primera base de datos](./Actividades/Rivera_Benjamin_TBD_R2_U2.sql) |  | 12%|
|  |L4. Manipular la información de una base de datos | |
|  |L5. Ordenar y agrupar la información de una base de datos | |
|[R.3 Manipular la información de una base de datos](./Actividades/Rivera_Benjamin_TBD_R3_U2.sql) |  | 25%|

### Lección 3. Definir y crear una base de datos

Dfiniremos a 

> __DDl__ es el lenguaje que se utiliza para modificar la estructura, o esqueleto, donde se almacenará los datos en la base de datos; incluyendo el tipo de datos a guardar

Es importante recordar que todas las sentencias de __DDL__ deben terminar con __;__ y que todas las instrucciones van con mayusculas. Para crear, modificar o eliminar dichas estructuras se utilizan sentencias como:
 - Crear o modificar
	- `CREATE`
 - Modificar estructuras existentes
	- `ALTER`
 - Eliminar estructura de base de datos
	- `DROP`
 - Eliminar registros y espacioes de resgistros en base de datos
	- `TRUNCATE`
 - Crear un esquema; que es un coonjunto de tablas
	- `CREATE SCHEMA nombre`
	
Además, en las bases de datos debemos especificar el tipo de datos a guardar, ejemplis de estos son:
 - VARCHAR
	- Equivalente a _string_ en otros lados
 - INT
	- Almacena números enteros
 - DOUBLE
	- Almacena números decimales
	
Un ejemplo donde se crea y usa un a tabla podria ser el siguiente

```sql
 CREATE DATABASE empresa;
 
 USE empresa;
 
 CREATE TABLE sucursal(
	id INT NOT NULL PRIMARY KEY,
	nombre VARCHAR(100) NOT NULL,
	direccion VARCHAR(100) NULL
 );
 
 CREATE TABLE productos;
```

si quisieramos eliminar la tabla creada anteriormente usariamos la sentencia

```sql
 DROP TABLE sucursal;
```

y para eliminar la base de datos seria

```sql
 DROP DATABASE empresa;
```

No es posible cambiar el nombre de una base de datos o talba, actualmente es necesario exportar los datos, eliminar y luego crearala con el nombre deseado, para finalmente importar las tablas exportadas. El _workbench_ de SQL tiene _Wizards_ para realizar estas acciones facilmente.

Sin embargo si es posible agregar o eliminar propiedades especificas de las tablas, como para agregar una propiedad en la tabla se puede usar

```sql
 ALTER TABLE tabla ADD nueva_propiedad TIPO DE DATO;
```

y para eliminarla se puede usar

```sql
 ALTER TABLE tabla DROP COLUMN propiedad_existente;
```

Recordando el curso de __Fundamentos de Bases de Datos__, el manejo de llaves primarias(__PRIMARY KEY__) nos permite generar relaciones entre tablas, como por ejemplo:
 - Relación uno a muchos
	- Donde el registro de una tabla se liga a más de una externa y las externas únicamente se ralacionan de regreso
 - Relación muchos a mcuhos
	- Cuando un registro esta ligado con varios de otra tabla y, además, el registro de otra tabla tiene varios de la inicial.
 - Relación uno a uno
	- Cuando un registro esta ligado únicamente aalguno de otra tabla, y viceversa.
	
Para generar estas relaciones entre tablas es necesario agregar restriccinones, estas se concen como `CONSTRAINS`, y estan ligados con `FOREIGN KEY`, que son claves primarias de otras tablas. Para agregar una de estas columnas se podria usar el siguiente codigo

```sql
 ALTER TABLE tabla 
 ADD CONSTRAINT nombre_restruccion 
 FOREIGN KEY nombre_propiedad_local REFERENCES 
 nombre_tabla_externa(nombre_propiedad_externa);
```
 
	
#### Caso de practico

Se requiere crear una base de datos para una compañia que vende productos, tiene tres sucursales y planea abrir más. Debe cumplir con
 - Posibilidad de registrar sucursales por separado
 - Productos de cada sucursal
 - Contar con registro de clientes
 - Forma de pago de cada cliente
 - Almacenar compras por cliente
 
Para poder solucionar esto podemos crear una base de datos _empresa_, donde crearemos una tabla por cada sucrusal, por producto

```sql

 CREATE DATABASE empresa;
 
 USE empresa;
 
 CREATE TABLE sucursal(
	id INT NOT NULL PRIMARY KEY,
	nombre VARCHAR(100) NOT NULL,
	direccion VARCHAR(100) NULL
 );
 
 CREATE TABLE product(
	id INT NOt NULL PRIMARY KEY,
	nombre VARCHAR(50) NOT NULL,
	precio DOUBLE NOT NULL,
	descripcion VARCHAR(50) NULL
 );
 
 ALTER TABLE producto ADD id_sucursal INT NOT NULL;
```
### Leccion 4. Manipular informacion de una base de datos

Para hacer manipulación de datos, es necesario utilizar el __DML__ (Lenguaje de Manipulación de Datos), y es el que se encarga de manipular los daatos de una base de datos, las acciones que puede realizar son:
 - __Agregar__, para agregar un registro a una tabla
	+ `SELECT`
 - __Editar__, para modificar un registro en una tabla
	+ `UPDATE`
 - __Eliminar__, para eliminar el registro de una tabla
	+ `DELETE` 
 - __Consultar__, para obtener los registros de una tabla
	+ `SELECT` 

> Es importante recordar que un __registro__ corresponde a una fila, o renglon, de alguna _Tabla_.

siempre hay que tener en cuenta lo anterior, ya que cuando se quiera agregar un _registro_ a la tabla hay que proporcionar valores para todas las columnas de la tabla. Para insertar un registro en alguna tabla se debe seguir la sintaxis
```sql
INSERT INTO nombre_tabla (campo_a, campo_b, campo_c, ...) VALUES (valor_a, valor_b, valor_c, ...)
```

De manera similar, para la actualizacion de los registros, se sigue la sintaxis
```sql
 UPDATE nombre_tabla 
 SET campo_a=valor_a, campo_b=valor_b, ... 
 WHERE condicion;
```
en la sintaxis anterior, no siempre es necesario poner la condicion, sin embargo, es __altamente recomendable__, ya que de no ponerla se actualizarian los valores de todas las entradas. Y por ultimo para _eliminar_ un registro se debe seguir la siguiente sintaxis
```sql
 DELETE FROM nombre_tabla 
 WHERE condicion;
```
al igual que el caso anterior, la condicion no es necesaria; pero en caso de no ponerla ___todos los datos___ de la tabla seran afectados por la sentencia.

Unicamente fata verificar la consulta, en este caso es bueno utilizar la sintaxis 
```sql
 SELECT * FROM nombre_tabla 
 WHERE condicion; 
```
en caso de que se quiera obtener todos los campos de la tabla, si solo se quieren obtener algunos, se puede utilizar
```sql
 SELECT (campo_a, campo_b, ...) FROM nombre_tabla 
 WHERE condicion;
```
;es bueno recurdar que la condicion no es necesaria, pero nos ayuda a filtrar los resultados que realmente queremos.

Por ultimo, para aquellos momentos en los que olvidemos la condicion en un `DELETE` o `UPDATE` existe forma de recuperar los datos, un __backup__; para poder hacerlos y recuperarlos el __Worckbench de MySQL__ pose un _wizard_ para esto, aunque tambien se pueden utilizar con gestores externos de versiones, como __git__.


#### Caso practico

Entonces, para agregar las tiendas seguiremos con las siguientes instrucciones

```sql
 INSERT INTO tienda (id, nombre, direccion) VALUES 
	(459, 'Electronic Technologies North', 'Blvd. Lopez Mateos #459');
 INSERT INTO tienda (id, nombre, direccion) VALUES
	(346, 'Electronic Technologies Central', 'Av Insurgentes #346');
 INSERT INTO tienda (id, nombre, direccion) VALUES
	(549, 'Electronic Technologies East', 'Blvd. Madero #549');
```
y para agregar en productos, se puede usar
```sql
 INSERT INTO productos (id, nombre, precio, descripcion, id_tienda)
  VALUES (301, 
	 'Computadora de escritorio - Todo en Uno',
	 15499.00,
	 'Todo lo necesario para este regreso a clases',
	 549);

 INSERT INTO productos (id, nombre, precio, descripcion, id_tienda)
  VALUES (305, 
	'Celular ET - 15a',
	3599.00,
	'Ideal para el trabajo',
	549);

 INSERT INTO productos (id, nombre, precio, descripcion, id_tienda)
  VALUES (310, 
	'Laptop - Quinta generacion',
	9099.00,
	'Economico pero duradero, simplemente lo mejor del anio',
	549);
```
luego con las modificaciones solicitadas es necesario usar
```sql
 UPDATE productos SET 
	descripcion= 'Todo lo que busca en una computadora de escritorio',
	WHEN id=301;

 UPDATE productos SET
	nombre= 'Celular ET2019 - 19xs',
	descripcion= 'Ideal para el trabajo y la escuela',
	WHEN id= 305;

 UPDATE productos SET
	precio = 9999.00
	WHEN id= 310;
```
Por ultimo, la empresa solicito una eliminacion, para poder realizarla una opcion es utilizar la oracion
```sql
 DELETE FROM productos WHERE id= 305;
```

### Leccion 5. Lección 5. Ordenar y agrupar la información de una base de datos.

Y, como ya es costumbre en estas lecciones, es necesario usar un lenguaje especifico para ordenar la informacion, en este caso usamos el __DML__ que ya describimos anteriormente. En esta leccion agregamos la palabra `ORDER BY` que puede ir con las opciones `ASC` ó `DESC` y lleva la sintaxis

```sql
 SELECT * 
 FROM nombre_tabla 
 ORDER BY campo 'ASC|DSC';
```
podemos cambiar `*` por campos especificos y dembemos seleccionar unicamente uno respecto al orden.

Ademas tambien nos podria intersar restringir los registros obtenidos por una busqueda con `SELECT`
```sql
 SELECT * 
 FROM nombre_tabla 
 LIMIT numero_registros;
```
o si queremos que inicie en alguno registro en especifico se puede usar
```sql
 SELECT * FROM nombre_tabla 
 LIMIT (registro_inicial, registro_final);
```

Los ultimos parametros tambien se pueden suar para la busqueda de datos. Tambien podemos agrupaar los datos recibidos por `SELECT`, para hacer eso se usa la sintaxis
```sql
 SELECT * 
 FROM nombre_tabla 
 GROUP BY campo_a, campo_b, ...
```

se puede cambiar `*` por campos especifcos como `campo_a, campo_b, ...`. Y por ultimo, despues de hacer una llamada a `SELECT`, se puede contar la cantidad de respuestas recibidas mediante `COUNT`, su sintaxis es

```sql
 SELECT propiedad, COUNT(*) FROM nombre_tabla 
 GROUP BY propiedad;
```

Otra forma imporante para hacer relaciones entre las tablas se da con las __Uniones__, estas funcionan como las operaciones entre conjuntos en matematicas. Tenemos 
 - __Inner Join__, comparable con $A \and B$, por lo que tomas las coincidencias en las entradas entre $A$ y $B$. 
	+ Su sintaxis 
```sql
 SELECT * FROM nombre_tabla_A 
 INNER JOIN nombre_tabla_B ON condicion;
```
 - __Left Join__, hara un _or_ de la segunda tabla contra la primera
	+ Sentencia
```sql
 SELECT * FROM nombre_tabla_A 
 LEFT JOIN nombre_tabla_B ON condicion;
```
 - __Right Join__, lo opuesto a la _Left Join_
	+ Sentencia
```sql
 SELECt * FROM nombre_tabla_A 
 RIGHT JOIN nombre_tabla_B ON condicion;
```
en todas las opciones anteriores puede cambiarse `*` por las propiedades especificas `campo_a, campo_b, ...` con las que se quiera trabajar.

Y por si no fuera suficiente, todas estas consultas se pueden anidar para conseguir datos especificos de multiples tablas y consultas, como por ejemplo
```sql
 SELECT * FROM nombre_tabla_A WHERE campo_a= (
		SELECT campo_a FROM nombre_tabla_B
	);
```
aqui estamos haciendo una consulta condicionada a los resultados de otroa consulta. Es bueno notar que en este caso `tabla_A` y `tabla_B` pueden ser las mismas, y como ya hemos dicho bastante, `*` puede ser sustituido por propiedades especificas.

Para poder aprecira toas estas maneras que tenemos de hacer consultas existen las __VISTAS__, que son visualizaciones de los resultados que obtenemos de las consultas. Para crear una vista debemos usar la sintaxis
```sql
  CREATE VIEW nombre_vista AS 
  SELECT * FROM nombre_talba;
```
Estas vistas no se pueden modificar como las tablas, son estaticas.


#### Caso practico

Primero necesitamos agregar los productos
```sql
 INSERT INTO productos (id, nombre, precio, descripcion, id_tienda)
  VALUES (611, 
	'Horno tostador',
	1499.00,
	'Horno tostador de 4 rebanadas, acero inoxidable',
	346);

 INSERT INTO productos (id, nombre, precio, descripcion, id_tienda)
  VALUES (512, 
	'Freidora con temporizador',
	1590.00,
	'Puede cocinar cualquier alimento, desde paaps fritas hasta verduras y mucho mas',
	346);

 INSERT INTO productos (id, nombre, precio, descripcion, id_tienda)
  VALUES (815, 
	'Batidora',
	999.00,
	'5 velocidades, color rojo',
	346);

 INSERT INTO productos (id, nombre, precio, descripcion, id_tienda)
  VALUES (531, 
	'Fuente chocolate',
	789.00,
	'Piezas desmontables',
	346);

 INSERT INTO productos (id, nombre, precio, descripcion, id_tienda)
  VALUES (912, 
	'Maquina de palomitas de maiz',
	830.00,
	'Ocupa aceite caliente',
	346);

 INSERT INTO productos (id, nombre, precio, descripcion, id_tienda)
  VALUES (412, 
	'Sandwichera',
	459.00,
	'Desayuno color gris',
	346);

 INSERT INTO productos (id, nombre, precio, descripcion, id_tienda)
  VALUES (317, 
	'Pantalla TV 50"',
	8890.00,
	'Tamanio n" x m"',
	459);

 INSERT INTO productos (id, nombre, precio, descripcion, id_tienda)
  VALUES (679, 
	'Camara seguridad',
	1497.00,
	'Incluye soporte 24/7',
	459);

 INSERT INTO productos (id, nombre, precio, descripcion, id_tienda)
  VALUES (923, 
	'Soporte TV',
	279.00,
	'Adaptable y hasta 50kg',
	459);

 INSERT INTO productos (id, nombre, precio, descripcion, id_tienda)
  VALUES (873, 
	'Laptop',
	15499.00,
	'SSD 256, RAM 8GB',
	459);

 INSERT INTO productos (id, nombre, precio, descripcion, id_tienda)
  VALUES (682, 
	'Coche GPS',
	1299.00,
	'Tactil, bluethoot, no DVD',
	459);
```
y luego para ordenarlas podemos usar
```sql
 SELECT * FROM productos ORDER BY price ASC;
```

### Reto 3

__Comentarios importantes__

Sintaxis especial:
```sql
 ALTER TABLE detalle_orden_compra
 ADD nombre_producto VARCHAR (100) NOT NULL;

 ALTER TABLE nombre_tabla
 DROP COLUMN nombre_propiedad;

 SELECT store_id, COUNT(*) FROM product
 GROUP BY store_id;

 SELECT * FROM product
 LIMIT 3, 5;

 UPDATE purchase_order_detail
 SET amount = 2
 WHERE id = 24;

 CREATE ROLE 'user';
```


## Unidad 3.

| Retos | Lecciones | Ponderación |
|---|---|---:|
|  |L6. Seguridad en la base de datos | |
|R4. Roles y permisos sobre una base de datos |  | 12%|
|  |L7. Transacción con las bases de datos | |
|R5. TRansacciones e integridad de la información |  | 12%|
|  |L8. Procedimiento en las bases de datos |  |
|  |Autoevaluación | 5%|
|R6. Procedimientos y tareas sobre una base de datos |  | 19%|

### Lección 6. Seguridad en la base de datos

Dado que estas estrucutras pueden guardar información sensible, es importante considerar la seguridad de los datos. Una buena practica, y bastante común, es no crear usuarios con acceso total a los privilegios; lo recomendable es crear usuarios especificos para cada tarea que se requiera, y eliminarlos en cuanto dejen de ser necesarios.

En _MySQL_ existen los siguientes tipos de usuario
 - __root__, Aquellos con acceso total.
 - _los demas_, Aquellos que tienen limitaciones en las acciones de la _base de datos_

todos los usuarios son guardados en la tabla `mysql.user`, y para verificar aquellos existentes unicamente es necesario realizar una consulta a estos
```sql
 SELECT user FROM mysql.user;
```

Por cuestiones de seguridad, cuando los usuarios son creados, no tienen permisos, por lo que hay que asignarselos. Para hacer esto primero hay que crear el usuario
```sql
 CREATE USER nombre_usuario@nombre_host IDENTIFIED BY contraseña
```
a los usuarios se les puede cambiar la contraseña con
```sql
 ALTER USER nombre_usuario@nombre_host IDENTIFIED BY nueva_contraseña;
```
luego, antes de asignar los permisos, es importante cononcer cuales son los que se pueden asignar
 - `CREATE`, permite crear tablas y bases de datos.
 - `SELECT`, permite obtener lso registros de las tablas.
 - `UPDATE`, permite actualizar los registros de las tablas.
 - `DELETE`, permite eliminar registros de las tablas.
 - `DROP`, permite eliminat registros, tablas y bases de datos.
 - `ALL PRIVILEGES`, otorga el nivel de __root__ al usuario.
además, cada uno de los permisos anteriroes se pueden asignar a distintos niveles
 - `Global`, este privilegio tiene acceso total sin restricciones.
 - `De base de datos`, otroga permisos sobre una _base de datos_.
 - `De tabla`, otorga permisos y control sobre una _tabla_.
 - `De columna`, otroga acceso a una _columna_ previamente definida sobre una _tabla_.
 - `De rutina`, otorga permisos a únicamente a rutinas previamente establecidas.

Ahora si, para darle permisos a algun usuario se usa 
```sql
 GRANT permiso ON base_datos.nombre_tabla TO nombre_usuario@nombre_host;
```
y para remover el permiso
```sql
 REVOKE permiso ON base_datos.nombre_tabla FROM nombre_usuario@nombre_host;
```

En el caso de que queramos ver los permisos asignados a algun usuario podemos usar
```sql
 SHOW GRANTS FOR nombre_usuario@nombre_host;
```
es bueno recordar hacer una recarga despues de cada actualizacion con
```sql
 FLUSH PRIVILEGES;
```

De manera estandar, __MySQL__ tiene roles creados; los roles son un grupo de privilegios identificados con un nombre. Se puede agregar o liminar privilegios a un rol en cualquier momento. Por default __MySQL__ cuenta ciertos roles predefinidos
 - __DBA__, incluye todos los permisos.
 - __MaintenanceAdmin__, permisos para el mantenimiento del servidor.
 - __ProcessAdmin__, permisos para evaluar, supervisar y eliminar procesos de usuarios.
 - __UserAdmin__, permisos para crear incisos de sesiones y restablecer contraseñas.
 - __SecurityAdmin__, permisos para administrar inicios de sesion y otorgar y revocar privilegios.
 - __MonitorAdmin__, permisos minimos para poder supervisar el servidor.
 - __DBManager__, permisos para hacer modificacione en todas las bases de datos.
 - __DBDesigner__, permisos para crear y hacer ingieneria inversa en todas las bases de datos.
 - __ReplicationAdmin__, permisos para configurar y administrar la replicacion.
 - __BackupAdmin__, permisos minimos para realizar copias de seguridad de cualquier base de datos.

Para crear roles se usa la sentencia
```sql
CREATE ROLE nombre_rol_a, nombre_rol_b, ...;
```
y para enlistar los permisos que otorga el rol es 
```sql
SHOW GRANTS FOR nombre_rol;
```
luego, para agregar y eliminar permisos a un rol debemos usar
```sql
GRANT permiso ON base_datos.nombre_tabla TO nombre_rol;
REVOKE permiso ON base_datos.nombre_tabla FROM nombrel_rol;
```
y para agregar y quitar usuarios
```sql
GRANT nombre_rol TO nombre_usuario@nombre_host;
REVOKE nombre_rol FROM nombre_usuario@nombre_host;
```

Para activar los roles se puede usar
```sql
SET DEFAULT ROLE ALL TO nombre_usuario@nombre_host;
```
esto solo se debe hacer al inicio de la sesion.


### L7. Transacción con las bases de datos

En __SQL__ definiremos

> Una __transaccion__ como un bloque de sentencias __SQL__ que se ejecutan como una sola, estas se deben ejecutar en serie.

Para las transacciones se definen 
 - __Atomicidad__ Aseguran que las transacciones no se ejecuten incompletas.
 - __Consitencia__ Asegura la coherencia durante la transaccion.
 - __Aislamiento__ Garantiza que se puedan ejecutar varias transacciones simultaneamente.
 - __Durabilidad__ Garantiza el almacenamiento seguro de los datos.

Además de lo anterior, es imporante notar que

> los __Motores de almacenamiento__ son los encargados de almacenar, gestionar y recuperar los datos guardados en las tablas.

para llamarlos podemos usar la sentencia
```sql
SHOW ENGINES;
```
en el caso de __MySQL__, el motor de almacenamiento por defecto es __InnoDB__, en caso de que quisieramos cambiarlo, en una tabla nueva, podriamos utilizar
```sql
CREATE TABLE nombre_tabla(
campos ...
) ENGINE=motor_de_almacenamiento
```
si quisieramos alterar el de una tabla nueva
```sql
ALTER TABLE nombre_tabla
ENGINE = motor_de_almacenamiento;
```
Algunos ejemplos de _motores de almacenamiento_ son
 - ___InnoDB___
   + Soporta transacciones
   + No bloquea durante `SELECT`
   + Maximo de 1000 columnas
   + No permite indices `FULLTEXT`
   + Maximo de _64Tb_ por tabla
 - ___MyISAM___
   + Maximo de 16 cols por indice
   + No soporta transacciones
   + Permite almacenar hasta 256 Tb oir tabla
 - ___MEMORY___
   + Permite indices hash
   + No soporta transacciones
   + No soporta `BLOB` y `TEXT`
   + Puede ocurrir una perdida de datos facilmente
 - ___ARCHIVE___
   + No soporta transacciones
   + Compresion de datos
   + Solo permite sentencias `INSERT` y `SELECT`
 - ___CSV___
   + No soporta transacciones ni indexacion
   + Incluye soporte para importar y exportar datos

Los pasos para realizar una transaccion son
 1. Comenzar transaccion con sentencias `BEGIN` y `START TRANSACTION`
 2. Escribir las sentenciaas a ejecutar; `INSERT`, `DELETE`, `UPDATE`, ...
 3. Ejecutar sentencia `COMMIT` para completar la transaccion (todos los cambios seran permanentes)
 4. Ejecutar sentencia `ROLLBACK` para revertir si se desea

De manera que la sentencia de transaccion quedaria
```sql
BEGIN
Sentencias a ejecutar
COMMIT;
--- En caso de ser necesario
ROLLBACK;
```
las trnscciones son secuenciales. 

### Lección 8. Procedimientos en las bases de datos

Siguiendo con los metods preestablecidos, definimos
> A un __Procedimiento Almacenado__, o _Stored Procedure_, a un conjunto de instruccinoes escritas en __SQL__ que se puden guardar y reutilizar

Estos procedimientos ayudan a 
 - Realizar una tarea en especifico 
 - Mejorar la legibilidad del codigo 
 - Cuidar la integridad de los datos
 - Mejorar el rendimiento de tareas complejas y no tan complejas

tienen como _caracteristicas principales_
 - Permitir enviar parametros,
 - pueden ser recursivas,
 - se almacenan en la base de datos y que
 - se ejecutan en el servidor (o SGBD en su defecto).

y con todo esto, nos ofrecen _ventajas_ como
 - Reducir el trafico de red,
 - limitar el acceso a las tablas mediante el uso de procedimientos almacenados,
 - aumentar el rendimiento de la aplicacion y
 - la capacidad de ser reutilizadas.

aunque como nada es perfecto, tambien implica _desventajas_, como
 - Sturacion del servidor si se usan indiscriminadamente,
 - generan vulnerabilidades si estan mal programadas y 
 - se complica depurar un procedimiento almacenado.

y todo esto lo tenemos disponible desde la __version 5.0__ de __MySQL__. Para poder trabajar con estos procedimientos almacenados usamos las sentencias
```sql
--Para crear
DELIMITER //
CREATE PROCEDURE nombre_procedimiento (
	type var_a type_data,
	type var_b type_data,
	...
)
BEGIN
	sentencias
END //

--mostrar status de
SHOW PROCEDURE STATUS LIKE 'nombre_procedimiento';

--alterar
ALTER PROCEDURE nombre_procedimiento
nombre_caracteristicas valor_caracteristica;

--y eliminar
DROP PROCEDURE nombre_procedimiento;
--procesos
```

Durante la creacion se pueden utilizar parametros de tipo
 - `OUT` Es el tipo que requieren tener las variables que seran regresadas depues de la ejecucion.
 - `IN` Es el tipo asignado por defecto, y se usa para transferir argumentos.
 - `INOUT` Este es la union de los dos anteriores.

Para complementar a los procedimientos, estan los __Disparadores (triggers)__, que son procedimientos asociados a una tabla y se ejecutan (antes o despues) de cualquier consulta `CRUD` sobre esta. La sintaxis para crear uno es 
```sql 
CREATE TRIGGER nombre_disparador [BEFORE | AFTER]
[INSERT | SELECT | UPDATE | DELETE] ON nombre_tabla;
```

Es importante notar que desde la version __5.5 de MySQL__ no se permite alterar los disparadores. Para eliminarlos podemos usar
```sql
DROP TRIGGER nombre_disparador;
```




