package Recursion;

import java.util.Scanner;

public class PrintSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printSubsequence(str, "");
        sc.close();

    }

    public static void printSubsequence(String ques, String ans){
        if (ques.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        printSubsequence(roq, ans + ch);
        printSubsequence(roq, ans);
    }
}
