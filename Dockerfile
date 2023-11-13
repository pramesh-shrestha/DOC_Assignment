## Fetch the Java
#FROM openjdk:17-alpine
## Expose port 8080
#EXPOSE 8080
## set a docker volume if you want
#VOLUME /backend-volume
## Add the jar file
#ADD /target/*.jar DevOpsAssignment-0.0.1-SNAPSHOT.jar
## Start the application
#ENTRYPOINT ["java", "-jar", "/DevOpsAssignment-0.0.1-SNAPSHOT.jar"]



#Build Stage
FROM maven:3.8.4-openjdk-17 AS builder
WORKDIR /app
COPY . .
RUN mvn -B package -f pom.xml -DskipTests

#Final Stage
FROM openjdk:17-alpine
EXPOSE 8080
COPY --from=builder /app/target/DevOpsAssignment-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]


