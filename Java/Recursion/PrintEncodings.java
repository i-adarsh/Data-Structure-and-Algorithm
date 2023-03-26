package Recursion;

import java.util.Scanner;

public class PrintEncodings {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        printEncodings(str, "");
        sc.close();
    }

    public static void printEncodings(String str, String asf){
        if (str.length() == 0){
            System.out.println(asf);
            return;
        }
        else if (str.length() == 1){
            char ch = str.charAt(0);
            if (ch == '0'){
                return;
            }
            else{
                int chv = ch - '0';
                char code = (char)('a' + chv - 1);
                System.out.println(asf + code);
            }
        }
        else{
            char ch = str.charAt(0);
            String roq = str.substring(1);
            if (ch == '0'){
                return;
            }
            else{
                int chv = ch - '0';
                char code = (char)('a' + chv - 1);
                printEncodings(roq, asf + code);
            }

            String ch12 = str.substring(0, 2);
            String roq12 = str.substring(2);
            int ch12v = Integer.parseInt(ch12);
            if (ch12v <= 26){
                char code = (char)('a' + ch12v - 1);
                printEncodings(roq12, asf + code);
            }
        }
    }
}
