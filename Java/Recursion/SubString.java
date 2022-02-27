package Recursion;

public class SubString {
    public static void subString(String str, String ans){
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        subString(ros, ans);
        subString(ros, (ch + ans));
    }
    public static void subStringWithASCII(String str, String ans){
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        subStringWithASCII(ros, ans);
        subStringWithASCII(ros, (ch + ans));
        subStringWithASCII(ros, ((int)ch) + ans);
    }
    public static void main(String [] args){
        System.out.println("Without ASCII");
        subString("AB", "");
        System.out.println("With ASCII");
        subStringWithASCII("AB", "");
    }
}
