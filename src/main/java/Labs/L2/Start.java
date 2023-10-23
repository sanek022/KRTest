package Labs.L2;

public class Start {
    public static void main(String[] args) throws Exception {
        /*SparseMatrix sparseMatrix = new SparseMatrix(5,5);
        RegularMatrix regularMatrix = new RegularMatrix(5,5);
        MatrixInitiator.FillMatrix(sparseMatrix, 17, 20);
        MatrixInitiator.FillMatrix(regularMatrix, 10,23);
        MatrixStatistics matrixStatisticsSp = new MatrixStatistics(sparseMatrix);
        MatrixStatistics matrixStatisticsReg = new MatrixStatistics(regularMatrix);
        matrixStatisticsSp.ShowMatrix();
        matrixStatisticsReg.ShowMatrix();
        matrixStatisticsSp.FullStat();
        matrixStatisticsReg.FullStat();*/
        //DrawPlace drawing = new DrawPlace();
        IMatrix matrix = new RegularMatrix(5,5);
        try {
            MatrixInitiator.FillMatrix(matrix, 10,23);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        MatrixStatistics matrixStatistics = new MatrixStatistics(matrix);
        matrixStatistics.showMatrix();
        
    }
}
