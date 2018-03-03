package hello.properties;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.lang.invoke.MethodHandles;
import java.net.URL;

//Spring dependencies only in business logic
@Service
public class PropertiesService {
    private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    //from properties file. Type conversion build-in!
    public PropertiesService(
            @Value("${dummy.number}") int number,
            @Value("${dummy.url}") URL url) {
        LOG.info("number {} url {} duration {}",number,url);

    }
}
