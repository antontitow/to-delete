package com.example.demo.scope;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ForInjectBean2 implements ForInject {

    @Override
    public void show() {
        System.out.println("show2");
    }
}
