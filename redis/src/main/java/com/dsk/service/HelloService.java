package com.dsk.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getName() {
        return "hello";
    }
}