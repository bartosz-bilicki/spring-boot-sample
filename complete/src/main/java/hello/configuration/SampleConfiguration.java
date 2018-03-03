package hello.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfiguration {

    //Spring beans from annotation-free classes
    @Bean
    public PojoService pojoService() {
        return new PojoService();
    }

    //parameters in @Beans are resolved
    @Bean
    public PojoService2 pojoService2(PojoService pojoService) {
        return new PojoService2(pojoService);
    }
}
