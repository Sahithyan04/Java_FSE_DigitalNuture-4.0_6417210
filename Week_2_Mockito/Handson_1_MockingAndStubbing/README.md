# 🤖 Mockito - Mocking & Stubbing in JUnit

## ⚙️ Setup
- VS Code → `Maven: Create new Project`
- Added to `pom.xml`:
```xml
<dependencies>
  <dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
  </dependency>
  <dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>5.12.0</version>
    <scope>test</scope>
  </dependency>
</dependencies>
```

## 🧩 Classes

### `ExternalApi.java`
```java
public class ExternalApi {
  public String getData() {
    return "Real Data from API";
  }
}
```

### `MyService.java`
```java
public class MyService {
  private ExternalApi api;
  public MyService(ExternalApi api) { this.api = api; }
  public String fetchData() { return api.getData(); }
}
```

## ✅ Test - `MyServiceTest.java`
```java
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {
  @Test
  public void testExternalApi() {
    ExternalApi mockApi = Mockito.mock(ExternalApi.class);
    when(mockApi.getData()).thenReturn("Mock Data");

    MyService service = new MyService(mockApi);
    String result = service.fetchData();

    System.out.println("Returned: " + result);
    assertEquals("Mock Data", result);
  }
}
```

## 🧠 Concepts
- **Mocking**: Fake obj → `Mockito.mock(...)`
- **Stubbing**: Fake return → `when(...).thenReturn(...)`

## 🚀 Run
```bash
mvn test
```

✔️ Output:
```
Tests run: 1, Failures: 0, Errors: 0
```