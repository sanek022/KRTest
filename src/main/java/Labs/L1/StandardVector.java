package Labs.L1;

import java.util.ArrayList;

public class StandardVector implements Vector {
    ArrayList<Integer> valueList = new ArrayList<>();



    @Override
    public void ReadVector() {
        System.out.println(valueList);
    }

    @Override
    public void WriteVector(ArrayList<Integer> arrayList) {
       if(valueList.size() == 0){
           valueList = arrayList;
       }else {
           for (int i : arrayList){
           valueList.add(arrayList.get(i));
           }
       }
    }

    @Override
    public String LengthVector() {
        //System.out.println(this.valueList.size());
        return String.valueOf(valueList.size());
    }
}
