# Assertion in JUnit (VSCode + Maven)

## ⚙️ Setup
- Extensions: Java Extension Pack, Maven, JUnit Test Runner
- Created project: `Maven: Create new Project`
- Added to `pom.xml`:
```xml
<dependency>
  <groupId>junit</groupId>
  <artifactId>junit</artifactId>
  <version>4.13.2</version>
  <scope>test</scope>
</dependency>
```

## 🔧 MathUtils.java
```java
public class MathUtils {
    public int add(int a, int b) { return a + b; }
    public boolean isPositive(int number) { return number > 0; }
    public Integer getNullValue() { return null; }
    public String getNonNullString() { return "JUnit"; }
}
```

## 🧪 MathUtilsTest.java
```java
import static org.junit.Assert.*;
import org.junit.Test;

public class MathUtilsTest {
    MathUtils mathUtils = new MathUtils();

    @Test
    public void testMathUtilsFunctions() {
        assertEquals(5, mathUtils.add(2, 3));
        assertTrue(mathUtils.isPositive(10));
        assertFalse(mathUtils.isPositive(-5));
        assertNull(mathUtils.getNullValue());
        assertNotNull(mathUtils.getNonNullString());
    }
}
```

## 🚀 Run Tests
```bash
mvn test
```

✅ Output:
```
[INFO] Tests run: 1, Failures: 0, Errors: 0
```
