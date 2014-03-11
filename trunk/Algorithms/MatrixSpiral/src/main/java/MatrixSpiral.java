
/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 12.11.13
 * Time: 21:18
 * To change this template use File | Settings | File Templates.
 */
public class MatrixSpiral {


    /*public static String matrix5x5[][] = {
            {"1",  "2",  "3",  "4",  "5"},

            {"16", "17", "18", "19", "6"},

            {"15", "24", "25", "20", "7"},

            {"14", "23", "22", "21", "8"},

            {"13", "12", "11", "10", "9"},
    };
*/

    public String spiralExecutionFast(String[][] matrix, int size) {
        StringBuilder res = new StringBuilder();

        size = size - 1;
        for (int i = 0; i < size / 2 + 1; i++) {
            //printRow
            for (int j = i; j <= size - i; j++) {
                System.out.println(matrix[i][j]);
                res.append(matrix[i][j]);
            }

            //printColumn
            for (int j = i + 1; j <= size - i; j++) {
                System.out.println(matrix[j][size - i]);
                res.append(matrix[j][size - i]);
            }

            // printRowBack
            for (int j = size - i - 1; j >= i; j--) {
                System.out.println(matrix[size - i][j]);
                res.append(matrix[size - i][j]);
            }

            //printColumnUp
            for (int j = size - i - 1; j >= i + 1; j--) {
                System.out.println(matrix[j][i]);
                res.append(matrix[j][i]);
            }
        }
        return res.toString();
    }

}
