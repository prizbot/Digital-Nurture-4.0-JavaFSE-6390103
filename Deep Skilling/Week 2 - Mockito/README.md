## Week 2 - Mockito

### Overview
This week focuses on learning and applying **Mockito**, a popular Java framework used for unit testing by creating mock objects. Mockito enables developers to isolate dependencies and test specific parts of the code without relying on the actual implementation of those dependencies. By mastering Mockito, you can write cleaner, more maintainable, and reliable tests.

---

### Prerequisites
Before working with Mockito, ensure you have:  
- Basic understanding of Java and OOP concepts  
- Familiarity with JUnit (JUnit 4 or 5)  
- Java 8 or later installed  
- Maven or Gradle build tool  
- An IDE such as IntelliJ IDEA, Eclipse, or VS Code with Java extensions  

---

### Setting up Mockito

**Maven Dependency**  
Add the following to your `pom.xml`:  
```xml
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>5.11.0</version>
    <scope>test</scope>
</dependency>
```
### Gradle Dependency
Add this to your `build.gradle`:
```gradle
testImplementation 'org.mockito:mockito-core:5.11.0'
```
---

### Basic Mockito Concepts
**Creating Mocks**
Mocks simulate the behavior of real objects.
```java
List<String> mockedList = Mockito.mock(List.class);
```

**Stubbing Methods**
You can define the behavior of a mock object when a specific method is called.
```java
when(mockedList.get(0)).thenReturn("Hello Mockito");
```

**Verifying Interactions**
Mockito allows you to verify whether a certain method was called.
```java
verify(mockedList).get(0);
```
### Example Code
Here’s a sample test case using Mockito:  
```java
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

public class MockitoExampleTest {

    @Test
    public void testListMocking() {
        List<String> mockList = mock(List.class);

        // Stubbing
        when(mockList.get(0)).thenReturn("Hello");
        when(mockList.size()).thenReturn(1);

        // Assertions
        assertEquals("Hello", mockList.get(0));
        assertEquals(1, mockList.size());

        // Verification
        verify(mockList).get(0);
    }
}
```
## Advanced Mockito Usage

### Argument Matchers
```java
when(mockList.get(anyInt())).thenReturn("Any value");
```
### Throwing Exceptions
```java
when(mockList.get(1)).thenThrow(new RuntimeException("Error!"));
```
### @Mock and @InjectMocks Annotations
Instead of manually creating mocks, you can use annotations with MockitoAnnotations.openMocks(this) in the @Before setup method.

```java
public class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }
}
```
## Best Practices
- Mock only external dependencies, not the class under test
- Keep tests focused and isolated
- Use `@InjectMocks` to simplify dependency injection in tests
- Verify only necessary interactions
- Avoid overusing mocks, as it can lead to brittle tests

## Running Tests
**In IDE:** Right-click the test class → Run Test

**Maven:**
```bash
mvn test
```
**Gradle:**
```bash
gradle test
```
## References
- [Mockito Official Documentation](https://site.mockito.org/)
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [Baeldung Mockito Tutorial](https://www.baeldung.com/mockito-series)

---

**Author:** Priyadharshini NRS  
**Superset ID:** 6390103  
**Email:** [priyadharshininrs@gmail.com](mailto:priyadharshininrs@gmail.com)  
**LinkedIn:** [www.linkedin.com/in/priyadharshininrs](https://www.linkedin.com/in/priyadharshininrs)

