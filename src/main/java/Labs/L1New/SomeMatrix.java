package Labs.L1New;

public abstract class SomeMatrix implements IMatrix {
    int colsCount, rowsCount;
    protected IVector[] vectors;//???
    public int GetColsCount(){
        return colsCount;
    }
    public int GetRowsCount(){
        return rowsCount;
    }

    public int GetElementFromVector(int row, int col){
        return vectors[row].getValue(col);
    }
    public void SetElementInVector(int row, int col, int value){
        vectors[row].setValue(col, value);
    }

    public SomeMatrix(int rows, int cols)
    {
        this.colsCount = cols;
        this.rowsCount = rows;
        vectors = new IVector[rows];
        for (int i = 0; i < rows; i++)
        {
            vectors[i]/*вторая скобка?*/ = create(cols);
        }
    }
    public abstract IVector create(int size);
}
class RegularMatrix extends SomeMatrix {
public RegularMatrix(int rows, int cols)  {super(rows, cols); }
public  IVector create(int size){ return new RegularVector(size);}//???


}
class SparseMatrix extends SomeMatrix {
    public SparseMatrix(int rows, int cols)  { super(rows, cols);}
    public  IVector create(int size) {return new SparseVector(size);}//???
}

