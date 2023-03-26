package Recursion;

import java.util.Scanner;

public class PrintKeypadCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ques = sc.next();
        printKeypadCombination(ques, "");
        sc.close();
    }

    static String [] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKeypadCombination(String ques, String ans){
        if (ques.length() == 0){
            System.out.println(ans);
            return;
        }
        
        char ch = ques.charAt(0);
        String ros = ques.substring(1);

        String codeforch = codes[ch - '0'];
        for (int i = 0; i < codeforch.length(); i++){
            char option = codeforch.charAt(i);
            printKeypadCombination(ros, ans + option);
        }

    }
}
