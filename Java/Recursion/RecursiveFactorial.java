package Recursion;

import java.util.Scanner;
public class RecursiveFactorial {

    public static int Factorial(int n){
        if ( n == 0){
            return 1;
        }
        return n * Factorial(n - 1);
    }

    public static void main(String [] args){

        Scanner kb = new Scanner(System.in);
        System.out.println(Factorial(kb.nextInt()));
    }
}
