# ⚙️ JUnit Setup in VSCode (Maven)

## 📦 Setup
- Installed: Java Extension Pack, Maven, JUnit Test Runner
- Created project: `Maven: Create new Project` in VSCode

## 📌 Added to `pom.xml`
```xml
<dependency>
  <groupId>junit</groupId>
  <artifactId>junit</artifactId>
  <version>4.13.2</version>
  <scope>test</scope>
</dependency>
```

## 🧪 Test Files

**Calculator.java**
```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}
```

**CalculatorTest.java**
```java
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(15, new Calculator().add(10, 5));
    }
}
```

## 🚀 Run Test
```
mvn test
```

✅ Output:
```
[INFO] Tests run: 1, Failures: 0, Errors: 0
```
