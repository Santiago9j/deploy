FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/pruebas-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} pruebas.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "pruebas.jar"]