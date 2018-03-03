package hello.propereties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/*
Spring integration test. read properties value from application-wrongProperties.properties file
 */
@ActiveProfiles("wrongProperties")
@SpringBootTest
@RunWith(SpringRunner.class)
public class ApplicationWrongPropertiesTest {

    /*
  when property value has invalid type
  Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException:
  Error creating bean with name 'propertiesService' defined in file [..PropertiesService.class]: Unsatisfied dependency expressed through constructor parameter 0;
  nested exception is org.springframework.beans.TypeMismatchException:
  Failed to convert value of type 'java.lang.String'
  to required type 'int';
  nested exception is java.lang.NumberFormatException:
   For input string: "notanumber"
   */
    @Test
    public void shouldNotStart() {}

}