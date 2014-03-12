/**
 * Created by mzavgorodny on 3/7/14.
 */
public class PrimeNumbers {

    public static void main(String args[]) {
        for (int i = 2; i < 100; ++i) {
            if (checkPrimeNumber(i)) {
                System.out.print("," + i);
            }
        }
    }

    private static boolean checkPrimeNumber(int num) {
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
