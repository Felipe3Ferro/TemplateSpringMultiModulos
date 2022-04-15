package com.example.template.controller.v1;

import com.example.template.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/test")
public class TestController {

    private final TestService testService;

    @GetMapping
    public String test(){
        return testService.get();
    }

}
