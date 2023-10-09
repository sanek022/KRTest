package Labs.L1;

import java.util.ArrayList;

public abstract class AnyMatrix implements Matrix {
    ArrayList<Vector> vectors = new ArrayList<>();
    @Override
    public void ReadMatrix() {
        for (Vector vector : vectors) {
            vector.ReadVector();
        }
    }

    @Override
    public void WriteMatrix(ArrayList<Vector> vectors) {
        for (int i = 0; i < vectors.size(); i++) {
            this.vectors = vectors;
        }
    }

    @Override
    public void LineNumber() {
        int max = 0;
        for (Vector vector: vectors) {
           if(Integer.parseInt(vector.LengthVector()) > max){
               max = Integer.parseInt(vector.LengthVector());
           }
        }
        System.out.println(max);
    }

    @Override
    public void ColumnNumber() {
        System.out.println(vectors.size());
    }
}
