
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


