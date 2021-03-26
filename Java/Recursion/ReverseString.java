package Recursion;

import java.util.Scanner;
public class ReverseString {
    public static void reverseString(String str){
        if (str.length() == 0){
            return;
        }
        reverseString(str.substring(1));
        System.out.print(str.charAt(0));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverseString(sc.nextLine());
    }
}
