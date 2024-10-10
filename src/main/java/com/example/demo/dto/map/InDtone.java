package com.example.demo.dto.map;

import org.springframework.stereotype.Component;

@Component
public class InDtone extends InDto {
    public String name = "One";

    @Override
    public String show() {
        System.out.println("InDtone");
        return "InDtone";
    }
}
