import java.util.ArrayList;
import java.util.Arrays;

public class SubarrayKLeastAverage{
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 7, 90, 20, 10, 50, 40));
        System.out.println(subarrayKLeastAverage(list, 3));
        // Ans 3;
    }
    static int subarrayKLeastAverage(ArrayList<Integer> A, int B){
        int index = 0;
        int sum = 0;
        double ans = Integer.MAX_VALUE;
        for (int i = 0; i < B; i++){
            sum += A.get(i);
        }
        double avg = (double)sum/B;
        ans = Math.min(ans, avg);
        for(int i = 1; i <= (A.size() - B); i++){
            int j = i + B - 1;
            sum = sum - A.get(i-1) + A.get(j);
            avg = (double)sum/B;
            if (ans > avg){
                ans = Math.min(ans, avg);
                index = i;
            }
        }
        return index;
    }
}