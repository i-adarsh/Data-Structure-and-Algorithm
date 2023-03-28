package String;

import java.util.Scanner;
import java.util.*;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        // System.out.println(reverseEachWord(str));
        // System.out.println(reverseWords(str));
        long [] A = {1,2,5,4,0};
        long [] B = {2,4,5,0,1};
        check(A, B, 5);
        sc.close();
    }

    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++){
            map.put(A[i], 1);
        }
        
        for (int i = 0; i < N; i++){
            map.remove(B[i]);
        }
        if (map.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static String reverseWords(String S)
    {
        // System.out.println(S);
        String [] rev = S.split("[.]", 0);
        System.out.println(rev.length);
        StringBuffer reverse = new StringBuffer();
        for (int i = rev.length - 1; i >= 0; i--){
            StringBuffer s = new StringBuffer(rev[i]);
            if (i == 0){
                reverse.append(s);
            }
            else{
                reverse.append(s).append(".");
            }
            
        }
        return reverse.toString();
    }

    // public static String reverseEachWord(String str){
    //     StringBuffer s = new StringBuffer(str);
    //     str = s.reverse().toString();
    //     String [] rev = str.split(" ");
    //     StringBuffer reverse = new StringBuffer();
    //     for (int i = rev.length - 1; i >= 0; i--){
    //         reverse.append(rev[i]).append(" ");
    //     }
    //     return reverse.toString();
    // }
}
