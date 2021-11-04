package com.example.oauthclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class OauthClientApplication {

//    @Bean
//    public WebClient webClient(ClientRegistrationRepository clientRegistrationRepository,
//                               OAuth2AuthorizedClientRepository oAuth2AuthorizedClientRepository){
//        ServletOAuth2AuthorizedClientExchangeFilterFunction oauth2 = new ServletOAuth2AuthorizedClientExchangeFilterFunction(clientRegistrationRepository,oAuth2AuthorizedClientRepository);
//        oauth2.setDefaultOAuth2AuthorizedClient(true);
//        return WebClient.builder().apply(oauth2.oauth2Configuration()).build();
//    }

    public static void main(String[] args) {
        SpringApplication.run(OauthClientApplication.class, args);
    }

}
