package Labs.L1New;

public class Start {
    public static void main(String[] args) throws Exception {
        SparseMatrix ab = new SparseMatrix(5,5);
        RegularMatrix aa = new RegularMatrix(5,5);
        MatrixInitiator.FillMatrix(ab, 17, 20);
        MatrixInitiator.FillMatrix(aa, 10,23);
        MatrixStatistics mm = new MatrixStatistics(aa);
        MatrixStatistics ms = new MatrixStatistics(ab);
        mm.ShowMatrix();
        ms.ShowMatrix();
        System.out.println("Макс. начение: " + mm.MaxValue());
        System.out.println("Сумма всех элементов: " + mm.SumValues());
        System.out.println("Среднее арифметическое по элементам: " + mm.AvgValue());
        System.out.println("Число ненулевых элементов: " + mm.NonZeroCount());
        System.out.println("Макс. начение: " + ms.MaxValue());
        System.out.println("Сумма всех элементов: " + ms.SumValues());
        System.out.println("Среднее арифметическое по элементам: " + ms.AvgValue());
        System.out.println("Число ненулевых элементов: " + ms.NonZeroCount());
    }
}
