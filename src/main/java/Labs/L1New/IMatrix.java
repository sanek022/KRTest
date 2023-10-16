package Labs.L1New;

public interface IMatrix {
    public int GetColsCount();
    public int GetRowsCount();

    public int GetElementFromVector(int row, int col);
    public void SetElementInVector(int row, int col, int value);

}
