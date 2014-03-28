package search;

/**
 * Created by mzavgorodny on 3/17/14.
 */
public class BinarySearch {

    public int searchPosition(int array[], int search) {

        int first = 0;
        int last = array.length - 1;
        int middle = (first + last) / 2;

        while (first <= last) {

            if (array[middle] > search) {
                last = middle - 1;
            } else if (array[middle] < search) {
                first = middle + 1;
            }

            if (array[middle] == search) {
                return middle;
            }

            middle = (first + last) / 2;
        }
        return -1;
    }
}
