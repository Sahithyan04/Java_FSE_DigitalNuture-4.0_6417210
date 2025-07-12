
# Spring Core – Load Country from Spring Configuration XML

In this project, I implemented a basic Spring Core application that demonstrates how to load a bean using Spring XML configuration. The application reads country information (ISO code and name) from an external XML file (`country.xml`) using `ClassPathXmlApplicationContext` and prints it via logging. This is a foundational example of how Spring Dependency Injection works using XML-based configuration.

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

## SpringLearnApplication.java

In the `main()` method, I invoked the `displayCountry()` method to load the XML bean.

```java
public static void displayCountry() {
    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
    Country country = context.getBean("country", Country.class);
    LOGGER.debug("Country : {}", country.toString());
}
```
---

## File Structure

### `src/main/java`
Contains the Java application code including:
- `SpringLearnApplication.java`: Main launcher class
- `Country.java`: Model class with code, name, constructor, and debug logs in setter/getters

### `src/main/resources`
Contains the `country.xml` file with the following bean configuration:

```xml
<bean id="country" class="com.cognizant.spring_learn.model.Country">
    <property name="code" value="IN" />
    <property name="name" value="India" />
</bean>
```
---

---

## Bean Loading Concepts

### `bean` tag
Used to declare a Spring-managed object in XML.

### `id` attribute
Gives a name (like “country”) to reference the bean.

### `class` attribute
Specifies the full class name (with package) of the object.

### `property` tag
Used to set values to the bean fields using setter methods.

### `ApplicationContext`
Spring container that loads the bean definitions from XML.

### `ClassPathXmlApplicationContext`
Loads context from the `classpath` resource (`country.xml`).

### `context.getBean(...)`
Returns an object reference from the Spring container by reading the bean config.
