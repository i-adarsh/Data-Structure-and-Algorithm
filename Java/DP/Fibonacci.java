package DP;

import java.util.Scanner;
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fibonacci(n, dp));
        sc.close();
    }
    public static int fibonacci(int n, int [] dp){
        if (n <= 1){
            return n;
        }

        if (dp[n] != -1) return dp[n];

        return dp[n] = fibonacci(n - 2, dp) + fibonacci(n - 1, dp);
    }
}
