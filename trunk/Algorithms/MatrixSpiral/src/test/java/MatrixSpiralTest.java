import org.junit.Test;

/**
 * Created by mzavgorodny on 2/17/14.
 */
public class MatrixSpiralTest {

    public static String matrix3x4[][] = {
            {"1", "2", "3"},

            {"10", "11", "4"},

            {"9", "12", "5"},

            {"8", "7", "6"},
    };

    public static String matrix5x5[][] = {
            {"1", "2", "3", "4", "5"},

            {"16", "17", "18", "19", "6"},

            {"15", "24", "25", "20", "7"},

            {"14", "23", "22", "21", "8"},

            {"13", "12", "11", "10", "9"},
    };


    @Test
    public void testCheckResultGame() {
        MatrixSpiral matrixSpiral = new MatrixSpiral();
        matrixSpiral.spiralExecution(matrix5x5);
        //matrixSpiral.spiralExecution(matrix3x4);
    }

}
