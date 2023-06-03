# Use a base image with Java installed
FROM openjdk:11-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the build context into the container
COPY OrderService-0.0.1-SNAPSHOT.jar app.jar

# Specify the command to run the JAR file
CMD ["java", "-jar", "app.jar"]
