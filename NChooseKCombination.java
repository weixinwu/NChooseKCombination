
import java.util.ArrayList;

/**
 * Created by weixinwu on 2016-08-05.
 * How to use this class:
 * create a NChooseKGenerator instance
 * NChooseKGenerator returns a 2D arrayList that contains all the possible size '$k' combinations from array '$left';
 */
public class NChooseKGenerator {

    private ArrayList<ArrayList<String>> resultArrayList;

    public NChooseKGenerator(){
        resultArrayList = new ArrayList<ArrayList<String>>();
    }

    //choose k params from left array, return a arraylist contains all the combination with size equal to k
    public ArrayList<ArrayList<String>> NchooseKGenerator(ArrayList<String>left,int k){
        ArrayList<String> curr = new ArrayList<String>();
        _NchooseKGenerator(curr,left,k);
        return this.resultArrayList;
    }
    private void _NchooseKGenerator(ArrayList<String> curr, ArrayList<String> left,int k){
        ArrayList<String> tempLeft = new ArrayList<String>(left);
        if (curr.size()==k){
            resultArrayList.add(curr);
        }
        else {
            int size = tempLeft.size();
            for (int i = 0; i < size;i++){
                ArrayList<String> tempCurr = new ArrayList<String>(curr);
                //add the next node to the list
                tempCurr.add(left.get(0));
                left  = new ArrayList<String>(tempLeft.subList(i+1,tempLeft.size()));
                _NchooseKGenerator(tempCurr,left,k);
            }
        }
    }
//    public ArrayList<ArrayList<String>> duplicateEliminator(ArrayList<ArrayList<String>> al){
//        ArrayList<String> temp;
//        int length = al.size();
//        String key,value;
//        for (int i = 0 ; i < length;i++){
//            temp = al.get(i);
//
//
//                key = value.substring(0,value.indexOf('='));
//
//
//
//        }
//        return al;
//    }
    public boolean contains(ArrayList<String> al, String seq){
        if (al.size() < 2)
            return false;
        int size = al.size();
        String key,match;
        for (int i = 0 ; i < size; i ++){
            key = al.get(i);
            match = key.substring(0,key.indexOf('='));

            for (int j = i+1;j < size;j++){

            }
        }
        return false;
    }
}
