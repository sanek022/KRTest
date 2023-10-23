package Labs.L2;

import javax.swing.*;
import java.awt.*;

public class DrawPlace {
    static final JFrame frame = new JFrame("Matrix");
    private static JCheckBox lineCheckBox = new JCheckBox("Draw line");
    private static JCheckBox consoleCheck = new JCheckBox("Console");
    private static JCheckBox panelCheck = new JCheckBox("Panel");

    DrawPlace(){
        JButton regMatrix = new JButton("RegMatrix");
        JButton spMatrix = new JButton("SpMatrix");
        frame.setSize(750,750);
        regMatrix.setBounds(10,30,100,30);
        spMatrix.setBounds(10,70,100,30);
        lineCheckBox.setBounds(10,110,100,30);
        consoleCheck.setBounds(150,110,100,30);
        panelCheck.setBounds(300,110,100,30);
        frame.setLayout(null);
        frame.add(regMatrix); frame.add(spMatrix); frame.add(lineCheckBox);frame.add(consoleCheck);frame.add(panelCheck);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        regMatrix.addActionListener(a -> {
            if(consoleCheck.isSelected()){
                ConsoleDraw consoleDraw = new ConsoleDraw();
                consoleDraw.stDraw();
            }
            if(panelCheck.isSelected()){
            PanelDraw panelDraw = new PanelDraw();
            panelDraw.stDraw();
            }
            //matrixPanel.removeAll();

        });
        spMatrix.addActionListener(a -> {
            if(consoleCheck.isSelected()){
                ConsoleDraw consoleDraw = new ConsoleDraw();
                consoleDraw.spDraw();
            }
            if(panelCheck.isSelected()){
            PanelDraw panelDraw = new PanelDraw();
            panelDraw.spDraw();
            }
            //matrixPanel.removeAll();

        });
    }

    public static boolean lineIsSelected(){
        return lineCheckBox.isSelected();
    }


    public void PanelMaker(JPanel jPanel){
        jPanel.setBackground(Color.GRAY);
        jPanel.setBounds(10,200,500,500);
        jPanel.setVisible(true);
        frame.add(jPanel);

    }
}
class MatrixPanel extends JPanel{
    IMatrix matrix;
    public void getMatrix(IMatrix matrix){
        this.matrix = matrix;
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        if(DrawPlace.lineIsSelected()){
        g2.setColor(Color.black);
        g2.drawRect(97, 200,
                10* PanelDraw.getChanger()* matrix.getColsCount()-1,10*(matrix.getRowsCount()+1));
        }
    }
}

