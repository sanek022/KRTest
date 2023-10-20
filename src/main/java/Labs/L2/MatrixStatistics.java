package Labs.L2;

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
        for (int i = 0; i < matrix.getRowsCount(); i++)
        {
            for (int j = 0; j < matrix.getColsCount(); j++)
            {
                System.out.print(matrix.getElementFromVector(i,j) + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    public int SumValues()
    {
        int sum = 0;
        for (int i = 0; i < matrix.getRowsCount(); i++)
        {
            for (int j = 0; j < matrix.getColsCount(); j++)
            {
                sum += matrix.getElementFromVector(i,j);
            }
        }
        return sum;
    }
    public double AvgValue()
    {
        int sum = 0;
        for (int i = 0; i < matrix.getRowsCount(); i++)
        {
            for (int j = 0; j < matrix.getColsCount(); j++)
            {
                sum += matrix.getElementFromVector(i,j);
            }
        }
        return sum/matrix.getRowsCount()*matrix.getColsCount();
    }
    public int MaxValue()
    {
        int max = 0;
        for (int i = 0; i < matrix.getRowsCount(); i++)
        {
            for (int j = 0; j < matrix.getColsCount(); j++)
            {
                if(matrix.getElementFromVector(i,j) > max)
                {
                    max = matrix.getElementFromVector(i,j);
                }
            }
        }
        return max;
    }
    public int NonZeroCount()
    {
        int count = 0;
        for (int i = 0; i < matrix.getRowsCount(); i++)
        {
            for (int j = 0; j < matrix.getColsCount(); j++)
            {
                if (matrix.getElementFromVector(i,j) != 0)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public void FullStat(){
        System.out.println("Макс. начение: " + MaxValue());
        System.out.println("Сумма всех элементов: " + SumValues());
        System.out.println("Среднее арифметическое по элементам: " + AvgValue());
        System.out.println("Число ненулевых элементов: " + NonZeroCount());
    }
}
