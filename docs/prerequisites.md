# Prerequisites and Setup

This document lists the prerequisites and steps to build, test, and run the backend application.

## 1. Prerequisites

### - Java Development Kit (JDK)

### - backend.zip for Springboot Backend

Zip file Configuration via spring-boot.io.
Download and extract the file in the project directory.

### - Apache Maven

This project includes the Maven Wrapper, which automatically downloads the correct Maven version. 

- Windows: use `mvnw.cmd` 
- macOS/Linux: use `./mvnw` 

Otherwise install maven.

## 2. Building and Testing

To ensure the project is set up correctly, compile the code and run the unit tests.

Open a terminal in the backend directory and run the appropriate command for your system:

- **Windows:**

      mvnw clean test

- **macOS / Linux:**

      ./mvnw clean test

## 3. Running the Application

To start the backend application, run the following command from the backend directory:

- **Windows:**
 
      mvnw spring-boot:run
  
- **macOS / Linux:**

      ./mvnw spring-boot:run
