package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoHateDto extends RepresentationModel<NoHateDto> {
    private String who;
    private String what;
    private String why;
}
