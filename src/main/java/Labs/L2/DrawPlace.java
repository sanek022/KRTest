package Labs.L2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawPlace {
    JFrame frame = new JFrame("Matrix");
    private static JCheckBox checkBox = new JCheckBox("Draw line");
    JButton regMatrix = new JButton("RegMatrix");
    JButton spMatrix = new JButton("SpMatrix");
    private static int changer;
    DrawPlace(){
        frame.setSize(750,750);
        regMatrix.setBounds(10,30,100,30);
        spMatrix.setBounds(10,70,100,30);
        checkBox.setBounds(10,110,100,30);
        frame.setLayout(null);
        frame.add(regMatrix); frame.add(spMatrix); frame.add(checkBox);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        regMatrix.addActionListener(a -> {
            //matrixPanel.removeAll();
            ArrayList<JLabel> valueLabels = new ArrayList<>();
            RegularMatrix regularMatrix = new RegularMatrix(5,5);
            try {
                MatrixInitiator.FillMatrix(regularMatrix, 10,23);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
            MatrixStatistics matrixStatisticsReg = new MatrixStatistics(regularMatrix);
            MatrixPanel matrixPanel = new MatrixPanel();
            PanelMaker(matrixPanel);
            matrixPanel.getMatrix(regularMatrix);
            changer = String.valueOf(matrixStatisticsReg.MaxValue()).length();
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

            matrixStatisticsReg.ShowMatrix();
            /*MatrixStatistics matrixStatisticsReg = new MatrixStatistics(regularMatrix);
            matrixStatisticsReg.ShowMatrix();
            matrixStatisticsReg.FullStat();*/
        });
        spMatrix.addActionListener(a -> {
            //matrixPanel.removeAll();
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
            changer = String.valueOf(matrixStatisticsSp.MaxValue()).length();
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
            matrixStatisticsSp.ShowMatrix();
            //matrixStatisticsSp.FullStat();
        });
    }
    public static int getChanger(){
        return changer;
    }
    public static boolean isSelected(){
        return checkBox.isSelected();
    }

    private void PanelMaker(JPanel jPanel){

        jPanel.setBackground(Color.GRAY);
        jPanel.setBounds(10,200,500,500);
        frame.add(jPanel, BorderLayout.CENTER);
        jPanel.setVisible(true);
    }
}
class MatrixPanel extends JPanel{
    int a = 0; int b = 0;
    IMatrix matrix;
    public void getMatrix(IMatrix matrix){
        this.matrix = matrix;
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        if(DrawPlace.isSelected()){
        g2.setColor(Color.black);
        g2.drawRect(97, 200,
                10* DrawPlace.getChanger()* matrix.getColsCount()-1,10*(matrix.getRowsCount()+1));
        }
    }
}

