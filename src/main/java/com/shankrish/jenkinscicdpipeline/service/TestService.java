package com.shankrish.jenkinscicdpipeline.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String getText11(String in) {
        return "It is from - TestService - getText11 - "+in;
    }

    public String getText22(String in) {
        return "It is from - TestService - getText22 - "+in;
    }


}
