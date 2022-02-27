package Questions;

import java.util.Scanner;
public class Longest_Arithmetic_Subarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int lengthMax = 1, counter = 1;
        int previousDiff = Integer.MIN_VALUE;
        for (int i = 0; i < n-1; i++){
            int diff = arr[i] - arr[i+1];
            if(diff != previousDiff){
                previousDiff = diff;
                lengthMax = Math.max(lengthMax, counter);
            }
            else {
                counter++;
            }
        }

        // Another Method
        {
            int ans = 2;
            int pd = arr[1]-arr[0];
            int j = 2;
            int curr = 2;
            while(j < n){
                if (pd == arr[j]-arr[j-1]){
                    curr++;
                }
                else {
                    pd = arr[j] - arr[j-1];
                    curr = 2;
                }
                ans = Math.max(ans, curr);
                j++;
            }
            System.out.println(ans);
        }
        System.out.println("Longest_Arithmetic_Subarray : "+lengthMax);
    }
}
