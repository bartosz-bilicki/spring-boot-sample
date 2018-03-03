package hello.propereties;

import hello.properties.PropertiesService;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Spring-free, pure junit test.
 */
public class PropertiesServiceTest {

    @Test
    public void anotherProperties() throws MalformedURLException {
        URL url = new URL("http://dummy.url");
        PropertiesService sut=new PropertiesService(1,url);
    }
}