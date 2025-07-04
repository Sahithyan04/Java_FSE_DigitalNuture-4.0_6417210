##  Spring Dependency Injection using XML (Project Summary)

This project demonstrates a **Library Management System** using **Spring Core** with **Setter-based Dependency Injection** via **XML configuration**.

**Tech Stack:**  
- Spring Context (v5.3.9)  
- Maven (`exec-maven-plugin` to run the app)

 **Structure:**  
- `BookRepository` provides book data  
- `BookService` depends on `BookRepository`, injected via `<property>` in `applicationContext.xml`  
- `LibraryApp` loads the Spring context and triggers `displayBook()`  

 **Config:**  
Beans declared in `applicationContext.xml`, where `bookService` references `bookRepository`  

 **Output:**  
``[DI Success] BookRepository injected into BookService``  
``[BookService] Book Name: Spring Boot in Action``  
