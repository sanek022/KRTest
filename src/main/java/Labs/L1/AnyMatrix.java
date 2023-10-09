package Labs.L1;

import java.util.ArrayList;

public abstract class AnyMatrix implements Matrix {
    ArrayList<Vector> vectors = new ArrayList<>();
    public void Show(){
        for (Vector vector : vectors) {
            System.out.println(vector.ReadVector());
        }
    }
    @Override
    public ArrayList<ArrayList<Integer>> ReadMatrix() {
        ArrayList<ArrayList<Integer>> list =  new ArrayList<>();
        for (Vector vector : vectors) {
              list.add(vector.ReadVector());
        }
        return list;
    }

    @Override
    public void WriteMatrix(ArrayList<Vector> vectors) {
        for (int i = 0; i < vectors.size(); i++) {
            this.vectors = vectors;
        }
    }

    @Override
    public int LineNumber() {
        int max = 0;
        for (Vector vector: vectors) {
           if(Integer.parseInt(vector.LengthVector()) > max){
               max = Integer.parseInt(vector.LengthVector());
           }
        }
        System.out.println(max);
        return max;
    }

    @Override
    public int ColumnNumber() {
        System.out.println(vectors.size());
        return vectors.size();
    }
}
