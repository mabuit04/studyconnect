# Prerequisites and Setup

This document lists the prerequisites and steps to build, test, and run the backend application.

## 1. Prerequisites

### - Java Development Kit (JDK)

### - backend.zip for Springboot Backend

Zip file Configuration via spring-boot.io.
Download and extract the file in the project directory.

### - Apache Maven

This project includes "Maven Wrapper Distribution", which automatically downloads the correct Maven version at first run. 

- Windows: use `mvnw.cmd` 
- macOS/Linux: use `./mvnw` 

Otherwise install maven manually from https://maven.apache.org/download.cgi.

## 2. Building and Testing

To ensure the project is set up correctly, compile the code and run the unit tests.

Open a terminal in the backend directory and run the appropriate command for your system:

- **Windows:**

      mvnw.cmd clean test

- **macOS / Linux:**

      ./mvnw clean test

## 3. Running the Application

To start the backend application, run the following command from the backend directory:

- **Windows:**
 
      mvnw.cmd spring-boot:run
  
- **macOS / Linux:**

      ./mvnw spring-boot:run
