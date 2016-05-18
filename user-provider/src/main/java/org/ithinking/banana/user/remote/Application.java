package org.ithinking.banana.user.remote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author fuchujian
 */
@SpringBootApplication
@ComponentScan(basePackages = "org.ithinking.banana.user")
@EnableAutoConfiguration
@ImportResource("classpath:META-INF/spring/dubbo-user-provider.xml")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
