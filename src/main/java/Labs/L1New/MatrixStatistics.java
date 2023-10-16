package Labs.L1New;

public class MatrixStatistics {
    IMatrix matrix;
    public MatrixStatistics(IMatrix matrix)
    {
        this.matrix = matrix;
    }
    public void ShowMatrix()
    {
        System.out.print("Матрица:");
        System.out.print("\n");
        for (int i = 0; i < matrix.GetRowsCount(); i++)
        {
            for (int j = 0; j < matrix.GetColsCount(); j++)
            {
                System.out.print(matrix.GetElementFromVector(i,j) + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    public int SumValues()
    {
        int sum = 0;
        for (int i = 0; i < matrix.GetRowsCount(); i++)
        {
            for (int j = 0; j < matrix.GetColsCount(); j++)
            {
                sum += matrix.GetElementFromVector(i,j);
            }
        }
        return sum;
    }
    public double AvgValue()
    {
        int sum = 0;
        for (int i = 0; i < matrix.GetRowsCount(); i++)
        {
            for (int j = 0; j < matrix.GetColsCount(); j++)
            {
                sum += matrix.GetElementFromVector(i,j);
            }
        }
        return sum/matrix.GetRowsCount()*matrix.GetColsCount();
    }
    public int MaxValue()
    {
        int max = 0;
        for (int i = 0; i < matrix.GetRowsCount(); i++)
        {
            for (int j = 0; j < matrix.GetColsCount(); j++)
            {
                if(matrix.GetElementFromVector(i,j) > max)
                {
                    max = matrix.GetElementFromVector(i,j);
                }
            }
        }
        return max;
    }
    public int NonZeroCount()
    {
        int count = 0;
        for (int i = 0; i < matrix.GetRowsCount(); i++)
        {
            for (int j = 0; j < matrix.GetColsCount(); j++)
            {
                if (matrix.GetElementFromVector(i,j) != 0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
