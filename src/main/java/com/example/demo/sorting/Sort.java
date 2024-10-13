package com.example.demo.sorting;

public abstract class Sort {


    public abstract SortType getType();

    public abstract int[] sort(int[] array);

    public abstract Integer countIteration();

    public enum SortType {
        BUBLE,
        SELECTION,
        INSERTION,
        QUICK
    }

    protected void swap(int[] arr, int pos1) {
        int pos2 = pos1 + 1;
        int tmp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = tmp;
    }

    protected void swap(int[] array, int last, int k) {
        int tmp = array[k];
        array[k] = array[last];
        array[last] = tmp;
    }

    protected abstract void commitIteration();
}
