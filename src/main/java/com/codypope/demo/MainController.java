package com.codypope.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Value("${greeting}")
    private String greeting;

    @GetMapping("/")
    public String index() {
        return greeting;
    }

}