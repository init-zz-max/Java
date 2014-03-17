package search;

/**
 * Created by mzavgorodny on 3/17/14.
 */
public class LinerSearch {

    public int searchPosition(int array[], int elem){
        for(int i=0; i<array.length; i++) {
            if(array[i] == elem){
                return i+1;
            }

        }
        return -1;
    }
}
