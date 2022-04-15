package com.example.template.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TestService {

    public String get(){
        return "Hello Worlddddd";
    }
}
