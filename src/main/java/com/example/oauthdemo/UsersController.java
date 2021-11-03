package com.example.oauthdemo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping("/status/check")
    public String status(){
        return "working";
    }

    @PreAuthorize("hasAuthority('ROLE_dev') && #id == #jwt.subject" )
    @GetMapping("/{id}")
    public String test(@PathVariable String id , @AuthenticationPrincipal Jwt jwt){
        return "test";
    }

//    @PreAuthorize("hasAuthority('ROLE_dev') && #id == authentication.principal.subject" )
//    @GetMapping("/{id}")
//    public String test(@PathVariable String id ){
//        return "test";
//    }

}
