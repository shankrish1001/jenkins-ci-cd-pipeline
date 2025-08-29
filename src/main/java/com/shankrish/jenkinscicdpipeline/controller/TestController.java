package com.shankrish.jenkinscicdpipeline.controller;

import com.shankrish.jenkinscicdpipeline.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    private final TestService testService;
    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test1")
    public ResponseEntity<String> showTest11() {

        return ResponseEntity.ok(testService.getText11("aa"));

    }

    @GetMapping("/test2")
    public ResponseEntity<String> showTest22() {

        return ResponseEntity.ok(testService.getText22("bbbb"));

    }

}
