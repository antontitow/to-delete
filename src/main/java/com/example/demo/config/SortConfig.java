package com.example.demo.config;

import com.example.demo.sorting.Sort;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

@Configuration
@RequiredArgsConstructor
public class SortConfig {
    private final List<Sort> sortsList;

    @Bean
    public Map<Sort.SortType, Sort> getSorters() {
        return sortsList.stream().collect(toMap(Sort::getType, Function.identity()));
    }

}
