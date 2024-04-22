package com.abdielreyes.first_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    // connect dependency
    @Autowired
    Laptop laptop;

    public void code() {
        laptop.compile();
    }
}
