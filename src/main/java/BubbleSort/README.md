# BubbleSort Algorithm

Write a code to take an array of ints and, using the bubble sort algorithm, return the array with its elements stored in
ascending order.

## Project Description

A simple Java program which contains a method for returning an array sorted using the BubbleSort algorithm and a method
which merges two sorted arrays into one larger sorted array.

### Executing Program

The program runs on a CLI - can be run on any Java IDE.

## Explanation of Code

The following segment of code shows the main class. An instance of the BubbleSort class is created, and the various
methods are called.

```
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
```

The following segment of code shows the first method in the BubbleSort class. It takes in an int array and sorts it
using the BubbleSort algorithm.

```
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
```

The following method contains the implementation for merging two sorted arrays into one larger sorted array. The initial
sortArray() method is called from within the mergeSortedArrays() method. This returns the larger sorted array to the
main method.

```
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

```

The final segment of code below shows the implementation of two JUnit tests, written to test the two methods explained
above.

```
public class BubbleSortTest {

    @Test
    @DisplayName("Given an array of numbers (ints), result returns sorted array")
    public void GivenIntsArray_ReturnsSortedArray() {

        BubbleSort bubbleSort = new BubbleSort();

        int[] array = {10, 4, 26, 29, 100, 52, 111, 1, 17, 19};
        int[] array2 = {67, 41, 22, 49, 10, 2, 11, 21, 13, 14};
        int[] array3 = {20, 34, 16, 9, 7, 3, 15, 73, 47, 39};

        int[] expectedResult = {1, 4, 10, 17, 19, 26, 29, 52, 100, 111};
        int[] expectedResult2 = {2, 10, 11, 13, 14, 21, 22, 41, 49, 67};
        int[] expectedResult3 = {3, 7, 9, 15, 16, 20, 34, 39, 47, 73};

        assertArrayEquals(expectedResult, bubbleSort.sortArray(array));
        assertArrayEquals(expectedResult2, bubbleSort.sortArray(array2));
        assertArrayEquals(expectedResult3, bubbleSort.sortArray(array3));

    }

    @Test
    @DisplayName("Given two array of numbers (ints), result returns a merged & sorted array")
    public void GivenTwoIntsArrays_ReturnsMergedArray() {

        BubbleSort bubbleSort = new BubbleSort();

        int[] array = {23, 1, 7, 12, 8, 2, 10, 31};
        int[] array2 = {10, 4, 26, 29, 100, 52, 111, 1, 17, 19};

        int[] expectedResult = {1, 1, 2, 4, 7, 8, 10, 10, 12, 17, 19, 23, 26, 29, 31, 52, 100, 111};

        assertArrayEquals(expectedResult, bubbleSort.mergeSortedArrays(array, array2));

    }

}
```

## End of Document
