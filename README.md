# Jersey Demo API with Spring Boot

A RESTful API built with Spring Boot and Jersey for user management. This application provides CRUD operations for user resources with in-memory storage.

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

---

<p align="center">
  Made with ❤️ by Philip Paz
</p>
