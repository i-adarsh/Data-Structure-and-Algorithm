package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class KeypadCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(keypadCombination(str));
        sc.close();
    }
    static String[] codes = {",;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList<String> keypadCombination(String ques){
        if (ques.length() == 0){
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        
        char ch = ques.charAt(0);
        String ros = ques.substring(1);

        ArrayList<String> result =  keypadCombination(ros);
        ArrayList<String> mres = new ArrayList<>();

        String choice = codes[ch - '0'];
        for (int j = 0; j < choice.length(); j++){
            char chv = choice.charAt(j);
            for (String s : result){
                mres.add(chv + s);
            }
        }
        
        return mres;
    }
}
