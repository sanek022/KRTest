package Labs.L2;

public abstract class SomeMatrix implements IMatrix {
    private int colsCount, rowsCount;
    protected IVector[] vectors;
    public int getColsCount(){
        return colsCount;
    }
    public int getRowsCount(){
        return rowsCount;
    }

    public int getElementFromVector(int row, int col){
        return vectors[row].getValue(col);
    }
    public void setElementInVector(int row, int col, int value){
        vectors[row].setValue(col, value);
    }

    public SomeMatrix(int rows, int cols)
    {
        this.colsCount = cols;
        this.rowsCount = rows;
        vectors = new IVector[rows];
        for (int i = 0; i < rows; i++)
        {
            vectors[i]= create(cols);
        }
    }
    public abstract IVector create(int size);
}
class RegularMatrix extends SomeMatrix {
public RegularMatrix(int rows, int cols)  {super(rows, cols); }
public IVector create(int size){ return new RegularVector(size);}


}
class SparseMatrix extends SomeMatrix {
    public SparseMatrix(int rows, int cols)  { super(rows, cols);}
    public IVector create(int size) {return new SparseVector(size);}
}

