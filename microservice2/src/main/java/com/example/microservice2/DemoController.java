package com.example.microservice2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("microservice2")
public class DemoController {
    @GetMapping
    public String get(){
        return "microservice2";
    }
}
