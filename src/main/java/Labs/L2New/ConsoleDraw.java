package Labs.L2New;

public class ConsoleDraw extends DrawPlace {
    private IMatrix matrix;

    ConsoleDraw(IMatrix matrix){
        this.matrix = matrix;
    }

        public void regDraw(){

            MatrixStatistics matrixStatisticsReg = new MatrixStatistics(matrix);
            int maxLength = String.valueOf(matrixStatisticsReg.maxValue()).length();
            System.out.println("Матрица:");
            if(lineIsSelected()){
                for (int i = 0; i < matrix.getRowsCount()*(maxLength +2) + 2; i++) {
                    System.out.print("_");
                }
            }
            System.out.println();
            for (int i = 0; i < matrix.getRowsCount(); i++) {
                if (lineIsSelected()){
                System.out.print("|");
                }else System.out.print("");
                for (int j = 0; j < matrix.getColsCount(); j++) {
                    System.out.print(String.format("%3d ",matrix.getElementFromVector(i,j)));
                }
                if(lineIsSelected()){
                System.out.println("|");
                }else System.out.println();
            }
            if(lineIsSelected()){
                for (int i = 0; i < matrix.getRowsCount()*(maxLength +2) + 2; i++) {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
        public void spDraw(){
            MatrixStatistics matrixStatisticsSp = new MatrixStatistics(matrix);
            int maxLength = String.valueOf(matrixStatisticsSp.maxValue()).length();
            System.out.println("Матрица:");
            if(lineIsSelected()){
                for (int i = 0; i < matrix.getRowsCount()*(maxLength +2) + 2; i++) {
                    System.out.print("_");
                }
            }
            System.out.println();
            for (int i = 0; i < matrix.getRowsCount(); i++) {
                if (lineIsSelected()){
                    System.out.print("|");
                }else System.out.print("");
                for (int j = 0; j < matrix.getColsCount(); j++) {
                    if(matrix.getElementFromVector(i,j) != 0){
                    System.out.print(String.format("%3d ",matrix.getElementFromVector(i,j)));
                    }else{
                        System.out.print(String.format("%3s "," "));
                    }
                }
                if (lineIsSelected()){
                    System.out.println("|");
                }else System.out.println();
            }
            if(lineIsSelected()){
                for (int i = 0; i < matrix.getRowsCount()*(maxLength +2) + 2; i++) {
                    System.out.print("_");
                }
            }
            System.out.println();
    }
}


