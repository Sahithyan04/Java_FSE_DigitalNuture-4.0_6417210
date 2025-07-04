#  Spring Data JPA + MySQL - Quick Example

A basic Spring Boot project showcasing **Spring Data JPA** integration with **MySQL** to fetch country data using layered architecture.

---

## Setup Overview

-  Dependencies in `pom.xml`:
  - `spring-boot-starter-data-jpa`
  - `mysql-connector-j`
  - `spring-boot-starter-web` (optional for testing)
  - `spring-boot-devtools`

-  Model: `Country` entity mapped to `country` table with `co_code` and `co_name` fields.

-  Repository: `CountryRepository` extends `JpaRepository` for CRUD operations.

-  Service: 
  - `CountryService` interface 
  - `CountryServiceImpl` with `@Autowired` repository and `getAllCountries()` method

-  Main Class: `OrmLearnApplication` initializes Spring context and prints all countries on startup.

-  `application.properties`: Contains DB URL, MySQL credentials, JPA dialect, and logging setup.

---

##  Output

Logs list of countries from DB like:
Country [code=IN, name=India]
Country [code=US, name=United States of America]
...