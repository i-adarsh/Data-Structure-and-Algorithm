package Subarray;

import java.util.Scanner;

// Max  Subarray Sum = Total sum of Array - Sum of non-contributing elements

public class Maximum_Circular_Subarray_Sum {

    public static int Kadane (int[]arr, int n){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < n; i++){
            currentSum += arr[i];
            if (currentSum < 0){
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int wrapSum = 0;
        int nonWrapSum = 0;

        nonWrapSum = Kadane(arr, n);
        int totalSum = 0;
        for (int i = 0; i < n; i++){
            totalSum += arr[i];
            arr[i] = -arr[i];
        }
        wrapSum = totalSum + Kadane(arr, n);

        System.out.println(Math.max(wrapSum, nonWrapSum));
    }
}
