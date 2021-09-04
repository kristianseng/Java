package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Simple variable update through post method (added in body segment in postman)
    private static String SENTENCE = "this variable needs to get updated soon";
    private final String propertySentence;

    @Autowired
    public DemoController(@Value("${demo.sentence}") String propertySentence) {
        this.propertySentence = propertySentence;
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String showSentence() {
        return propertySentence;
    }
}
