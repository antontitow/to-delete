package com.example.demo.sorting;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Sort {

    public abstract SortType getType();


    public abstract int[] sort(int[] array);

    public abstract AtomicInteger countIteration();

    public enum SortType {
        BUBLE
    }
}
