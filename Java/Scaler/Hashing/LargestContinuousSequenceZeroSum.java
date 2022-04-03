
import java.util.*;

public class LargestContinuousSequenceZeroSum{
    public static void main(String [] args){
        ArrayList<Integer> res = lszero(new ArrayList<Integer>(Arrays.asList(-8, 8, -1, -16, -28, -27, 15, -14, 14, -27, -5, -6, -25, -11, 28, 29, -3, -25, 17, -25, 4, -20, 2, 1, -17, -10, -25)));
        // ArrayList<Integer> res = lszero(new ArrayList<Integer>(Arrays.asList(1, 2, -2, 4, -4)));
        System.out.println("Result");
        for (int a : res){
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> lszero(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int [] arr = new int[A.size()];
        arr[0] = A.get(0);
        for (int i = 1; i < A.size(); i++){
            arr[i] = arr[i - 1] + A.get(i);
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int x = 0, y = 0;
        int len = Integer.MIN_VALUE;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                int a = 0;
                int b = i;
                if (len < (b-a+1)){
                    len = (b-a+1);
                    x = a;
                    y = b;
                }
                flag = true;
            }
            else if (map.containsKey(arr[i])){
                int a = map.get(arr[i])+1;
                int b = i;
                if (len < (b-a+1)){
                    len = (b-a+1);
                    x = a;
                    y = b;
                    flag = true;
                }
            }
            else{
                map.put(arr[i], i);
            }
        }
        while(x <= y && flag){
            res.add(A.get(x));
            x++;
        }
        return res;
    }
}