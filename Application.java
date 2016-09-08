package net.pricefx.integration;

import org.apache.camel.spring.boot.FatJarRouter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ImportResource({"classpath*:camel-context.xml"})
public class Application extends FatJarRouter {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }
}