# Optimal Travel Paths

Este proyecto es un servicio web RESTful para la optimización de viajes, que permite almacenar información sobre estaciones y caminos y encontrar el camino óptimo entre dos estaciones minimizando costos.

## Requisitos

- Java 11 o superior
- Docker (opcional, para ejecutar la aplicación en un contenedor)

## Configuración

No se requiere configuración especial. El proyecto está configurado para ejecutarse con las configuraciones predeterminadas.

## Compilación

Para compilar el proyecto, ejecuta el siguiente comando:



Esto compilará el proyecto y generará un archivo JAR ejecutable en el directorio `target`.

## Ejecución

Para ejecutar la aplicación, primero asegúrate de que tienes Java 11 o superior instalado. Luego, puedes ejecutar el siguiente comando:




Esto iniciará la aplicación Spring Boot.

## Uso

Una vez que la aplicación esté en funcionamiento, puedes acceder a los siguientes endpoints RESTful:

- `POST /api/travel/station`: Agrega una nueva estación.
- `POST /api/travel/path`: Agrega un nuevo camino.
- `GET /api/travel/path?originName={origin}&destinationName={destination}`: Encuentra el camino óptimo entre dos estaciones.

Para obtener más detalles sobre cómo interactuar con estos endpoints, consulta la documentación de la API.

## Documentación de la API

La documentación de la API está disponible en la ruta `/swagger-ui.html` una vez que la aplicación esté en funcionamiento.

## Contribuyendo

Si deseas contribuir a este proyecto, por favor, consulta el archivo CONTRIBUTING.md para obtener más detalles.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para obtener más detalles.
