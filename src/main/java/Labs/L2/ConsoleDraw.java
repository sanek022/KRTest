package Labs.L2;

public class ConsoleDraw extends DrawPlace{

    ConsoleDraw(){}

        public void stDraw(){
            RegularMatrix regularMatrix = new RegularMatrix(5,5);
            try {
                MatrixInitiator.FillMatrix(regularMatrix, 10,23);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
            MatrixStatistics matrixStatisticsReg = new MatrixStatistics(regularMatrix);
            int maxLength = String.valueOf(matrixStatisticsReg.maxValue()).length();
            System.out.println("Матрица:");
            for (int i = 0; i < regularMatrix.getRowsCount()*(maxLength +2) + 2; i++) {
                System.out.print("_");
            }
            for (int i = 0; i < regularMatrix.getRowsCount(); i++) {
                if (lineIsSelected()){
                System.out.print("|");
                }else System.out.print("");
                for (int j = 0; j < regularMatrix.getColsCount(); j++) {
                    System.out.print(String.format("%3d ",regularMatrix.getElementFromVector(i,j)));
                }
                if(lineIsSelected()){
                System.out.println("|");
                }else System.out.println();
            }
            for (int i = 0; i < regularMatrix.getRowsCount()*(maxLength +2) + 2; i++) {
                System.out.print("_");
            }
            System.out.println();


            //matrixStatisticsReg.showMatrix();
            /*MatrixStatistics matrixStatisticsReg = new MatrixStatistics(regularMatrix);
            matrixStatisticsReg.ShowMatrix();
            matrixStatisticsReg.FullStat();*/
        }
        public void spDraw(){

            SparseMatrix sparseMatrix = new SparseMatrix(5,5);
            try {
                MatrixInitiator.FillMatrix(sparseMatrix, 17, 20);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            MatrixStatistics matrixStatisticsSp = new MatrixStatistics(sparseMatrix);
            int maxLength = String.valueOf(matrixStatisticsSp.maxValue()).length();

            System.out.println("Матрица:");
            for (int i = 0; i < sparseMatrix.getRowsCount()*(maxLength +2) + 2; i++) {
                System.out.print("_");
            }
            System.out.println();
            for (int i = 0; i < sparseMatrix.getRowsCount(); i++) {
                if (lineIsSelected()){
                    System.out.print("|");
                }else System.out.print("");
                for (int j = 0; j < sparseMatrix.getColsCount(); j++) {
                    if(sparseMatrix.getElementFromVector(i,j) != 0){
                    System.out.print(String.format("%3d ",sparseMatrix.getElementFromVector(i,j)));
                    }else{
                        System.out.print(String.format("%3s "," "));
                    }
                }
                if (lineIsSelected()){
                    System.out.println("|");
                }
            }
            for (int i = 0; i < sparseMatrix.getRowsCount()*(maxLength +2) + 2; i++) {
                System.out.print("_");
            }
            System.out.println();

            //matrixStatisticsSp.showMatrix();
            //matrixStatisticsSp.FullStat();

    }
}


