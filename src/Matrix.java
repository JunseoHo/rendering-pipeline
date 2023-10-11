public class Matrix {

    public static double[][] multiplication(double[][] m1, double[][] m2) {
        int m1Rows = m1.length;
        int m1Cols = m1[0].length;
        int m2Cols = m2[0].length;
        double[][] result = new double[m1Rows][m2Cols];
        for (int i = 0; i < m1Rows; i++)
            for (int j = 0; j < m2Cols; j++)
                for (int k = 0; k < m1Cols; k++)
                    result[i][j] += m1[i][k] * m2[k][j];
        return result;
    }

}
