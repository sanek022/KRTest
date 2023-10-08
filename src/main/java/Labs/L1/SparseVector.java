package Labs.L1;

import java.util.ArrayList;

public class SparseVector implements Vector{
    @Override
    public void ReadVector(ArrayList arrayList) {
        System.out.println(arrayList);
    }
    @Override
    public void LengthVector(ArrayList arrayList) {
        System.out.println(arrayList.size());
    }

    @Override
    public void WriteVector(ArrayList<Integer> arrayList, int a) {
        ArrayList <Integer>arrayList1 = new ArrayList();
        arrayList.add(a);
        //arrayList.add(arrayList1);
    }
}
