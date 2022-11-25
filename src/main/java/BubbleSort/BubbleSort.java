package BubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public int[] sortArray(int[] array) {

        int arraySize = array.length;

        if (arraySize != 0) {
            // outer for loop iterates over each element in the array
            for (int i = 0; i < arraySize - 1; i++) {
                // inner loop compares the elements
                for (int j = 0; j < (arraySize - i - 1); j++) {
                    // elements are compared with their succeeding ones and swapped if they are not in the right order
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        } else {
            System.out.println("The array is empty!");
        }

        return array;

    }

    public int[] mergeSortedArrays(int[] array1, int[] array2) {

        int sizeOfArray1 = array1.length;

        int sizeOfArray2 = array2.length;

        int totalSizeArray = sizeOfArray1 + sizeOfArray2;

        int[] mergedArray = new int[totalSizeArray];

        for (int i = 0; i < sizeOfArray1; i++) {
            mergedArray[i] = array1[i];
        }

        int index = 0;

        for (int i = sizeOfArray1; i < totalSizeArray; i++) {
            mergedArray[i] = array2[index];
            index++;
        }

        return sortArray(mergedArray);

    }
}
