package Recursion;

public class Keypad {
    static String [] keypadArr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void keypad(String str, String ans){
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String code = keypadArr[ch-'0'];
        String ros = str.substring(1);

        for(int i = 0; i < code.length(); i++){
            keypad(ros, ans + code.charAt(i));
        }
    }

    public static void main(String[] args) {
        keypad("23", "");
    }
}
