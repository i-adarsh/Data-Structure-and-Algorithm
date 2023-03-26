import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/*
Given an array A of integers and another non negative integer k, 
find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

 */

public class DiffK2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(11, 85, 100, 44, 3, 32, 96, 72, 93, 76, 67, 93, 63, 5, 10, 45, 99, 35, 13));
        System.out.println(diffPossible(list, 60));
    }
    public static int diffPossible(final List<Integer> A, int B) {
        if (A.size() < 2){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.size(); i++){
            map.put(A.get(i), i);
        }
        for (int i = 0; i < A.size(); i++) {
            if (map.containsKey(A.get(i) + B) && (i != map.get(A.get(i) + B))){
                return 1;
            }
        }
        return 0;
    }
}
