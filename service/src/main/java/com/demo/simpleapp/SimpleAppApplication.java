package com.demo.simpleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(
        exclude = UserDetailsServiceAutoConfiguration.class,
        scanBasePackages = {
                "com.demo.simpleapp.api",
                "com.demo.simpleapp.jwt",
                "com.demo.simpleapp.transaction",
                "com.demo.simpleapp.service"
        }
)
public class SimpleAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleAppApplication.class, args);
    }

}
