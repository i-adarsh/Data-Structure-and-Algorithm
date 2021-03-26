package Recursion;

import java.util.Scanner;
public class RecursivePower {

    public static int Power(int n, int p){

        if ( p == 0){
            return 1;
        }
        return n * Power(n, p - 1);
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(Power(n, p));
    }
}
