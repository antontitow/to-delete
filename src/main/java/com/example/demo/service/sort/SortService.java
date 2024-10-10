package com.example.demo.service.sort;

import com.example.demo.sorting.Sort;

public interface SortService {
    int[] sort(Sort.SortType type, int[] toSortArray);
}
