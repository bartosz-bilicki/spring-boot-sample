package hello;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.lang.invoke.MethodHandles;
import java.net.URL;

@Service
public class PropertiesService {
    private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public PropertiesService(
            @Value("${dummy.number}") int number,
            @Value("${dummy.url}") URL url) {
        LOG.info("number {} url {}",number,url);

    }
}
