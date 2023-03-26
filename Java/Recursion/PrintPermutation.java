package Recursion;

import java.util.Scanner;

public class PrintPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutation(str, "");
        sc.close();
    }
    public static void printPermutation(String str, String  asf){
        if (str.length() == 0){
            System.out.println(asf);
            return;
        }

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String roqr = str.substring(0, i);
            String roql = str.substring(i + 1);
            String roq = roqr + roql;
            printPermutation(roq, asf + ch);
        }

    }
}
