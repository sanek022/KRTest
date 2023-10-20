package Labs.L2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawPlace {
    public static JFrame frame = new JFrame("Matrix");
    public static JButton regMatrix = new JButton("RegMatrix");
    public  static JButton spMatrix = new JButton("SpMatrix");
    public  static JCheckBox checkBox = new JCheckBox("Draw line");
    public static JCheckBox consoleBox = new JCheckBox("Console");
    public static JCheckBox panelCheckBox = new JCheckBox("Panel");
    DrawPlace(){
        JPanel panel = new JPanel();
        frame.setSize(1280,1024);
        panel.setBackground(Color.GRAY);
        panel.setBounds(10,200,1000,1000);
        frame.add(panel);
        regMatrix.setBounds(10,30,100,30);
        spMatrix.setBounds(10,70,100,30);
        checkBox.setBounds(10,110,100,30);
        consoleBox.setBounds(210,110,100,30);
        panelCheckBox.setBounds(410,110,100,30);
        frame.setLayout(null);
        frame.add(regMatrix); frame.add(spMatrix); frame.add(checkBox); frame.add(consoleBox);frame.add(panelCheckBox);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setVisible(true);
        frame.setVisible(true);


        regMatrix.addActionListener(a -> {
            panel.removeAll();
            ArrayList<Point> points = new ArrayList<>(4);
            ArrayList<JLabel> valueLabels = new ArrayList<>();
            RegularMatrix regularMatrix = new RegularMatrix(5,5);
            try {
                MatrixInitiator.FillMatrix(regularMatrix, 10,23);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
            int x = 100;
            int counter = 0;
            for (int i = 0; i < regularMatrix.getRowsCount(); i++) {
                for (int j = 0; j < regularMatrix.getColsCount(); j++) {
                    valueLabels.add(new JLabel(String.valueOf(regularMatrix.getElementFromVector(j,i))));
                    valueLabels.get(counter).setBounds(x,(200+j*12),50,10);
                    counter++;
                }
                x+=55;
            }
            for (JLabel label : valueLabels){
                panel.add(label);
                panel.repaint();

            }
            MatrixStatistics matrixStatisticsReg = new MatrixStatistics(regularMatrix);
            matrixStatisticsReg.ShowMatrix();
            /*MatrixStatistics matrixStatisticsReg = new MatrixStatistics(regularMatrix);
            matrixStatisticsReg.ShowMatrix();
            matrixStatisticsReg.FullStat();*/
        });
        spMatrix.addActionListener(a -> {
            panel.removeAll();
            ArrayList<JLabel> valueLabels = new ArrayList<>();
            SparseMatrix sparseMatrix = new SparseMatrix(5,5);
            try {
                MatrixInitiator.FillMatrix(sparseMatrix, 17, 20);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
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
                x+=55;
            }

            for (JLabel label : valueLabels){
                Rectangle rectangle = new Rectangle();

                panel.add(label);
                panel.repaint();
                rectangle.setBounds(100, 200,
                        50* sparseMatrix.getColsCount(),10*sparseMatrix.getRowsCount());

                panel.repaint(rectangle);

            }
            MatrixStatistics matrixStatisticsSp = new MatrixStatistics(sparseMatrix);
            matrixStatisticsSp.ShowMatrix();
            //matrixStatisticsSp.FullStat();
        });
    }
}
class MatrixPanel extends JPanel{
    @Override
    public void paintComponents(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

    }
}

