import java.util.ArrayList;
import java.util.Arrays;

public class OneGreaterElement{
    public static void main(String [] args){
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(-3, -2, 6, 8, 4, 8, 5));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(2, 3, 10, 7, 3, 10, 2, 10));
        int ans = 0, max = Integer.MIN_VALUE;
        for (int a : l2){
            if (a > max){
                ans = 1;
                max = Math.max(max, a);
            }
            else if (a == max){
                ans++;
            }
        }
        System.out.println("" + ans + " " + l2.size());
        System.out.println("Ans: " + (l2.size() - ans));
    }
}