
/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 12.11.13
 * Time: 21:18
 * To change this template use File | Settings | File Templates.
 */
public class MatrixSpiral {

    public void spiralExecution(String[][] matrix) {

        int rows = matrix.length - 1;
        int columns = matrix[0].length - 1;

/*
        {"1",  "2",  "3",  "4",  "5"},

        {"16", "17", "18", "19", "6"},

        {"15", "24", "25", "20", "7"},

        {"14", "23", "22", "21", "8"},

        {"13", "12", "11", "10", "9"},
        */

        for (int i = 0; i < rows; i++) {
            printRow(matrix, i, columns - i);
            printColumn(matrix, i, rows - i);
            printRowBack(matrix, columns - i, i);
            printColumnUp(matrix, columns - i, i);
        }

    }

    private void printRow(String[][] matrix, int startColumnt, int endColumnt) {
        for (int i = startColumnt; i <= endColumnt; i++) {
            System.out.println(matrix[startColumnt][i]);
        }
    }

    private void printColumn(String[][] matrix, int startRow, int endRow) {
        for (int j = startRow + 1; j <= endRow; j++) {
            System.out.println(matrix[j][endRow]);
        }
    }

    private void printRowBack(String[][] matrix, int startColumnt, int endColumnt) {
        for (int j = startColumnt - 1; j >= endColumnt; j--) {
            System.out.println(matrix[startColumnt][j]);
        }
    }

    private void printColumnUp(String[][] matrix, int startRow, int endRow) {
        for (int j = startRow - 1; j > endRow; j--) {
            System.out.println(matrix[j][endRow]);
        }
    }

}
