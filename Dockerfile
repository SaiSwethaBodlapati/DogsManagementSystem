# First stage: Build the app using Maven
FROM maven:3-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -Pprod -DskipTests

# Second stage: Create a lightweight container using OpenJDK 17 Alpine
FROM eclipse-temurin:17-alpine

# Copy the JAR file from the build stage to the container
COPY --from=build /app/target/DogsManagementSystem-0.0.1-SNAPSHOT.jar /DogsManagementSystem.jar

# Expose port 8080
EXPOSE 8080

# Set the command to run the application
CMD ["java", "-jar", "/DogsManagementSystem.jar"]
