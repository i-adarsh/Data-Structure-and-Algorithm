package Subarray;

import java.util.Scanner;
public class Pair_Sum {

    public static boolean pairSum(int [] arr, int n,  int k) {
        int low = 0;
        int high = n - 1;

        while (low < high){
            if (arr[low] + arr[high] == k){
                System.out.println(low + " " + high);
                return true;
            }
            else if (arr[low] + arr[high] > k){
                high --;
            }
            else{
                low++;
            }
        }
        return false;
    }

    public static void main(String [] args) {
        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
        int [] arr = {2,4,7,11,14,16,20,21};
        int k = 31;
        System.out.println(pairSum(arr, 8, k));;
    }
}
