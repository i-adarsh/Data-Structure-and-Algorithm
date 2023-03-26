import java.util.ArrayList;
import java.util.Arrays;

public class SumOfAllOddIndexInGivenRange{
    public static void main(String [] args) {
        // int [] arr = {-3, -1, 8, 2, 4, 5};
        int [] arr = {4,3,2,7,6,-2};
        int [] oddSum = new int[arr.length];
        int [] evenSum = new int[arr.length];
        oddSum[0] = 0;
        evenSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (i % 2 == 0){
                evenSum[i] = evenSum[i - 1] + arr[i];
                oddSum[i] = oddSum[i-1];
            }
            else{
                evenSum[i] = evenSum[i-1];
                oddSum[i] = oddSum[i-1] + arr[i];
            }
        }
        for (int a : evenSum){
            System.out.print(a + " ");
        }
        System.out.println();

        for (int a : oddSum){
            System.out.print(a + " ");
        }
        System.out.println();
        int count = 0;
        ArrayList<Integer> queries = new ArrayList<Integer>(Arrays.asList(0,1,2,3));
        for (int i = 0; i < queries.size(); i++){
            int j = queries.get(i);
            if (j == 0){
                int ans = getSum(evenSum, queries.get(i) + 1, evenSum.length - 1);
                System.out.println("Odd Sum: " + ans);
                int eans = getSum(oddSum, queries.get(i) + 1, oddSum.length - 1);
                System.out.println("Even Sum: " + eans);
                if (ans == eans){
                    count++;
                }
            }
            else{
                int ans = getSum(oddSum, 0, queries.get(i)) + getSum(evenSum, queries.get(i) + 1, evenSum.length - 1);
                System.out.println("Odd Sum: " + ans);
                int eans = getSum(evenSum, 0, queries.get(i)) + getSum(oddSum, queries.get(i) + 1, oddSum.length - 1);
                System.out.println("Even Sum: " + eans);
                if (ans == eans){
                    count++;
                }
            }
        }
        System.out.println("Special Index: " + count);

    }

    static int getSum(int [] arr, int i, int j){
        if (i == 0){
            return arr[j - 1];
        }
        else {
            return (arr[j] - arr[i - 1]);
        }
    }
}