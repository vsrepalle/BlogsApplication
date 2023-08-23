# Use an official OpenJDK 11 image as the base image
FROM openjdk:11-jdk-slim

# Set the working directory within the container
WORKDIR /app

# Copy the compiled JAR file into the container
COPY target/blogs-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that your Spring Boot application listens on
EXPOSE 9080

# Start the Spring Boot application when the container starts
CMD ["java", "-jar", "app.jar"]
