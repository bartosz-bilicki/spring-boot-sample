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
        //given
        URL url = new URL("http://dummy.url");

        //when service is constructed
        PropertiesService sut=new PropertiesService(1,
                url);

        //then it may be used
    }
}