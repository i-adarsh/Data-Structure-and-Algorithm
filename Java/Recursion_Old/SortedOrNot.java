package Recursion_Old;

public class SortedOrNot {

    public static boolean Sorted(int [] arr, int n){
        // Array has one or no element or the
        // rest are already checked and approved.
        if (n == 0 || n == 1){
            return true;
        }
        // Unsorted pair found (Equal values allowed)
        if (arr[n - 1] < arr[n - 2]){
            return false;
        }
        return Sorted(arr, n-1);
    }

    public static void main(String [] args){
        int [] arr = {1,2,4,5,6,7,8,9};
        System.out.println(Sorted(arr, arr.length));
    }
}
