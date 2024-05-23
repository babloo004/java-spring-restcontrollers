# Spring REST Controller Example

This repository contains a simple Spring Boot application demonstrating the implementation of a RESTful API for managing job posts. The application allows clients to retrieve all job posts and add new job posts.

## Technologies Used

- Spring Boot
- Spring Data JPA
- Lombok
- Jackson (for JSON serialization/deserialization)

## Setup

To run this application locally, you'll need:

- JDK 8 or higher
- Maven
- Git

Follow these steps to run the application:


1. Navigate to the project directory:
   ```bash
   cd your-repo-name
   ```

2. Build the project using Maven:
   ```bash
   mvn clean package
   ```

3. Run the Spring Boot application:
   ```bash
   java -jar target/restcontroller-0.0.1-SNAPSHOT.jar
   ```

## Usage

### Retrieve All Job Posts

Send a GET request to `/jobs` endpoint to retrieve all job posts.

Example:
```bash
curl -X GET http://localhost:8080/jobs
```

### Add a New Job Post

Send a POST request to `/job` endpoint with a JSON payload containing the details of the job post to add a new job post.

Example:
```bash
curl -X POST -H "Content-Type: application/json" -d '{"postId":1,"postProfile":"Software Engineer","postDesc":"Full-time software engineer position","reqExperience":2,"postTechStack":["Java","Spring Boot","Hibernate"]}' http://localhost:8080/job
```



Feel free to contribute to this project by submitting pull requests or reporting issues.

---
