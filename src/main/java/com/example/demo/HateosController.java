package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Slf4j
@RestController(value = "dom")
public class HateosController {

    @Autowired
    MessageSource messageSource;

    @GetMapping("/df")
    public HateDto gtHatr(){

        return new HateDto("I", "hate you", "just");
    }

    @GetMapping("/checkLocale")
    public String checkLocale(){
        log.warn("check locale");
        return messageSource.getMessage("i.hate.you.message", null, Locale.US);
    }

    @GetMapping("/nf")
    public NoHateDto gtnr(){
        val noHate = new NoHateDto("I", "no hate you", "just");
        noHate.add(linkTo(methodOn(HateosController.class)
                            .gtnr())
                .withSelfRel(),
                linkTo(methodOn(HateosController.class).gtnr()).withRel("ONi")

        );
        return noHate;
    }
}
