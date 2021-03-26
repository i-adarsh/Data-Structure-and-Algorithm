package Recursion;

import java.util.Scanner;
public class RecursiveFibonacci {

    public static int Fibonacci(int n){
        if (n == 0 || n == 1){
            return n;
        }
        else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    public static void main (String [] args){
        Scanner kb = new Scanner(System.in);
        System.out.println(Fibonacci(kb.nextInt()));
    }
}
