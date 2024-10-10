package com.example.demo.dto.map;

import org.springframework.stereotype.Component;

@Component
public class InDtoThree extends InDto {
    public String name = "three";

    @Override
    public String show() {
        System.out.println("InDtoThree");
        return "InDtoThree";
    }
}
