package Recursion;

import java.util.Scanner;
public class TagretSumSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        printTagretSumSubsets(arr, 0, "", 0, target);
        sc.close();
    }

    public static void printTagretSumSubsets(int [] arr, int idx, String set, int sos, int tar){
        // sos -> Sum Of Set
        if (idx == arr.length){
            if (sos == tar){
                System.out.println(set);
            }
            return;
        }
        printTagretSumSubsets(arr, idx + 1, set + arr[idx] + ",", sos + arr[idx], tar);
        printTagretSumSubsets(arr, idx + 1, set, sos, tar);
    }
}
