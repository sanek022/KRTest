package Labs.L2New;

public abstract class SomeMatrix implements IMatrix {
    private int colsCount, rowsCount;
    protected IVector[] vectors;
    IDrawer drawer;
    protected void drawBorder(int n, int m)
    {
        drawer.drawBorder(n, m);
    }

    protected void drawValues(int val, int n, int m)
    {
       drawer.drawValues(val, n, m);
    }
    public void draw(){
        drawBorder( this.getRowsCount(), this.getColsCount());
        for (int i = 0; i < this.getRowsCount(); i++)
        {
            for (int j = 0; j < this.getColsCount(); j++)
            {
                drawValues( this.getElementFromVector(i, j), i, j);
            }
        }
    }
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

    public SomeMatrix( IDrawer drawer){
        this.drawer = drawer;
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
    public SomeMatrix(int rows, int cols, IDrawer drawer)
    {
        this.colsCount = cols;
        this.rowsCount = rows;
        this.drawer = drawer;
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
    public RegularMatrix( IDrawer drawer)  {super( drawer); }
    public RegularMatrix(int rows, int cols, IDrawer drawer){super(rows, cols, drawer);}
    public IVector create(int size){ return new RegularVector(size);}


}
class SparseMatrix extends SomeMatrix {
    public SparseMatrix(int rows, int cols)  { super(rows, cols);}
    public SparseMatrix(int rows, int cols, IDrawer drawer){super(rows, cols, drawer);}
    public SparseMatrix(IDrawer drawer)  { super(drawer);}
    public IVector create(int size) {return new SparseVector(size);}
}

