package com.auto;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AutomobileOrg extends SpringBootServletInitializer {

    @GetMapping(value = "/hi", produces = MediaType.APPLICATION_JSON_VALUE)
    public String dummyAPI() {
        return "Welcome to the automobile application";
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AutomobileOrg.class);
    }
//    public static void main(String[] args) {
//        SpringApplication.run(AutomobileOrg.class, args);
//    }

}
