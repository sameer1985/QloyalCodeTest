# QloyalCodeTest
This project is designed to automate the testing of APIs using Maven as the build tool. It supports REST API testing and includes automated test cases using [RestAssured] for validating API functionalities.

## Prerequisites

Ensure the following are installed on your system:

- **Java Development Kit (JDK)**: Version 8 or later
- **Apache Maven**: Version 3.6.0 or later
- **Git** (optional): For version control
- **An IDE**: Such as Visual Studio Code or IntelliJ IDEA

### Clone the Repository (if applicable)
`bash
git clone <your-repository-url>
cd apitest

## Project Structure

src/test/java: Contains the API test classes.
pom.xml: Maven Project Object Model file that contains project dependencies and plugins.

## Running the Tests
Step 1: Open Terminal/Command Line
Navigate to the project directory (assuming it's named apitest):

Step 2: Build and Run Tests
Use the following Maven command to clean the project, install dependencies, and run the test cases:

mvn clean install
