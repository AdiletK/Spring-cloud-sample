package com.kadyrbekov.guestsservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GuestsServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuestsServicesApplication.class, args);
    }

}
