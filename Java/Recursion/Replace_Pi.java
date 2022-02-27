package Recursion;

import java.util.Scanner;
public class Replace_Pi {
    public static void replacePi(String str){
        if (str.length() == 0){
            return;
        }
        if (str.charAt(0) == 'p' && str.charAt(1) == 'i'){
            System.out.print("3.14");
            replacePi(str.substring(2));
        }
        else {
            System.out.print(str.charAt(0));
            replacePi(str.substring(1));
        }
    }

    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        replacePi(str);
    }
}

/*

Input :  pippxxppiixipi
Output : 3.14ppxxp3.14ixi3.14

*/
