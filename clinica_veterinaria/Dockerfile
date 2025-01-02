#FROM openjdk:22-jdk-slim
#ARG JAR_FILE=target/clinica_veterinaria-0.0.1.jar
#COPY ${JAR_FILE} app_veterinaria.jar
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "app_veterinaria.jar"]

# Etapa 1: Construcción y pruebas con Maven
#FROM maven:3.8.8-eclipse-temurin-17 AS builder
#WORKDIR /app
#COPY . .
#RUN mvn clean test
#RUN mvn clean package -DskipTests
#
## Etapa 2: Imagen final para ejecutar la aplicación
#FROM openjdk:22-jdk-slim
#WORKDIR /app
#COPY --from=builder /app/target/clinica_veterinaria-0.0.1.jar app_veterinaria.jar
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "app_veterinaria.jar"]

FROM maven:3.8.8-eclipse-temurin-21 AS builder
WORKDIR /app
COPY . .

# Definir variables de entorno para que mvn test las tenga:
#ENV DB_URL=jdbc:mysql://clinica_vet:3306/clinica_veterinaria?createDatabaseIfNotExist=true&serverTimezone=UTC
#ENV DB_USER_NAME=root
#ENV DB_PASSWORD=

#RUN mvn clean test
#RUN mvn clean package

FROM openjdk:22-jdk-slim
WORKDIR /app
COPY --from=builder /app/target/clinica_veterinaria-0.0.1.jar app_veterinaria.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_veterinaria.jar"]
