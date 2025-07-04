#  Spring Core XML Config - Library Management App

This project is a **simple Spring application** that shows how to use **XML-based Dependency Injection** to wire components in a classic Java backend setup.

---

##  What’s Inside?

-  Built using **Maven** (`maven-archetype-quickstart`)
-  Uses **Spring Core** for lightweight bean management
-  Configuration done in `applicationContext.xml` using `<bean>` and `<property>`
-  Contains two core components:
  - `BookRepository` ➡️ provides book data
  - `BookService` ➡️ fetches data via the repository
-  `LibraryApp` loads the context and prints the book name

---

##  Outcome

> **Output:** `Book Name: The Spring in Action`  
A clean demonstration of **Spring’s XML-based DI** in action.
