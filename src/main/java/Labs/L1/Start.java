package Labs.L1;

import java.util.ArrayList;
import java.util.Random;

public class Start {
    public static void main(String[] args) {
        StandardMatrix standardMatrix = new StandardMatrix();
        MatrixInitialization.FillMatrix(standardMatrix, 5, 9);
        standardMatrix.Show();
        MatrixStat matrixStat = new MatrixStat(standardMatrix);
        matrixStat.Do();



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

    }
}
