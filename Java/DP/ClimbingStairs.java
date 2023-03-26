package DP;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(climbingStairs(n, dp));
        sc.close();
    }

    public static int climbingStairs(int n, int [] dp){
        if (n < 0){
            return 0;
        }
        if (n == 0){
            return 1;
        }
        
        if (dp[n] != -1) return dp[n];

        return dp[n] = climbingStairs(n - 1, dp) + climbingStairs(n - 2, dp);
    }
}
