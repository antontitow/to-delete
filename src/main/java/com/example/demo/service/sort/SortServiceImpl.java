package com.example.demo.service.sort;

import com.example.demo.config.SortConfig;
import com.example.demo.sorting.Sort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SortServiceImpl implements SortService {
    private final SortConfig sortConfig;

    @Override
    public int[] sort(Sort.SortType type, int[] toSortArray) {
        return sortConfig.getSorters().get(type).sort(toSortArray);
    }
}
