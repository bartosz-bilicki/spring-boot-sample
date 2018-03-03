package hello.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfiguration {

    @Bean
    public PojoService pojoService() {
        return new PojoService();
    }

    @Bean
    public PojoService2 pojoService2(PojoService pojoService) {
        return new PojoService2(pojoService);
    }
}
