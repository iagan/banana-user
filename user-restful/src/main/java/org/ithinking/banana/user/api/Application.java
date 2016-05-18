package org.ithinking.banana.user.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author fuchujian
 */
@SpringBootApplication
@ComponentScan(basePackages = "org.ithinking.banana")
@EnableAutoConfiguration
public class Application {
    /**
     * WebApplicationInitializer
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
