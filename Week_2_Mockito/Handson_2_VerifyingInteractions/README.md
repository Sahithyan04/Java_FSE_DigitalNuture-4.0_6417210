# 🔍 Mockito - Verifying Interactions in JUnit

## ⚙️ Setup
VS Code → `Maven: Create new Project`

### `pom.xml`
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
    return "Real API data";
  }
}
```

### `MyService.java`
```java
public class MyService {
  private ExternalApi api;
  public MyService(ExternalApi api) { this.api = api; }
  public void fetchData() { api.getData(); }
}
```

## ✅ Test - `MyServiceTest.java`
```java
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class MyServiceTest {
  @Test
  public void testVerifyInteraction() {
    ExternalApi mockApi = mock(ExternalApi.class);
    MyService service = new MyService(mockApi);

    service.fetchData();

    verify(mockApi).getData(); // 🔍 Verifies method call
  }
}
```

## 🔎 Verification Concept
- `verify(mock).method()` ensures interaction occurred
- Fails test if method not called

## 🚀 Run
```bash
mvn test
```

✔️ Output:
```
Tests run: 1, Failures: 0, Errors: 0
```
