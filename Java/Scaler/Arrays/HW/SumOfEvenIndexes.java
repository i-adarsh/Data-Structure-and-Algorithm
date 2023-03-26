import java.util.ArrayList;
import java.util.Arrays;

public class SumOfEvenIndexes{
    public static void main(String [] args){
        ArrayList<ArrayList<Integer>> queries = new ArrayList<>();
        queries.add(new ArrayList<>(Arrays.asList(2,5)));
        queries.add(new ArrayList<>(Arrays.asList(3,7)));
        queries.add(new ArrayList<>(Arrays.asList(0,7)));
        queries.add(new ArrayList<>(Arrays.asList(7,7)));
        queries.add(new ArrayList<>(Arrays.asList(4,4)));
        
        int [] arr = {3,4,-2,8,6,2,1,3};
        int [] evenSum = new int[arr.length];
        evenSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (i % 2 == 0){
                evenSum[i] = evenSum[i - 1] + arr[i];
            }
            else{
                evenSum[i] = evenSum[i - 1];
            }
        }
        for (int a : evenSum){
            System.out.print(a + " ");
        }
        System.out.println();
        for (ArrayList a : queries){
            int i = (int)(a.get(0));
            int j = (int)(a.get(1));
            if (i == 0){
                System.out.println(evenSum[j]);
            }
            else {
                System.out.println(evenSum[j] - evenSum[i - 1]);
            }
        }
        System.out.println();
    }
}