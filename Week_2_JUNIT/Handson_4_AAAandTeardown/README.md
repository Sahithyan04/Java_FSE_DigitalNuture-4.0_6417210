# AAA Pattern & Teardown in JUnit

## ⚙️ Setup
- VSCode + Maven Project via `Maven: Create new Project`
- `pom.xml` Dependency:
```xml
<dependency>
  <groupId>junit</groupId>
  <artifactId>junit</artifactId>
  <version>4.13.2</version>
  <scope>test</scope>
</dependency>
```

##  Calculator.java
```java
public class Calculator {
    public int add(int a, int b) { return a + b; }
    public int multiply(int a, int b) { return a * b; }
    public boolean isEven(int number) { return number % 2 == 0; }
}
```

## 🧪 CalculatorTest.java
```java
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("🔧 Setup complete.");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("🧹 Teardown complete.\n");
    }

    @Test
    public void testAddition() {
        int a = 10, b = 5; // Arrange
        int result = calculator.add(a, b); // Act
        assertEquals(15, result); // Assert
    }

    @Test
    public void testMultiplication() {
        int x = 4, y = 3;
        int product = calculator.multiply(x, y);
        assertEquals(12, product);
    }

    @Test
    public void testIsEven() {
        int num = 6;
        boolean result = calculator.isEven(num);
        assertTrue(result);
    }
}
```

## 🔄 AAA Breakdown
- **Arrange**: Setup inputs (`int x = 4;`)
- **Act**: Call method (`calculator.add(x, y)`)
- **Assert**: Validate output (`assertEquals(...)`)

## 🔃 Setup & Teardown
- `@Before`: runs before each test
- `@After`: cleanup after each test

## 🚀 Run Test
```bash
mvn test
```

✔️ Output:
```
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
```
