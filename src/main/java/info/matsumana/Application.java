package info.matsumana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Jsr330ScopeMetadataResolver;

@EnableAutoConfiguration
@ComponentScan(basePackages = "info.matsumana", scopeResolver = Jsr330ScopeMetadataResolver.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
