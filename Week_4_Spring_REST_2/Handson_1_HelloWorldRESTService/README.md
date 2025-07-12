# Hello World RESTful Web Service

In this project, I created a simple REST service inside the `spring-learn` application using Spring Web. This service returns a plain text "Hello World!!" message when the `/hello` endpoint is accessed via HTTP GET method.

---

## Creating Spring Boot Project

To create the Spring Boot project, I used Spring Initializr with the following settings:

- **Project**: Maven
- **Language**: Java
- **Spring Boot Version**: 2.7.18
- **Group**: `com.cognizant`
- **Artifact**: `spring-learn`
- **Dependencies**:
  - Spring Web
  - Spring Boot DevTools

---

## Building Project

To build the Maven project, I used:

```bash
mvn clean install
```
---

## Creating HelloController

`HelloController.java`

```java
package com.cognizant.spring_learn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello() {
        LOGGER.info("START - sayHello()");
        LOGGER.info("END - sayHello()");
        return "Hello World!!";
    }
}
```

---

## SpringLearnApplication.java

I verified that my main application class looks like this:

```java
package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
    }
}
```

---

## application.properties

To set the port number:

```properties
server.port=8083
```

Add this in `src/main/resources/application.properties`.

---

## Output

When I accessed the following URL:

```
http://localhost:8083/hello
```

I received this response:

```
Hello World!!
```

---

## Testing Using Chrome and Postman

### Chrome Dev Tool:
1. Open Chrome.
2. Visit: `http://localhost:8083/hello`
3. Press F12 → Go to **Network** tab → Refresh the page.
4. Click the `/hello` request → View headers under **Headers** tab.

### Postman:
1. Open Postman.
2. Enter URL: `http://localhost:8083/hello`
3. Method: `GET`
4. Click **Send**
5. Observe the response and header info in **Headers** tab.

---

## File Structure

- `src/main/java` – Java classes
- `src/main/resources` – `application.properties`
- `SpringLearnApplication.java` – Main launcher
- `HelloController.java` – Our REST endpoint
- `pom.xml` – Maven dependency configuration
