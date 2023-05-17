FROM openjdk:11-jre-slim
WORKDIR /app 
COPY /target/calculator-1.0-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "calculator-1.0-SNAPSHOT.jar"]
