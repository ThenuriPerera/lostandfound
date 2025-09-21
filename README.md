Backend service for the Lost and Found Application, built with Java 21 and Spring Boot 3.4.1. Provides JWT-based authentication, REST APIs for items and users, and integrates with MySQL.

Tech Stack

Java 21, Spring Boot 3.4.1

Spring Security (JWT), Spring Data JPA

MySQL / MariaDB, Hibernate

Maven, Lombok

Swagger (OpenAPI), SLF4J

Project Structure
com.example.lostandfound/
├── controller/   # REST APIs
├── dto/          # Request/response DTOs
├── entity/       # JPA entities
├── enums/        # Enums (status, roles)
├── repository/   # JPA repositories
├── security/     # JWT, filters, config
├── service/      # Business logic
└── LostAndFoundApp.java

Authentication

JWT used for login & authorization.

JwtUtil handles token generation/validation.

JwtAuthorizationFilter validates tokens on each request.

Public endpoints: /auth/** (signup, login).

All other endpoints require a valid JWT.

Example Entities

User → id, username, password, email, role

Item → id, name, description, status, reportedBy

Request → id, item, requester, status

Enums: ItemStatus {LOST, FOUND, CLAIMED}, UserRole {ADMIN, STAFF, USER}

REST Endpoints (samples)

POST /auth/signup — register user

POST /auth/login — authenticate & return JWT

GET /items — list all items (requires token)

POST /items — report a lost/found item

Configuration (application.properties)
spring.datasource.url=jdbc:mysql://localhost:3306/lost_and_found
spring.datasource.username=root
spring.datasource.password=your_password
jwt.secret=yourSecretKey
jwt.expiration=3600000

Testing & Docs

Swagger UI → /swagger-ui/index.html

Postman → test with JWT in Authorization: Bearer <token> header

Running Locally

Create database: CREATE DATABASE lost_and_found;

Update application.properties with DB creds + JWT secret.

Run:

mvn clean package
mvn spring-boot:run


Backend available at http://localhost:8080.
