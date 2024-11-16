# Usa una imagen de base con Java preinstalado
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR generado en el contenedor
COPY target/*.jar api.productos.jin.andres-0.0.1-SNAPSHOT.jar

# Expone el puerto en el que se ejecutará tu aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "api.productos.jin.andres-0.0.1-SNAPSHOT.jar"]
