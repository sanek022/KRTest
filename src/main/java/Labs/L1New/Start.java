package Labs.L1New;

public class Start {
    public static void main(String[] args) throws Exception {
        SparseMatrix sparseMatrix = new SparseMatrix(5,5);
        RegularMatrix regularMatrix = new RegularMatrix(5,5);
        MatrixInitiator.FillMatrix(sparseMatrix, 17, 20);
        MatrixInitiator.FillMatrix(regularMatrix, 10,23);
        MatrixStatistics matrixStatisticsSp = new MatrixStatistics(sparseMatrix);
        MatrixStatistics matrixStatisticsReg = new MatrixStatistics(regularMatrix);
        matrixStatisticsSp.ShowMatrix();
        matrixStatisticsReg.ShowMatrix();
        matrixStatisticsSp.FullStat();
        matrixStatisticsReg.FullStat();

    }
}
