package Recursion_Old;

import java.util.Scanner;
public class RecursiveSum {

    public static int Sum(int n){
        if (n == 0){
            return 0;
        }
        return n + Sum(n - 1);
    }

    public static void main (String [] args){

        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        System.out.println(Sum(a));
    }
}
