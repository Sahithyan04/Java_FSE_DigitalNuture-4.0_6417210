
# REST - Country Web Service

In this project, we created a RESTful Web Service using Spring Boot that returns the details of the country "India" by loading a Spring bean from an external XML configuration file. The response is automatically converted into JSON using Jackson (Spring Boot default).

---

---

## Country.java

```java
package com.cognizant.spring_learn.model;

public class Country {
    private String code;
    private String name;

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
```

---

## CountryController.java

```java
package com.cognizant.spring_learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.spring_learn.model.Country;

@RestController
public class CountryController {

    @RequestMapping("/country")
    public Country getCountryIndia() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean("in");
        return country;
    }
}
```

---

## SpringLearnApplication.java

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

## JSON Response

```json
{
  "code": "IN",
  "name": "India"
}
```

---
