package hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Application {

    /*
    entry point for spring app. always the same.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    //optional, could we used for batch jobs
    @Bean
    public CommandLineRunner commandLineRunner(ConfigurableApplicationContext ctx) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                System.out.println("Let's inspect the beans provided by Spring Boot:");
                String[] beanNames = ctx.getBeanDefinitionNames();
                Arrays.sort(beanNames);
                for (String beanName : beanNames) {
                    System.out.println(beanName);
                }
                // if you want to exit application after the job
                //ctx.close();
            }
        };
    }

}
