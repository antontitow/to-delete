package com.example.demo.controller;

import com.example.demo.HateDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@Slf4j
@RestController
@RequestMapping("yf")
@RequiredArgsConstructor
public class HateosController {
//
//    String string1 = "rfmrkm";
//    String string2 = "rfkrmm";
//
//    boolean checkAnagram(String string1, String string2) {
//        List<Character> chars1 = string1.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
//        List<Character> chars2 = string2.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
//        if (chars1.size() != chars2.size()) {
//            return false;
//        }
//        chars2.stream().forEach(character -> {
//            if (chars1.contains(character)) {
//                chars1.remove(character);
//            }
//        });
//        return chars1.isEmpty();
//    }

    //    @Autowired
//    @Lazy
//    private final ForInject forInjectBean2;
//
//    //    @Setter(onMethod = @__({@Autowired}))
//    private final ForInject forInjectBean;
//
//    public HateosController(@Lazy ForInject forInjectBean2, ForInject forInjectBean, MessageSource messageSource) {
//        this.forInjectBean2 = forInjectBean2;
//        this.forInjectBean = forInjectBean;
//        this.messageSource = messageSource;
//    }

//    void changeInjection() {
//        System.out.println("nope");
////        this.forInjectBean = new ForInjectBean2();
//    }

    @Autowired
    MessageSource messageSource;


//    @GetMapping("/df")
//    public HateDto gtHatr() {
//        System.out.println(checkAnagram(string1, string2));
//        forInjectBean.show();
//        changeInjection();
//        forInjectBean2.show();
//        return new HateDto();
//    }

    @GetMapping("/nf")
    public HateDto gtHatr() {
        return new HateDto();
    }

    @GetMapping("/checkLocale")
    public String checkLocale() {
        log.warn("check locale");
        return messageSource.getMessage("i.hate.you.message", null, Locale.US);
    }

//    @GetMapping("/nf")
//    public NoHateDto gtnr() {
//        val noHate = new NoHateDto("I", "no hate you", "just");
//        noHate.add(linkTo(methodOn(HateosController.class)
//                        .gtnr())
//                        .withSelfRel(),
//                linkTo(methodOn(HateosController.class).gtnr()).withRel("ONi")
//
//        );
//        return noHate;
//    }
}
