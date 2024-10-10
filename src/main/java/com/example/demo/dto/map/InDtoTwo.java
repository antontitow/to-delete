package com.example.demo.dto.map;

import org.springframework.stereotype.Component;

@Component
public class InDtoTwo extends InDto {
    public String name = "two";

    @Override
    public String show() {
//        System.out.println("InDtoTwo");
        return "InDtoTwo";
    }
}
