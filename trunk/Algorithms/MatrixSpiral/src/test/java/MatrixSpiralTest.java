import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mzavgorodny on 2/17/14.
 */
public class MatrixSpiralTest {


    public static String matrix5x5[][] = {
            {"1", "2", "3", "4", "5"},

            {"16", "17", "18", "19", "6"},

            {"15", "24", "25", "20", "7"},

            {"14", "23", "22", "21", "8"},

            {"13", "12", "11", "10", "9"},
    };


    public static String res = "12345678910111213141516171819202122232425";

    @Test
    public void testCheckResultGame() {
        MatrixSpiral matrixSpiral = new MatrixSpiral();
        Assert.assertTrue(matrixSpiral.spiralExecutionFast(matrix5x5, 5).equals(res));
    }

}
