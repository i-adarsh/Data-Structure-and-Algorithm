package Recursion_Old;

import java.util.Scanner;

public class CountMazePath {
    public static int countMazePath(int n, int i, int j){
        if (i == n-1 && j == n-1){
            return 1;
        }
        if (i >= n || j >= n){
            return 0;
        }
        return countMazePath(n, i+1, j) + countMazePath(n, i, j+1);
    }

    public static void main(String[] args) {
        System.out.println(countMazePath(3,0,0));
    }
}
