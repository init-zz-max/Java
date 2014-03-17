package search;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mzavgorodny on 3/17/14.
 */
public class BinarySearchTest extends TestCase {

    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void testSearchPosition() {
        int[] arr0 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 0; i < arr0.length; i++) {
            System.out.print(binarySearch.searchPosition(arr0, i) + ", ");
        }

        int[] arr2 = {1, 21, 32, 42, 54, 65, 71, 82, 95, 110};

        int elPosition42 = binarySearch.searchPosition(arr2, 42);
        int elPosition110 = binarySearch.searchPosition(arr2, 110);
        int elPosition1 = binarySearch.searchPosition(arr2, 1);

        Assert.assertTrue(arr2[elPosition42] == 42);
        Assert.assertTrue(arr2[elPosition110] == 110);
        Assert.assertTrue(arr2[elPosition1] == 1);
    }
}
