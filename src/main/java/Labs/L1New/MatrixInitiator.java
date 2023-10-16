package Labs.L1New;

import java.util.Random;

public  class MatrixInitiator {
    public static void FillMatrix(IMatrix matrix, int nonZeroCount, int maxValue) throws Exception {
        Random rnd = new Random();
        int curCount = 0;
        if (nonZeroCount > matrix.GetRowsCount() * matrix.GetColsCount())
        {
            throw new Exception("Число элементов больше числа элементов в матрице!");
        }
        for (int i = 0; i < matrix.GetRowsCount(); i++)
        {
            for (int j = 0; j < matrix.GetColsCount(); j++)
            {
                curCount++;
                if (curCount > nonZeroCount) { return; }
                matrix.SetElementInVector(i,j,rnd.nextInt(1, maxValue));
            }
        }
    }
}
