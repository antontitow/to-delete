package com.example.demo.sorting;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class QuickSort extends Sort {
    private int count;

    @Override
    public SortType getType() {
        return SortType.QUICK;
    }

    @Override
    public int[] sort(int[] array) {
        quickSort(array, 0, array.length - 1);


        log.info("Count input values: {}", array.length);
        log.info("Count iterations: {}", count);
        return array;
    }

    private void quickSort(int[] array, int low, int high) {
        if (array.length == 0 || low >= high) return;

        int middleIndex = low + (high - low) / 2;
        System.out.println("middleIndex" + middleIndex);
        int middle = array[middleIndex];
        int i = low;
        int j = high;
        while (i <= j) {
            while (array[i] < middle) i++;
            while (array[j] > middle) j--;
            if (i <= j) {
                commitIteration();
                int swap = array[i];
                array[i] = array[j];
                array[j] = swap;
                i++;
                j--;
            }
        }
        if (low < j) quickSort(array, low, j);
        if (high > i) quickSort(array, i, high);
    }

    @Override
    public Integer countIteration() {
        return count;
    }

    protected void commitIteration() {
        count++;
    }
}
