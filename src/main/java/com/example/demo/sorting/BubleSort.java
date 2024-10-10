package com.example.demo.sorting;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;


@Component
@Slf4j
public class BubleSort extends Sort {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public SortType getType() {
        log.info("""                
                O(n²)
                Example:
                {
                    "type": "BUBLE",
                    "toSortArray": [
                        2,
                        3,
                        7,
                        1,
                        1,
                        6
                    ]
                }
                Return: [1,1,2,3,6,7]
                """);
        return SortType.BUBLE;
    }

    @Override
    public int[] sort(int[] array) {
        for (int k = array.length; k > 0; k--) {
            for (int i = 0; i < k - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i);
                    commitIteration();
                }
            }
        }
        log.info("Count input values: {}", array.length);
        log.info("Count iterations: {}", count.get());
        return array;
    }

    private void commitIteration() {
        count.incrementAndGet();
    }

    @Override
    public AtomicInteger countIteration() {
        return count;
    }

    private void swap(int[] arr, int pos1) {
        int pos2 = pos1 + 1;
        int tmp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = tmp;
    }
}
