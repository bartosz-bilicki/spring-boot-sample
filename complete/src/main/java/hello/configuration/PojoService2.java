package hello.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

class PojoService2 {
    private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    private final PojoService pojoService;

    public PojoService2(PojoService pojoService) {
        this.pojoService = pojoService;
    }

    public void hello2() {
        LOG.info("service2 calling service {}", pojoService.service());
    }
}
