package com.sparta;

import BubbleSort.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] emptyArray = {};

        int[] array = {23, 1, 7, 12, 8, 2, 10, 31};

        int[] array2 = {10, 4, 26, 29, 100, 52, 111, 1, 17, 19};

        BubbleSort bubbleSort = new BubbleSort();

        System.out.println(Arrays.toString(bubbleSort.sortArray(array)));

        System.out.println(Arrays.toString(bubbleSort.sortArray(array2)));

        System.out.println(Arrays.toString(bubbleSort.mergeSortedArrays(array, array2)));

    }
}