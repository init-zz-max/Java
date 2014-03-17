package search;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by mzavgorodny on 3/17/14.
 */
public class LinerSearchTest {

    private LinerSearch linerSearch = new LinerSearch();

    @Test
    public void testSearchPosition() {
        int[] arr0 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr1 = {1, 15, 2, 33, 3, 4, 78, 51, 69, 7, 8, 9, 11};

        org.junit.Assert.assertTrue(linerSearch.searchPosition(arr0, 3) == 3);
        org.junit.Assert.assertTrue(linerSearch.searchPosition(arr1, 15) == 2);
    }
}
