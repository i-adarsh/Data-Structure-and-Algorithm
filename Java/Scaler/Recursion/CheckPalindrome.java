public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        checkPalindrome(str, 0, str.length()-1);
    }
    static int checkPalindrome(String str, int s, int e){
        if (s > e){
            return 1;
        }
        if (str.charAt(s) == str.charAt(e)){
            return checkPalindrome(str, s+1, e-1);
        }
        return 0;
    }
}
