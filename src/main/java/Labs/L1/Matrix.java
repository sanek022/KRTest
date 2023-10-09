package Labs.L1;

import java.util.ArrayList;

public interface Matrix {
    ArrayList<ArrayList<Integer>> ReadMatrix();
    void WriteMatrix(ArrayList<Vector> vectors);
    int LineNumber();
    int ColumnNumber();
}
