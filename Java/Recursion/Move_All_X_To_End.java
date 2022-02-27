package Recursion;

public class Move_All_X_To_End {
    public static String moveAllX(String str){
        if (str.length() == 0){
            return "";
        }
        char ch = str.charAt(0);
        String ans = moveAllX(str.substring(1));
        if (ch == 'x'){
            return (ans +'x');
        }
        else{
            return (ch + ans);
        }
    }
    public static void main(String [] args){
        System.out.println(moveAllX("asfxhadxxadx"));
    }
}

/*
Input : asfxhadxxadx
Output : asfhadadxxxx
*/