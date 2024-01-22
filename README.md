# SpringBoot Basic App

Hi, this is a basic Spring Boot application covering fundamental concepts and features. The application includes the following:

1. **Annotations:** Demonstrates the usage of various Spring annotations.
2. **Java File Reading:** Explores how Spring reads Java files.
3. **REST APIs:** Implements a Department system with CRUD features, connected to a MySQL database using JPA Repository. (Note: `application.properties` contains configuration for connecting to an in-memory H2 database as well.)
4. **Exception Handling:** Exception-handling mechanisms are incorporated.
5. **Testing:** Includes Mockito JUnit 5 test cases for Controller, Service, and Repository with a simplified and easy-to-understand approach.
6. **Configuration Files:** Utilizes both `application.properties` and `application.yml` files. The latter contains MySQL connection configurations, and configurations for different environments (dev, qa, prod).
7. **Actuator Endpoints:** Exposes all Actuator endpoints via `application.yml`.
8. **Custom Actuator:** Introduces a custom Actuator endpoint to display enabled features in the running application.

## How to Run

1. Ensure you have Docker installed.
2. Run a MySQL container locally using Docker.

```bash
docker run -p 3306:3306 --name mysql-container -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=springbootdb -d mysql:latest
```

3. Clone this repository and navigate to the project directory.
4. Open the project in your favorite IDE.
5. Run the Spring Boot application.

Configuration: 
application.properties: Contains configurations for the in-memory H2 database.
application.yml: Includes MySQL connection configurations and environment-specific settings.

References: 
Special thanks to DailyCodeBuffer : https://www.youtube.com/watch?v=zvR-Oif_nxg&t=1s for helpful references.

Author:  Arjun P
