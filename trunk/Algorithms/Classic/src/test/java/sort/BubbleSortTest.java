package sort;

import org.junit.Test;
import sort.BubbleSort;

/**
 * Created by mzavgorodny on 3/7/14.
 */
public class BubbleSortTest {

    @Test
    public void testSort() {
        int[] intArray = new int[]{5, 90, 35, 45, 150, 3};
        int[] res = BubbleSort.sort(intArray);

        printArray(res);
    }

    private void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

    }

}
