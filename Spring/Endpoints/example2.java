package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Simple variable update through post method (new String value added in http body - postman)
    private static String SENTENCE = "this variable needs to get updated soon";
    @RequestMapping(value = "/showSentence", method = RequestMethod.GET)
    public String showSentence() {
        return SENTENCE;
    }

    @RequestMapping(value = "/update/SENTENCE", method = RequestMethod.POST)
    public void updateSentence(@RequestBody String UpdatedSentence) {
        SENTENCE = UpdatedSentence;
    }
}
