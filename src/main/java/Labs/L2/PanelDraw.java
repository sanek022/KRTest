package Labs.L2;

import javax.swing.*;
import java.util.ArrayList;

public class PanelDraw extends DrawPlace {
    public PanelDraw(){

        ArrayList<JLabel> labels = new ArrayList<>();

        for (int i = 0; i < 10; i++) {


            labels.add(new JLabel("|"));
            labels.get(i).setBounds(10,(200+i*10),10,10);
        }
        ArrayList<JLabel> valueLabels = new ArrayList<>();
        regMatrix.addActionListener(a -> {
            RegularMatrix regularMatrix = new RegularMatrix(5,5);
            try {
                MatrixInitiator.FillMatrix(regularMatrix, 10,23);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
            MatrixStatistics matrixStatisticsReg = new MatrixStatistics(regularMatrix);
            matrixStatisticsReg.ShowMatrix();
            matrixStatisticsReg.FullStat();
           /* int x = 40;
            for (int i = 0; i < regularMatrix.rowsCount; i++) {
                for (int j = 0; j < regularMatrix.colsCount; j++) {
                    valueLabels.add(new JLabel(String.valueOf(regularMatrix.GetElementFromVector(i,j))));
                    valueLabels.get(i).setBounds(x,(200+j*10),10,10);
                }
                    x+=10;
            }
            for (JLabel label : valueLabels){
                frame.add(label);
            }*/

        });

        spMatrix.addActionListener(a -> {
            SparseMatrix sparseMatrix = new SparseMatrix(5,5);
            try {
                MatrixInitiator.FillMatrix(sparseMatrix, 17, 20);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            MatrixStatistics matrixStatisticsSp = new MatrixStatistics(sparseMatrix);
            matrixStatisticsSp.ShowMatrix();
            //matrixStatisticsSp.FullStat();
        });
    }

}
