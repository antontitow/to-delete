package com.example.demo.sorting;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BubleSort extends Sort {
    private Integer count;

    @Override
    public SortType getType() {
        return SortType.BUBLE;
    }

    @Override
    public int[] sort(int[] array) {
        count = 0;
        boolean needSort = true;
        while (needSort) {
            needSort = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    swap(array, i);
                    needSort = true;
                }
                commitIteration();
            }
        }
        log.info("Count input values: {}", array.length);
        log.info("Count iterations: {}", count);
        return array;
    }

    @Override
    public Integer countIteration() {
        return count;
    }

    protected void commitIteration() {
        count++;
    }


}
