# Use the official Maven image to create a build artifact.
# This stage is named 'builder' for the multi-stage build
FROM maven:3.8.1-openjdk-17 AS builder

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml and source code to the container
COPY pom.xml .
COPY src ./src

# Package the application
RUN mvn clean package -DskipTests

# Use the official OpenJDK image to run the application
FROM openjdk:17-jdk-slim

# Copy the jar file from the builder stage
COPY --from=builder /app/target/UserRest-0.0.1-SNAPSHOT.jar /app/UserRest.jar

# Expose the port the application will run on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app/UserRest.jar"]
