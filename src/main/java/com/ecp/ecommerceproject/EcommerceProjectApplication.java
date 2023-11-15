package com.ecp.ecommerceproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.ecp.ecommerceproject.model"})
public class EcommerceProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceProjectApplication.class, args);
    }



}
