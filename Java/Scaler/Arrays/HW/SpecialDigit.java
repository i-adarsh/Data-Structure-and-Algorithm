import java.util.Scanner;

public class SpecialDigit{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; t > 0; i++){
            String s1 = sc.next();
            String s2 = sc.next();
            int len = lcs(s1.length(), s2.length(), s1, s2);
            if (len == s1.length()){
                System.out.println("Case #"+ i +": "+ (s2.length()-len));
            }
            else{
                System.out.println("Case #"+ i +": IMPOSSIBLE");
            }
            t--;
        }
    }

    static int lcs(int x, int y, String s1, String s2)
    {
        
        int [][] dp = new int[s1.length() + 1][s2.length() + 1];
        
        for(int i=0; i < s1.length()+1; i++){
            for(int j=0; j < s2.length()+1; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[x][y];
    }
}
