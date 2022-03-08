<h1 align="center">🧬 Proyecto del curso de <br/><b>Curso de Java Spring</b> 💛</h1>

## Instalación de ambiente de desarrollo: Linux Ubuntu

¿Qué vas a necesitar?


Para este curso vas a ocupar cuatro herramientas:

El OpenJDK que ya vimos en la clase pasada y que nos dará todo lo necesario para construir aplicaciones usando Java.

El IDE que usaremos en el curso será IntelliJ IDEA, la versión será la Community Edition que se acomoda sin problemas a nuestras necesidades.

PostgreSQL será la base de datos encargada de gestionar toda la información que será expuesta en la API. Más adelante vamos a configurarla y a configurar un set de datos inicial. Si aún no lo conoces o no manejas bases de datos relacionales, te recomiendo que visites nuestro curso en platzi.com/postgresql.

Postman, es un cliente donde vamos a probar de manera sencilla todos los servicios expuestos de nuestra API antes de publicarla. Si quieres aprender más sobre esta herramienta te recomiendo que te pases por nuestro curso en platzi.com/postman.

Instalación de ambiente de desarrollo en Ubuntu 20.04.1 LTS
Para instalar las herramientas que vamos a utilizar en este curso para el sistema operativo Linux Ubuntu debemos seguir los siguientes pasos:

Java OpenJDK
Abrir la terminal y luego actualizar el índice de paquetes con sudo apt update.

Una vez termine de actualizar debe realizar la instalación de Java OpenJDK con el comando sudo apt install openjdk-11-jdk.

Cuando este proceso termine debes verificar si la instalación del OpenJDK se realizó correctamente, ejecuta el comando java -version y verás lo siguiente en pantalla:

IntelliJ IDEA
Se puede instalar de varias maneras, según sea su caso puedes consultar en la siguiente guía https://www.jetbrains.com/help/idea/installation-guide.html.
Yo lo haré desde Ubuntu Software, la tienda de aplicaciones de Ubuntu. Al abrir esta herramienta se debe realizar la búsqueda de IntelliJ.

Seleccionar la versión Community, que es la versión gratuita y que para nuestras necesidades se ajusta completamente:

Ahora esperamos a que el instalador termine el proceso:


Una vez terminada la instalación aparece con el botón Quitar. Para abrirlo debes ubicar el acceso directo que automáticamente fue creado en la lista de aplicaciones.


PostgreSQL
Lo primero es saber que en el sitio oficial de PostgreSQL para Linux Ubuntu en https://www.postgresql.org/download/linux/ubuntu/ están las especificaciones para la instalación:


Primero se crea el archivo que almacena la configuración del repositorio, para esto se debe abrir la terminal para ejecutar lo siguiente:

sudo sh -c ‘echo “deb http://apt.postgresql.org/pub/repos/apt $(lsb_release -cs)-pgdg main” > /etc/apt/sources.list.d/pgdg.list’

sudo apt install wget ca-certificates


Luego se debe importar la llave pública del repositorio ejecutando la siguiente línea: wget --quiet -O - https://www.postgresql.org/media/keys/ACCC4CF8.asc | sudo apt-key add -

Ahora se debe realizar la instalación de la aplicación (recomendado la versión 11) con :
sudo apt update

sudo apt install postgresql-11 pgadmin4


Hasta acá ya tendremos instalado PostgreSQL en nuestro sistema Linux. Para comprobar el estado del servicio de la aplicación se puede ejecutar el siguiente comando: sudo systemctl status postgresql.service


En PostgreSQL la autenticación del cliente es controlada por el archivo de configuración ubicado en la ruta /etc/postgresql/11/main/pg_hba.conf, este archivo de configuración puede ser editado según las necesidades. Con el siguiente comando puedes acceder a Postgres para su gestión: sudo -i -u postgres psql



Por último para utilizar pgAdmin4 ejecuta en la terminal pgadmin4 o ubica el acceso directo en la lista de aplicaciones:


Postman
Lo primero es buscar Postman en la tienda de aplicaciones Ubuntu Software. También puedes hacer la instalación manualmente. Para este modo se recomienda realizar la descarga directamente desde postman.com/downloads

Una vez que le des instalar se realiza automáticamente todo lo necesario para el uso correcto de la aplicación:

Cuando finalice la instalación aparecen los botones Quitar y Permisos. Para abrirlo debes buscar el acceso directo que automáticamente fue creado en la lista de aplicaciones y ya puedes empezar a utilizarlo:
