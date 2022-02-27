package Sieve_Of_Eratosthenes;

import java.util.Scanner;

public class Prime_Number {

    public static void sievePrime(int n){
        int [] primes = new int[n+2];
        for (int i = 0; i < primes.length; i++){
            primes[i] = 0;
        }
        // Sieve of Eratosthenes
        for (int i = 2; i <= n; i++){
            if (primes[i] == 0){
                for (int j = i * i; j <= n; j+=i){
                    primes[j] = 1;
                }
            }
        }
        // Printing Prime Numbers
        for(int i = 2; i < n; i++){
            if (primes[i] == 0){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        sievePrime(n);
    }
}
