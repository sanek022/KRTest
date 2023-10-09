package Labs.L1;

import java.util.ArrayList;

public class SparseVector implements Vector{
    ArrayList<Integer> valueList = new ArrayList<>();
    @Override
    public void ReadVector() {
        System.out.println(this.valueList);
    }
    @Override
    public void WriteVector(ArrayList<Integer> arrayList) {
        if(this.valueList.size() == 0){
            this.valueList = arrayList;
        }else {
            for (int i : arrayList){
                this.valueList.add(arrayList.get(i));
            }
        }
    }
    @Override
    public String LengthVector() {
        System.out.println(this.valueList.size());
        return String.valueOf(valueList.size());
    }
}
