package Labs.L2New;

import javax.swing.*;
import java.util.ArrayList;

public class PanelDraw extends DrawPlace {
    private static int changer;
  public PanelDraw(){


    }
    public static int getChanger(){
        return changer;
    }
    /*public void regDraw(){

        RegularMatrix regularMatrix = new RegularMatrix(5,5);
        try {
            MatrixInitiator.FillMatrix(regularMatrix, 10,23);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

        ArrayList<JLabel> valueLabels = new ArrayList<>();
        MatrixStatistics matrixStatisticsReg = new MatrixStatistics(regularMatrix);
        MatrixPanel matrixPanel = new MatrixPanel();
        PanelMaker(matrixPanel);
        matrixPanel.getMatrix(regularMatrix);
        changer = String.valueOf(matrixStatisticsReg.maxValue()).length();
        int x = 100;
        int counter = 0;
        for (int i = 0; i < regularMatrix.getRowsCount(); i++) {
            for (int j = 0; j < regularMatrix.getColsCount(); j++) {
                valueLabels.add(new JLabel(String.valueOf(regularMatrix.getElementFromVector(j,i))));
                valueLabels.get(counter).setBounds(x,(200+j*12),50,10);
                counter++;
            }
            x+= changer*10;
        }
        for (JLabel label : valueLabels){
            matrixPanel.add(label);
        }
        matrixPanel.repaint();

       // matrixStatisticsReg.showMatrix();
            *//*MatrixStatistics matrixStatisticsReg = new MatrixStatistics(regularMatrix);
            matrixStatisticsReg.ShowMatrix();
            matrixStatisticsReg.FullStat();*//*
  }
  public void spDraw(){
      ArrayList<JLabel> valueLabels = new ArrayList<>();
      SparseMatrix sparseMatrix = new SparseMatrix(5,5);
      try {
          MatrixInitiator.FillMatrix(sparseMatrix, 17, 20);
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
      MatrixStatistics matrixStatisticsSp = new MatrixStatistics(sparseMatrix);
      MatrixPanel matrixPanel = new MatrixPanel();
      PanelMaker(matrixPanel);
      changer = String.valueOf(matrixStatisticsSp.maxValue()).length();
      int x = 100;
      int counter = 0;
      for (int i = 0; i < sparseMatrix.getRowsCount(); i++) {
          for (int j = 0; j < sparseMatrix.getColsCount(); j++) {
              if((sparseMatrix.getElementFromVector(j,i))!= 0){
                  valueLabels.add(new JLabel(String.valueOf(sparseMatrix.getElementFromVector(j,i))));
                  valueLabels.get(counter).setBounds(x,(200+j*12),50,10);
                  counter++;
              }
          }
          x+=changer * 10;
      }
      matrixPanel.getMatrix(sparseMatrix);
      for (JLabel label : valueLabels){
          matrixPanel.add(label);
      }
      matrixPanel.repaint();
      //matrixStatisticsSp.showMatrix();
      //matrixStatisticsSp.FullStat();

  }*/

}
