package Sieve_Of_Eratosthenes;

import java.util.Scanner;
public class Prime_Factorisation {
    public static void primeFactor(int n){
        int [] spf = new int[n+2];
        for (int i = 2; i < spf.length; i++){
            spf[i] = i;
        }
        for (int i = 2; i <= n; i++){
            if (spf[i] == i){
                for (int j = i * i; j <= n; j += i){
                    if (spf[j] == j){
                        spf[j] = i;
                    }
                }
            }
        }
        while(n != 1){
            System.out.print(spf[n] + " ");
            n = n/spf[n];
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        primeFactor(n);
    }
}
