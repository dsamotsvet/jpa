package com.dsamotsvet.edu.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.dsamotsvet.edu.repository")
@EntityScan("com.dsamotsvet.edu.entity")
@ComponentScan({"com.dsamotsvet.edu.service", "com.dsamotsvet.edu.controller"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}