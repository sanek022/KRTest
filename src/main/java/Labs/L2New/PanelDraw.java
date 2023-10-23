package Labs.L2New;

import javax.swing.*;
import java.util.ArrayList;

public class PanelDraw extends DrawPlace {
    private static int changer;
     private IMatrix matrix;
  public PanelDraw(IMatrix matrix){
        this.matrix = matrix;

    }
    public static int getChanger(){
        return changer;
    }
    public void regDraw(){

        
        ArrayList<JLabel> valueLabels = new ArrayList<>();
        MatrixStatistics matrixStatisticsReg = new MatrixStatistics(matrix);
        MatrixPanel matrixPanel = new MatrixPanel();
        PanelMaker(matrixPanel);
        matrixPanel.getMatrix(matrix);
        changer = String.valueOf(matrixStatisticsReg.maxValue()).length();
        int x = 100;
        int counter = 0;
        for (int i = 0; i < matrix.getRowsCount(); i++) {
            for (int j = 0; j < matrix.getColsCount(); j++) {
                valueLabels.add(new JLabel(String.valueOf(matrix.getElementFromVector(j,i))));
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
            /*MatrixStatistics matrixStatisticsReg = new MatrixStatistics(regularMatrix);
            matrixStatisticsReg.ShowMatrix();
            matrixStatisticsReg.FullStat();*/
  }
  public void spDraw(){
      ArrayList<JLabel> valueLabels = new ArrayList<>();
      
      MatrixStatistics matrixStatisticsSp = new MatrixStatistics(matrix);
      MatrixPanel matrixPanel = new MatrixPanel();
      PanelMaker(matrixPanel);
      changer = String.valueOf(matrixStatisticsSp.maxValue()).length();
      int x = 100;
      int counter = 0;
      for (int i = 0; i < matrix.getRowsCount(); i++) {
          for (int j = 0; j < matrix.getColsCount(); j++) {
              if((matrix.getElementFromVector(j,i))!= 0){
                  valueLabels.add(new JLabel(String.valueOf(matrix.getElementFromVector(j,i))));
                  valueLabels.get(counter).setBounds(x,(200+j*12),50,10);
                  counter++;
              }
          }
          x+=changer * 10;
      }
      matrixPanel.getMatrix(matrix);
      for (JLabel label : valueLabels){
          matrixPanel.add(label);
      }
      matrixPanel.repaint();
      //matrixStatisticsSp.showMatrix();
      //matrixStatisticsSp.FullStat();

  }

}
