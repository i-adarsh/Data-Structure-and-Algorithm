import java.io.*;
import java.util.*;

public class CodeGladitor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] s1 = sc.nextLine().split(" ");
        String [] s2 = sc.nextLine().split(" ");
        int c1 = 0;
        int sum1 = Integer.parseInt(s1[1]) + Integer.parseInt(s2[1]);
        c1 = sum1 / 60;
        sum1 = sum1 % 60;
        int sum2 = Integer.parseInt(s1[0]) + Integer.parseInt(s2[0]);
        sum2 = (sum2 + c1) % 24;
        System.out.println(sum2 + " " + sum1);
        
    }

    Scanner sc = new Scanner(System.in);
   int t = sc.nextInt();
   while (t > 0){
      int g = sc.nextInt();
      int n = sc.nextInt();
      int [] price = new int[n];
      for(int i = 0; i < n; i++){
         price[i] = sc.nextInt();
      }
      Arrays.sort(price);
      long sum = 0;
      for(int i = 0; i < g; i++){
         sum += price[i];
      }
      System.out.println(sum);
      t--;
   }
}