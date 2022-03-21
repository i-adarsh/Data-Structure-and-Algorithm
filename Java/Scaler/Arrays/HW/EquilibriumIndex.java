import java.util.ArrayList;
import java.util.Arrays;

public class EquilibriumIndex{
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(-7,1,5,2,-4,3,0));
        int [] arr = {1, 2, 3, 7, 1, 2, 3};
        // int [] arr = {-7,1,5,2,-4,3,0};
        // int [] arr = {3,-1,2,-1,1,2,1};
        System.out.println(solve(arr));
    }
    static int euilibriumIndex(ArrayList<Integer> A){
        return -1;
    }

    public static int solve(int[] A) {
        int [] pf = new int[A.length];
        int n = A.length;
        int index = 0;
        pf[0] = A[0];
        for (int i = 1; i < A.length; i++){
            pf[i] = pf[i-1] + A[i];
        }
        if(0 == (pf[n - 1] - A[0])){
            return index;    
        }
        for (int i = 1; i < n; i++){
            int left = pf[i-1];
            int right = pf[n - 1] - pf[i];
            if (left == right){
                index = i;
                break;
            }   
        }
        if (index == 0){
            index = -1;
        }
        return index;
    }
}