package com.example.demo.controller;

import com.example.demo.domain.RequestSort;
import com.example.demo.service.sort.SortService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/sort")
@RequiredArgsConstructor
public class SortController {
    private final SortService sortService;

    @PostMapping
    public int[] doSorting(@RequestBody RequestSort request) {
        return sortService.sort(request.type(), request.toSortArray());
    }
}
