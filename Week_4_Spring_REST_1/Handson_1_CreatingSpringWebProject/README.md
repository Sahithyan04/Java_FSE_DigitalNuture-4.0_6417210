## Creating a Spring Web Project using Maven

In this exercise, I created a **Spring Boot web application** using Maven with the name `spring-learn`.
This hands-on helped me learn how to generate a Spring project via Spring Initializr, build it using Maven, import into Eclipse, understand the folder structure.

---


## Creating Spring Project

To create the Spring project, I followed these steps:

1. Opened [https://start.spring.io/](https://start.spring.io/)
2. Selected:
   - **Group:** `com.cognizant`
   - **Artifact:** `spring-learn`
   - **Dependencies:** Spring Web, Spring Boot DevTools
3. Clicked on **Generate** to download the ZIP file
4. Extracted the ZIP to `C:\Users\Karthikeyan S\eclipse-workspace`

---

## Building the Project

Used the following command in the project root (where `pom.xml` is located):

```bash
mvn clean package -Dhttp.proxyHost=proxy.cognizant.com -Dhttp.proxyPort=6050 -Dhttps.proxyHost=proxy.cognizant.com -Dhttps.proxyPort=6050 -Dhttp.proxyUser=123456
```

---

## Importing Project

Steps to import into Eclipse:

1. Open **Eclipse IDE**
2. Go to: **File > Import**
3. Choose: **Maven > Existing Maven Projects**
4. Click **Browse** → Select the extracted folder (`spring-learn`)
5. Click **Finish**

Then Eclipse loads the Maven project and builds it automatically.

---


### Main Class

 `SpringLearnApplication.java`

```java
package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {
		System.out.println("Spring Boot Project Started...");
		SpringApplication.run(SpringLearnApplication.class, args);
	}

}
```

---

## File Structure

### 1. `src/main/java`
- Contains the main Java code.
- Includes the application entry point (`SpringLearnApplication.java`) and REST controller classes.

### 2. `src/main/resources`
- Used for application configurations such as `application.properties`.

### 3. `src/test/java`
- Contains unit test code (can be added later for REST APIs or services).

### 4. `SpringLearnApplication.java`
- Main class that bootstraps the application.
- Contains `main()` method that calls `SpringApplication.run()`.

---

## `@SpringBootApplication`

This annotation is a combination of:
- `@Configuration`: For defining Spring configuration
- `@EnableAutoConfiguration`: Enables auto-configuration of Spring context
- `@ComponentScan`: Automatically detects beans/components in the package

It simplifies the setup of Spring Boot applications.

---



