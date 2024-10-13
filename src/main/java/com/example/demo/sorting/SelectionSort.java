package com.example.demo.sorting;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class SelectionSort extends Sort {
    private int count;

    @Override
    public SortType getType() {
        log.info("""                
                O(n²)
                Example:
                {
                    "type": "SELECTION",
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
        return SortType.SELECTION;
    }

    @Override
    public int[] sort(int[] array) {
        count = 0;
        for (int k = array.length; k > 0; k--) {
            int last = k - 1;
            for (int i = 0; i < k - 2; i++) {
                if (array[i] > array[last]) {
                    last = i;
                }
                commitIteration();
            }
            swap(array, last, k - 1);
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
