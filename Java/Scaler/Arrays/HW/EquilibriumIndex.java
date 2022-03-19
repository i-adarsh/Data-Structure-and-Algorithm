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
        int count = 0;
        int [] left = new int[A.length];
        int [] right = new int[A.length];
        for (int i = 0; i < A.length; i++){
            if (i == 0){
                left[i] = 0;
            }
            else {
                left[i] = left[i - 1] + A[i - 1];
            }
        }
        for (int i = A.length - 1; i >= 0; i--){
            if (i == A.length - 1){
                right[A.length - 1] = 0;
            }
            else{
                right[i] = right[i+1] + A[i+1];
            }
        }
        for (int j = 0; j < A.length; j++){
            System.out.print(left[j] + " ");
        }
        System.out.println();
        for (int j = 0; j < A.length; j++){
            System.out.print(right[j] + " ");
        }
        System.out.println();
        for (int i = 0; i < A.length; i++){
            if (left[i] == right[i]){
                count++;
            }
        }
        return count;
    }
}