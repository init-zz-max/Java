package sort;

import org.junit.Test;

/**
 * Created by mzavgorodny on 3/7/14.
 */
public class QuickSortTest {

    @Test
    public void testSort() {
        int[] intArray = new int[]{5, 90, 35, 45, 150, 3};
        int[] res = BubbleSort.sort(intArray);

//        printArray(res);
    }


    @Test
    public void testTemerature() {
        int[] intArray = new int[]{5, 90, 35, 1, 1, 3};
                                 //1, 2,  1,


        int[] res = BubbleSort.sort(intArray);

//      printArray(res);
    }


}
