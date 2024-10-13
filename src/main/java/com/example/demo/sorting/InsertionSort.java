package com.example.demo.sorting;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class InsertionSort extends Sort {
    private int count;

    @Override
    public SortType getType() {
        return SortType.INSERTION;
    }

    @Override
    public int[] sort(int[] array) {
        count = 0;
        for (int i = 1; i < array.length; i++) {
            int memory = array[i];
            int j = i;
            for (; j > 0; j--) {
                commitIteration();
                if (array[j - 1] > memory) {
                    array[j] = array[j - 1];
                } else {
                    break;
                }
            }
            array[j] = memory;
        }
        log.info("Count input values: {}", array.length);
        log.info("Count iterations: {}", count);
        return array;

    }

    protected void commitIteration() {
        count++;
    }

    @Override
    public Integer countIteration() {
        return count;
    }
}
