package hello;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class PropertiesServiceTest {

    @Test
    public void anotherProperties() throws MalformedURLException {
        URL url = new URL("http://dummy.url");
        PropertiesService sut=new PropertiesService(1,url);
    }
}