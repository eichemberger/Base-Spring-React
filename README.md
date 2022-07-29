## Proyecto base de springboot con react-app

**Java 17**

**React 18**

**Webpack 5**

*No hace falta tener instalado node ni npm.*

## Levantar el proyecto

Ejecutar el proyecto springboot, esto hará que se compile el front-end en un bundle.js y se copie en target. Para
no compilar cada vez que se quiere hacer un cambio en el front, es mejor dejar ejecutandose el back y hacer:

```npm run start```

Para levantar el front-end de react, el cual va a apuntar mediante un proxy a ``` localhost:8080``` para poder consumir apis del backend.