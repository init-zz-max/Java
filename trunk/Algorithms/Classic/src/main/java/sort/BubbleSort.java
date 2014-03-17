package sort;

/**
 * Created by mzavgorodny on 3/7/14.
 */
public class BubbleSort {


    public static int[] sort(int[] inputArray) {
        int tmp;
        for (int i = 0; i < inputArray.length; i++) {
            for (int x = 0; x < (inputArray.length - 1); x++) {
                if (inputArray[x] > inputArray[x + 1]) {
                    tmp = inputArray[x + 1];
                    inputArray[x + 1] = inputArray[x];
                    inputArray[x] = tmp;
                }
            }
        }
        return inputArray;
    }


}
