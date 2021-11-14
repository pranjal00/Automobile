package com.auto.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoController {
    @GetMapping(value = "/hi/{name}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String dummyAPI(@PathVariable(name = "name") String userName) {
        return "Hi.. " + userName + "!.. Welcome to the automobile application";
    }
}
