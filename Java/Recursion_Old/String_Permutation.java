package Recursion_Old;

public class String_Permutation {
    public static void permutation(String str, String ans){
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i+1);
            permutation(ros, (ans + ch));
        }
    }

    public static void main(String[] args) {
        permutation("ABC", "");
    }
}
