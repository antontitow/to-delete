package com.example.demo.config;

import com.example.demo.dto.map.InDto;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

@Configuration
@RequiredArgsConstructor
public class IntDtoConfig {
    private final List<InDto> list;

    @Bean
    public Map<String, InDto> inDtoMap() {
        return list.stream().collect(toMap(InDto::show, Function.identity()));
    }
}
