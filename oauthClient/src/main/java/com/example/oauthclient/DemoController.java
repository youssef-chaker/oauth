package com.example.oauthclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/client")
@Slf4j
public class DemoController {

    @Autowired
    OAuth2AuthorizedClientService oAuth2AuthorizedClientService;

    RestTemplate restTemplate = new RestTemplate();

//    @Autowired
//    WebClient webClient;

    @GetMapping
    public String get(@AuthenticationPrincipal OidcUser principal){
//        OAuth2AuthenticationToken oauthToken = (OAuth2AuthenticationToken)SecurityContextHolder.getContext().getAuthentication();
//        OAuth2AuthorizedClient oauth2Client = oAuth2AuthorizedClientService.loadAuthorizedClient(oauthToken.getAuthorizedClientRegistrationId(),oauthToken.getName());
//        String access_token = oauth2Client.getAccessToken().getTokenValue();
//        log.info("access_token : "+access_token);
//        log.info("principal : "+principal);
//        String url = "http://localhost:8080/users/status/check";
//        var headers = new HttpHeaders();
//        headers.add("Authorization","Bearer "+access_token);
//
//        ResponseEntity<String> responseEntity =restTemplate.exchange(url, HttpMethod.GET,new HttpEntity<>(headers),String.class);
//        var response = responseEntity.getBody();
//
////        var response = webClient.get().uri(url).retrieve().bodyToMono(String.class).block();
//
//        return response;


        return "client";
    }
}
