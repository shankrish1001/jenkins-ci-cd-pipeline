package com.shankrish.jenkinscicdpipeline.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test1")
    public ResponseEntity<String> showTest11() {
        return ResponseEntity.ok("test 1111");
    }

    @GetMapping("/test2")
    public ResponseEntity<String> showTest22() {
        return ResponseEntity.ok("test 2222");
    }

}
