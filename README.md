# TacticsRESTAPI

Simple RESTful API with Java, Spring Boot, H2 Database, and JPA, implementing CRUD operations for Tactics.

## Features
- Create, read, update, and delete tactics
- Modular structure: controllers, services, models, & repositories
- H2 in-memory database for easy testing
- **All endpoints return JSON responses**
- Simple and clean RESTful design

## Technologies
- Java
- Spring Boot
- H2 Database
- Spring Data JPA
- Maven
- Postman (for testing GET, POST, PUT, DELETE requests)

## API Endpoints
- `GET /tactics` – Get all tactics
- `GET /tactics/{id}` – Get tactic by ID
- `POST /tactics` – Create a new tactic
- `PUT /tactics/{id}` – Update an existing tactic
- `DELETE /tactics/{id}` – Delete a tactic by ID

## Running the Project
1. Clone the repository:
```bash
git clone https://github.com/just96/TacticsRESTAPI.git
