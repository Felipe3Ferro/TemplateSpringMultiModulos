package com.example.template.contract.v1.test;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/test")
public class TestController {

    @GetMapping
    public String test(){
        return "";
    }

}
