import java.util.ArrayList;
import java.util.Arrays;

public class SubarrayLeastAverage{
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11));
        System.out.println(solve(list, 9));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        float avg = Integer.MAX_VALUE;
        int sum = 0, count = 0, index = 0;
        for (int i = 0; i < B; i++){
            sum += A.get(i);
        }
        avg = ((float)sum / B);
        for (int i = 1; i <= (A.size() - B); i++){
            int j = (i + B - 1);
            sum = sum - A.get(i - 1) + (A.get(j));
            System.out.println("i : " + i + " avg : " + avg + " sum : " + sum);
            if (avg > ((float)sum / B)){
                avg = ((float)sum / B);
                index = i;
            }
        }
        return (index);
    }
}