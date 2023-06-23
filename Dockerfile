FROM maven:3.1.1-eclipse-temurin-17-alpine AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17
VOLUME /tmp
COPY --from=build target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]