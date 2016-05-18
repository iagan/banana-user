package org.ithinking.banana.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author fuchujian
 */
@SpringBootApplication
@ComponentScan(basePackages = "org.ithinking.banana")
@EnableAutoConfiguration
@ImportResource("classpath:META-INF/spring/dubbo-user-consumer.xml")
public class Provider {
    public static void main(String[] args) {
        SpringApplication.run(Provider.class, args);
    }
}
