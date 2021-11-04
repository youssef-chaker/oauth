package com.example.oauthapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OauthApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthApiGatewayApplication.class, args);
    }

}
