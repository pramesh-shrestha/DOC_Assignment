# Fetch the Java
FROM openjdk:17-alpine
# Expose port 8080
EXPOSE 8080
# set a docker volume if you want
VOLUME /backend_volume
# Add the jar file
ADD /target/*.jar DevOpsAssignment-0.0.1-SNAPSHOT.jar
# Start the application
ENTRYPOINT ["java", "-jar", "/DevOpsAssignment-0.0.1-SNAPSHOT.jar"]
