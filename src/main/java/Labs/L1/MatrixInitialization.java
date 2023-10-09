package Labs.L1;

import java.util.ArrayList;
import java.util.Random;

public class MatrixInitialization {

    public static void FillMatrix(Matrix m, int notNull, int maxValue){
        Random random = new Random();
        ArrayList<Vector> vectors = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            vectors.add(new SparseVector());

            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                list.add(random.nextInt(maxValue));
            }
            vectors.get(i).WriteVector(list);
        }
        m.WriteMatrix(vectors);
       // m.WriteMatrix();
    }
}
