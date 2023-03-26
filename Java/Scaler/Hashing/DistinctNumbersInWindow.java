import java.util.ArrayList;
import java.util.HashMap;

public class DistinctNumbersInWindow {
    public static void main(String[] args) {
        
    }
    public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (B > A.size()){
            return list;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < B; i++){
            if (map.containsKey(A.get(i))){
                int val = map.get(A.get(i));
                val++;
                map.put(A.get(i), val);
            }
            else{
                map.put(A.get(i), 1);
            }
        }
        list.add(map.size());
        for (int i = 0; i < A.size()-B; i++){
            int j = B+i;
            if (map.containsKey(A.get(i))){
                int val = map.get(A.get(i));
                val--;
                if (val <= 0){
                    map.remove(A.get(i));
                }
                else{
                    map.put(A.get(i), val);
                }
            }
            if (map.containsKey(A.get(j))){
                int val = map.get(A.get(j));
                val++;
                map.put(A.get(j), val);
            }
            else{
                map.put(A.get(j), 1);
            }
            list.add(map.size());
        }
        return list;
    }
}
