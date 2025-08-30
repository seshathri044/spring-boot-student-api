# 📚 Spring Boot Student Management API  

![Java CI with Maven](https://github.com/seshathri044/spring-boot-student-api/actions/workflows/maven.yml/badge.svg)

A **production-ready RESTful API** for managing student records, built with **Spring Boot, MySQL, and JPA**.  
This project demonstrates **clean layered architecture, database integration, and CRUD operations**.  
It’s designed as a scalable microservice that can be extended into a full **Student Management System**.  

---

## 🚀 Features
- Create, Read, Update, and Delete (CRUD) students
- MySQL database integration with Hibernate ORM
- RESTful API endpoints with JSON responses
- Service & Repository layer abstraction
- Centralized configuration with `application.properties`
- Tested with **Postman** + verified in **MySQL Workbench**

---

## 🛠️ Tech Stack
- **Java 17+**
- **Spring Boot 3+**
- **Spring Data JPA + Hibernate**
- **MySQL 8+**
- **Maven**
- **Postman** (for API testing)
- **IntelliJ IDEA** (development)

---

## 📂 Project Structure
```bash
JPAdemo
│── src/main/java/com/example/JPAdemo
│ ├── controller # REST API layer
│ │ └── StudentController.java
│ ├── models # Entity classes
│ │ └── Student.java
│ ├── repository # JPA repository interfaces
│ │ └── StudentRepo.java
│ ├── service # Business logic layer
│ │ └── StudentService.java
│ └── JpAdemoApplication.java # Main entry point
│
│── src/main/resources
│ ├── application.properties # Database configuration
│
└── pom.xml # Maven dependencies
```

---

## 📸 Screenshots
**Data Added**
<img width="1920" height="1080" alt="SB2" src="https://github.com/user-attachments/assets/30207dcc-4f6b-4cf0-b380-4cb992e9fd44" />
**Seshathri Data Deleted**
<img width="1920" height="1080" alt="SB2 1" src="https://github.com/user-attachments/assets/da1a6f50-857b-4176-bdee-1fbd2012168d" />
**Updated Data in MySQL DB**
<img width="1920" height="1080" alt="SB2 2" src="https://github.com/user-attachments/assets/e83a6754-b940-4f8a-a6d3-7dc453d284b0" />

---

## ⚡ API Endpoints

| Method | Endpoint               | Description                  |
|--------|------------------------|------------------------------|
| GET    | `/students`            | Get all students             |
| GET    | `/students/{rno}`      | Get student by roll number   |
| POST   | `/students`            | Add a new student            |
| PUT    | `/students`            | Update an existing student   |
| DELETE | `/students/{rno}`      | Delete student by roll number|
| DELETE | `/students/clear`      | Delete all student records   |

---

## 🧪 Example API Usage

### ➕ Add a Student
**POST** `/students`  
```json
{
  "rno": 11,
  "name": "Sudha",
  "gender": "Female",
  "technology": "Full Stack"
}
```

### 📋 Get All Students

GET /students
```json
[
  {
    "rno": 11,
    "name": "Sudha",
    "gender": "Female",
    "technology": "Full Stack"
  },
  {
    "rno": 49,
    "name": "Annanth",
    "gender": "Male",
    "technology": "C++"
  },
  {
    "rno": 59,
    "name": "Yogeshwaran",
    "gender": "Male",
    "technology": "AI"
  }
]
```

---

## ⚙️ Setup Instructions
Clone Repository
```bash
git clone https://github.com/YOUR_USERNAME/spring-boot-student-api.git
cd spring-boot-student-api
```
Configure MySQL Database
- Create a database jpademo
- Update credentials in src/main/resources/application.properties
```java
spring.datasource.url=jdbc:mysql://localhost:3306/jpademo
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

### Run Application
```bash
mvn spring-boot:run
```
### Test with Postman
- Import endpoints
- Example: http://localhost:8080/students

---


## 🚀 Future Improvements
- ✅ Github Action CI CD [🎉Completed]
- ✅ Add Swagger/OpenAPI documentation
- ✅ Implement validation (Hibernate Validator)
- ✅ Add JUnit + Mockito test coverage
- ✅ Secure APIs with JWT authentication

## 🚀 CI/CD Setup (GitHub Actions)

**CI/CD Status:**  
![Java CI with Maven](https://github.com/seshathri044/spring-boot-student-api/actions/workflows/maven.yml/badge.svg)

## 🤝 Contributing
- Contributions are welcome!
- Feel free to fork this repo, create a feature branch, and submit a PR.
