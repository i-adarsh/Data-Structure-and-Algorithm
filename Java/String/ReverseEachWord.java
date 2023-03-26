package String;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println(reverseEachWord(str));
        sc.close();
    }

    public static String reverseEachWord(String str){
        StringBuffer s = new StringBuffer(str);
        str = s.reverse().toString();
        String [] rev = str.split(" ");
        StringBuffer reverse = new StringBuffer();
        for (int i = rev.length - 1; i >= 0; i--){
            reverse.append(rev[i]).append(" ");
        }
        return reverse.toString();
    }
}
