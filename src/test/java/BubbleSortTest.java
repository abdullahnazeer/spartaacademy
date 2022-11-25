import BubbleSort.BubbleSort;
import com.sparta.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

}
