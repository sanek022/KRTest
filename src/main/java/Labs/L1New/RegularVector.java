package Labs.L1New;

public class RegularVector implements  IVector{
    int dimension;
    @Override
    public int GetDimension() {
        return dimension;
    }

    int[] array;


    public int getValue(int index) {
        return array[index];
    }

    public void setValue(int index, int value) {
        array[index] = value;
    }

    public RegularVector(int dimension)
    {
        this.dimension = dimension;
        array = new int[dimension];
    }
}
