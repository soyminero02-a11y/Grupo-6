FROM eclipse-temurin:17-jre-alpine 
WORKDIR /Repositorio_1
COPY target/track-0.0.1-SNAPSHOT.jar Repositorio_1.jar 
ENTRYPOINT ["java","-jar","Repositorio_1.jar"]