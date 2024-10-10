package com.example.demo.domain;

import com.example.demo.sorting.Sort;

public record RequestSort(Sort.SortType type,
                          int[] toSortArray) {
}
