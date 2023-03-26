package Recursion_Old;

public class Remove_Duplicate {
    public static String removeDuplicate(String str){
        if (str.length() == 0){
            return "";
        }
        char ch = str.charAt(0);
        String ans = removeDuplicate(str.substring(1));
        if (ans.length() >= 1 && ch == ans.charAt(0)){
            return ans;
        }
        return (ch + ans);
    }
    public static void main(String [] args){
        System.out.print(removeDuplicate("aaaabbbeeecdddd"));
    }
}
