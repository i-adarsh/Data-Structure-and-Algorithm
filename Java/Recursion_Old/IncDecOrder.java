package Recursion_Old;

import java.util.Scanner;

public class IncDecOrder {
    public static void decOrder(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        decOrder(n - 1);
    }

    public static void incOrder(int n){
        if ( n == 0){
            return;
        }
        incOrder(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Decreasing Order");
        decOrder(n);
        System.out.println("Increasing Order");
        incOrder(n);
    }
}
