package Labs.L1;

import java.util.ArrayList;
import java.util.Random;

public class Start {
    public static void main(String[] args) {
        StandardMatrix standardMatrix = new StandardMatrix();
        MatrixInitialization.FillMatrix(standardMatrix, 5, 7);
        standardMatrix.Show();
        standardMatrix.ReadMatrix();
        standardMatrix.ColumnNumber();
        standardMatrix.LineNumber();


        class MatrixStat{
            Matrix m;
            public MatrixStat(Matrix m) {
                this.m = m;
            }
            public void Sum(){
                int sum = 0;
                for (int i = 0; i < m.ReadMatrix().size(); i++) {
                    for (int j = 0; j <  m.ReadMatrix().get(i).size(); j++) {
                        sum +=m.ReadMatrix().get(i).get(j);
                    }
                }
                System.out.println(sum);
            }
            public void MiddleValue(){
                int sum = 0;
                for (int i = 0; i < m.ReadMatrix().size(); i++) {
                    for (int j = 0; j <  m.ReadMatrix().get(i).size(); j++) {
                        sum +=m.ReadMatrix().get(i).get(j);
                    }
                }
                System.out.println(sum/(m.ColumnNumber()*m.LineNumber()));
            }
            public void MaxValue(){
                int max = 0;
                for (int i = 0; i < m.ReadMatrix().size(); i++) {
                    for (int j = 0; j <  m.ReadMatrix().get(i).size(); j++) {
                        if(max < m.ReadMatrix().get(i).get(j))
                            max =m.ReadMatrix().get(i).get(j);
                    }
                }
                System.out.println(max);
            }
        }
      /*  StandardVector sdV = new StandardVector();
        ArrayList <Integer>list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++){
            list.add(random.nextInt(200));
        }
        sdV.WriteVector(list);
        sdV.ReadVector();
        sdV.LengthVector();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(i);
            list2.add(i+10);
            list2.add(null);
        }
        lists.add(list1);  lists.add(list2);
        for (ArrayList<Integer> integers : lists) {
            System.out.println(integers);
        }*/
        MatrixStat matrixStat = new MatrixStat(standardMatrix);
        matrixStat.Sum();
        matrixStat.MaxValue();
        matrixStat.MiddleValue();
    }
}
