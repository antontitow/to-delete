package com.example.demo.scope;

import org.springframework.stereotype.Component;

@Component
public class ForInjectBean implements ForInject {

    @Override
    public void show() {
        System.out.println("show");
    }
}
