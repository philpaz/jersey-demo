# Jersey Demo API with Spring Boot

## 🚀 Project Overview

This is a comprehensive RESTful API built with Spring Boot and Jersey that demonstrates modern Java web development practices. The application provides a complete user management system with full CRUD (Create, Read, Update, Delete) operations, following RESTful principles and best practices.

### 🌟 Key Features
- **User Management**: Full lifecycle management of user resources
- **RESTful Design**: Clean, intuitive API endpoints following REST conventions
- **In-Memory Storage**: Lightweight storage solution for development and testing
- **Input Validation**: Robust validation of request payloads
- **Error Handling**: Comprehensive error responses with appropriate HTTP status codes
- **Docker Support**: Containerized deployment with multi-stage builds

### 🛠️ Technology Stack

#### Core Technologies
- **Java 17**: Latest LTS version for modern Java development
- **Spring Boot 3.2.0**: Rapid application development framework
- **Jersey (JAX-RS)**: JAX-RS reference implementation for building RESTful web services
- **Maven**: Dependency management and build automation

#### Development Tools
- **Docker**: Containerization for consistent environments
- **Git**: Version control
- **Spring Boot DevTools**: Developer productivity tools
- **Lombok**: Reduced boilerplate code

#### Testing
- **JUnit 5**: Next-generation testing framework
- **MockMVC**: Spring's testing framework for web applications
- **REST Assured**: For testing RESTful services

## 📚 Learning Outcomes

By exploring this project, you'll gain hands-on experience with:

### Backend Development
- Building production-grade REST APIs with Spring Boot and Jersey
- Implementing proper error handling and validation
- Working with in-memory data structures for rapid development
- Understanding HTTP methods and status codes
- API documentation best practices

### Modern Java Development
- Java 17 features and best practices
- Dependency injection with Spring
- Building modular, maintainable applications
- Working with Maven for dependency management

### DevOps & Deployment
- Containerizing applications with Docker
- Multi-stage Docker builds for optimized images
- Continuous Integration/Deployment concepts
- Environment configuration management

### API Design
- RESTful architecture principles
- Resource naming conventions
- Request/response patterns
- Versioning strategies
- Error handling patterns

### Testing
- Unit testing REST controllers
- Integration testing with TestRestTemplate
- Testing RESTful endpoints
- Mocking dependencies

## 🚀 Features

- Create, Read, Update, and Delete users
- In-memory data storage
- JSON request/response
- Docker support
- Spring Boot 3.2.0 with Java 17
- Jersey JAX-RS implementation
- Maven build system

## 📋 Prerequisites

- Java 17 or higher
- Maven 3.8+
- Docker (optional, for containerization)
- cURL, Postman, or similar API testing tool

## 🛠️ Installation

### Local Development

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/jersey-demo.git
   cd jersey-demo
   ```

2. **Build the application**
   ```bash
   ./mvnw clean install
   ```

3. **Run the application**
   ```bash
   ./mvnw spring-boot:run
   ```

The application will be available at `http://localhost:8080`

## 🐳 Docker Support

### Build the Docker Image

```bash
docker build -t jersey-demo .
```

### Run the Docker Container

```bash
docker run -p 8080:8080 jersey-demo
```

### Push to Docker Hub

1. **Login to Docker Hub**
   ```bash
   docker login
   ```

2. **Tag the image**
   ```bash
   docker tag jersey-demo yourusername/jersey-demo:1.0.0
   ```

3. **Push the image**
   ```bash
   docker push yourusername/jersey-demo:1.0.0
   ```

## 📚 API Documentation

### Base URL
```
http://localhost:8080
```

### Endpoints

#### Get All Users
```
GET /users
```

**Example Response:**
```json
{
  "users": [
    {
      "id": "550e8400-e29b-41d4-a716-446655440000",
      "firstName": "John",
      "lastName": "Doe",
      "uri": "/users/550e8400-e29b-41d4-a716-446655440000"
    }
  ]
}
```

#### Create a New User
```
POST /users
```

**Request Body:**
```json
{
  "firstName": "John",
  "lastName": "Doe"
}
```

**Example Response (201 Created):**
```
Status: 201 Created
Location: /users/550e8400-e29b-41d4-a716-446655440000
```

#### Get User by ID
```
GET /users/{id}
```

**Example Response:**
```json
{
  "id": "550e8400-e29b-41d4-a716-446655440000",
  "firstName": "John",
  "lastName": "Doe",
  "uri": "/users/550e8400-e29b-41d4-a716-446655440000"
}
```

#### Update User
```
PUT /users/{id}
```

**Request Body:**
```json
{
  "firstName": "John",
  "lastName": "Smith"
}
```

#### Delete User
```
DELETE /users/{id}
```

## 🧪 Testing

Run the test suite with:
```bash
./mvnw test
```

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## ✉️ Contact

- **Author**: Philip Paz
- **Email**: [philip.paz@gmail.com](mailto:philip.paz@gmail.com)
- **GitHub**: [@philpaz](https://github.com/philpaz)
- **LinkedIn**: [Philip Paz](https://www.linkedin.com/in/philip-paz/)

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

---

<p align="center">
  Made with ❤️ by Philip Paz | 
  <a href="https://www.linkedin.com/in/philip-paz/" target="_blank">
    <img src="https://img.shields.io/badge/LinkedIn-Connect-blue?style=flat-square&logo=linkedin" alt="LinkedIn">
  </a>
  <a href="https://github.com/philpaz" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-Profile-black?style=flat-square&logo=github" alt="GitHub">
  </a>
</p>

## 🔍 Additional Resources

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Jersey Documentation](https://eclipse-ee4j.github.io/jersey/)
- [Docker Documentation](https://docs.docker.com/)

## 📊 Project Status

✅ Active: This project is currently being maintained and improved.

## 🤝 How to Contribute

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request
